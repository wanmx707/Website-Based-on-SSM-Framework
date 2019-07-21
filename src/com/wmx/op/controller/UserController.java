package com.wmx.op.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.wmx.op.po.User;
import com.wmx.op.service.UserService;
import com.wmx.op.util.Sendmail;

@Controller
public class UserController {
	@Autowired
	private UserService userService;

	/*
	 * 登录
	 */
	@RequestMapping("/Login")
	public String finduserlogin(Model model, HttpServletRequest request,
			HttpSession session, User user) throws Exception {
		model.addAttribute("user", user);
		User userlogin = userService.findUserLogin(user);
		if (userlogin != null) {
			if (userlogin.getUsertype() == 0) {
				model.addAttribute("loginmessage", "账户不可用");
				return "login";
			} else {
				session.setAttribute("username", userlogin.getUsername());
				session.setAttribute("userid", userlogin.getUserid());
				session.setAttribute("type", userlogin.getUsertype());
				System.out.println(userlogin.getUserid());
				session.setAttribute("user", userlogin);
				return "redirect:/queryindex.action";
			}
		} else {
			model.addAttribute("loginmessage", "账户或密码错误");
			return "login";
		}
	}

	public void getCookic(HttpServletRequest request, HttpSession session) {
		Cookie[] cs = request.getCookies();
	}

	/*
	 * 注销登录
	 */
	@RequestMapping("/Logout")
	public String findlogout(Model model, HttpServletRequest request,
			HttpSession session) throws Exception {
		session.removeAttribute("username");
		session.removeAttribute("userid");
		session.removeAttribute("user");
		return "redirect:/queryindex.action";
	}

	/*
	 * 修改密码
	 */
	@RequestMapping("/changePassword")
	public String changePassword(User user, @RequestParam("code") Integer code,
			HttpServletRequest request, HttpSession session,Model model) throws Exception {
		int sscode = (int) session.getAttribute("RePasswordcode");
		if(sscode==code){	
			user.setUserid(userService.findIDByEmail(user));
			if(1==userService.changePassword(user)){
				session.removeAttribute("RePasswordcode");
				return "login";
			}else{
				model.addAttribute("result", "修改密码出现错误，请重试！！！");
				return "findPassword";
			}
		}else{
			model.addAttribute("result", "验证码错误，请重试！！！");
			return "findPassword";
		}
	}
	/*
	 * 未登录修改密码发送邮箱验证码
	 */
	@RequestMapping("/getRePasswordCode")
	@ResponseBody
	public Map getRePasswordCode(HttpSession session, @RequestBody Map<String, Object> map)
			throws Exception {
		String email = (String) map.get("email");
		User user = new User();
		user.setUseremail(email);
		if (userService.findmailis(user) == 1) {
			Sendmail s = new Sendmail();
			session.setAttribute("RePasswordcode", s.sendMail(email));
			map.put("answer", "已发送验证码，请查收！");
			return map;
		} else {
			map.put("answer", "邮箱未注册！！！");
			return map;
		}
		// Map<String,Object> map = new HashMap<>();
	}
	/* 注册 */
	@RequestMapping("/register")
	public String finduserRegister(HttpSession session, Model model,
			@Validated User user, BindingResult bindingResult, String code)
			throws Exception {
		System.out.println("code是" + code);
		int result = 0;
		if (code != "") {
			if (0 == userService.findUsername(user)) {
				int usercode = Integer.parseInt(code);
				int userpcode = (int) session.getAttribute("code");
				if (usercode == userpcode) {
					if (bindingResult.hasErrors()) {
						List<ObjectError> allErrors = bindingResult
								.getAllErrors();
						model.addAttribute("allErrors", allErrors);
						return "register";
					} else {
						result = userService.insertUser(user);
					}
				} else {
					model.addAttribute("worng", "验证码错误！！！");
					return "register";
				}
			} else {
				model.addAttribute("usernamewrong", "用户名已被注册，请更换！！！");
				return "register";
			}
		} else {
			model.addAttribute("worng", "请输入验证码！！！");
			return "register";
		}
		if (result != 0) {
			return "login";
		} else {
			model.addAttribute("registermessage", "注册失败，请与管理员联系！！！");
			return "register";
		}
	}

	/* 查询用户信息 */
	@RequestMapping("/findUserInfor")
	public ModelAndView findUserInfor(HttpSession session) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		String userId = session.getAttribute("userid").toString();
		Integer userid = Integer.parseInt(userId);
		User user = userService.findUserInfor(userid);
		if (user != null) {
			System.out.println("用户存在");
			modelAndView.addObject("user", user);
			modelAndView.setViewName("user/manage/userManage/usermanage");
		} else {
			// modelAndView.addObject("loginmessage", "账户或密码错误");
			// modelAndView.setViewName("login");
			System.out.println("用户不存在");
		}
		return modelAndView;
	}

	/* 修改信息 */
	@RequestMapping("/changeInfor")
	public ModelAndView changeUserInfor(HttpServletRequest request,
			HttpSession session, User user,
			@RequestParam(value = "backsex") String backsex,
			@RequestParam(value = "backbirthday") String backDate)
			throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		if (backsex.equals("男")) {
			user.setSex(1);
		} else if (backsex.equals("女")) {
			user.setSex(0);
		}
		user.setBirthday(StringtoDate(backDate));
		// modelAndView.setViewName("index");
		int result = userService.changeUserInfor(user);

		if (result != 0) {
			// user=userService.findUserInfor(user.getUserid());
			modelAndView.setViewName("user/manage/userManage/usermanage");
		}
		return modelAndView;
	}
	/*
	 * 发送邮箱验证码
	 */
	@RequestMapping("/getCode")
	@ResponseBody
	public Map getCode(HttpSession session, @RequestBody Map<String, Object> map)
			throws Exception {
		String email = (String) map.get("email");
		User user = new User();
		user.setUseremail(email);
		if (userService.findmailis(user) == 1) {
			map.put("answer", "该邮箱已被注册请换一个！！！");
			return map;
		} else {
			Sendmail s = new Sendmail();
			session.setAttribute("code", s.sendMail(email));
			map.put("answer", "邮箱可以使用，验证码已发，请查收！！！");
			return map;
		}
	}

	/**
	 * 修改密码之发送验证码
	 * 
	 * @return
	 */
	@RequestMapping("/getpasswordCode")
	public void getpassword(HttpSession session) throws Exception {
		User user = (User) session.getAttribute("user");
		Sendmail s = new Sendmail();
		session.setAttribute("recode", s.sendMail(user.getUseremail()));
	}

	/**
	 * 修改密码
	 * 
	 * @param session
	 * @param user
	 * @param code
	 * @throws Exception
	 */
	@RequestMapping("/setpassword")
	public String setpassword(HttpSession session, User user, String code)
			throws Exception {
		int newcode = Integer.parseInt(code);
		int sscode = (int) session.getAttribute("recode");
		if (newcode == sscode) {
			int result = userService.changePassword(user);
			if (result == 1) {
				session.removeAttribute("user");
				return "login";
			} else {
				return "user/userMangement";
			}
		} else {
			return "user/userMangement";

		}
	}

	// 获取当前时间
	public Date getcurrenttime() {
		Date date = new Date();
		return new Date(date.getTime());
	}

	// Sting转date
	public Date StringtoDate(String s) throws ParseException {
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
		return sf.parse(s);
	}
}
