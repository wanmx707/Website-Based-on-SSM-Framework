package com.wmx.op.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.catalina.startup.Tool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.ModelAndView;

import com.wmx.op.po.News;
import com.wmx.op.po.NewsCustom;
import com.wmx.op.po.NewsExample;
import com.wmx.op.po.Picture;
import com.wmx.op.po.PictureCustom;
import com.wmx.op.po.PictureExample;
import com.wmx.op.po.User;
import com.wmx.op.service.NewsService;
import com.wmx.op.service.UserService;

@Controller
public class writeController {
	@Autowired
	private NewsService newsService;
	@Autowired
	private UserService userService;

	/**
	 * 编辑器图片上传
	 * 
	 * @param filedata
	 *            图片数据
	 * @param map
	 *            返回json
	 * @param request
	 * @param response
	 * @throws IOException
	 */
	@RequestMapping(value = "/upImg", method = { RequestMethod.POST })
	public void upImg(
			@RequestParam(value = "filedata", required = false) MultipartFile filedata,
			Map<String, Object> map, HttpServletRequest request,HttpSession session,
			HttpServletResponse response) throws IOException {
		response.setContentType("text/html; charset=UTF-8");
		String path = request.getSession().getServletContext()
				.getRealPath("/upload");
		String fileName = filedata.getOriginalFilename();
		Calendar calendar = Calendar.getInstance();
		long newFileName = calendar.getTimeInMillis();
		session.setAttribute("uuid", newFileName);
		File targetFile = new File(path, newFileName + "");
		if (!targetFile.exists()) {
			targetFile.mkdirs();
		}
		// 保存
		try {
			filedata.transferTo(targetFile);
			PrintWriter out = response.getWriter();
			String pathName = request.getContextPath() + "/upload/"
					+ newFileName;
			System.out.println(pathName);
			out.println("{\"err\":\"\",\"msg\":\"" + pathName + "\"}");// 这里返回你图片上传路径，返回json到编辑器中，这样编辑器就能及时显示图片内容了
			out.flush();
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * 上传编辑的文章
	 * 
	 * @param elm1
	 *            文章内容
	 * @param title
	 *            标题
	 * @param request
	 * @param session
	 * @param response
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/uploadwrite", method = { RequestMethod.POST })
	public ModelAndView uploadwrite(@Validated News news,
			BindingResult bindingResult, HttpServletRequest request,
			HttpSession session, HttpServletResponse response) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		if (bindingResult.hasErrors()) {
			List<ObjectError> allErrors = bindingResult.getAllErrors();
			modelAndView.addObject("allErrors", allErrors);
			modelAndView.setViewName("user/manage/writeManage/write");
		} else {
			int userid = (int) session.getAttribute("userid");
			long uuid=(long)session.getAttribute("uuid");
			news.setUuid(String.valueOf(uuid));
			news.setUserid(userid);
			news.setWriter(userService.findUserInfor(userid).getUsername());
			news.setAddtime(getcurrenttime());
			if (newsService.insertNewsByuser(news) == 1) {
				modelAndView.addObject("message", "恭喜你，文章上传成功！！！");
				modelAndView.setViewName("success");
			} else {
				modelAndView.addObject("error", "很抱歉，文章上传失败！！！");
				modelAndView.setViewName("failure");
			}
		}

		return modelAndView;
	}

	@RequestMapping(value = "/findWriteByPage", method = RequestMethod.GET)
	public ModelAndView findWriteByPage(HttpServletRequest request,
			HttpSession session, NewsExample example) throws Exception {
		NewsCustom newsCustom = new NewsCustom();
		int pages = 1;// 待显示页数
		int totalpages = 0;// 总页数
		int pagesize = 5;// 每页条数
		int count = newsService.countNews(example);// 总条数
		totalpages = (int) Math.ceil(count / (pagesize * 1.0));// 总页数
		String strPagestart = request.getParameter("pages");
		if (strPagestart == null) {
			pages = 1;
		} else {
			pages = Integer.parseInt(strPagestart);
			if (pages < 1) {
				pages = 1;
			} else if (pages > totalpages) {
				pages = 1;
			}
		}
		int userid = (int) session.getAttribute("userid");
		newsCustom.setUserid(userid);
		newsCustom.setPageNo((pages - 1) * pagesize);
		newsCustom.setPageSize(pagesize);
		List<News> newsList = newsService.findUserNewsbyPage(newsCustom);
		ModelAndView modelAndView = new ModelAndView();
		// 计算上一页
		int prepages = pages - 1;
		modelAndView.addObject("prepages", prepages);
		// 计算下一页
		int nextpages = pages + 1;
		modelAndView.addObject("nextpages", nextpages);
		modelAndView.addObject("newsList", newsList);
		modelAndView.addObject("pages", pages);
		modelAndView.addObject("totalpages", totalpages);
		modelAndView.setViewName("user/manage/writeManage/writeList");

		return modelAndView;
	}

	// 获取当前时间
	public Date getcurrenttime() {
		Date date = new Date();
		return new Date(date.getTime());
	}
}
