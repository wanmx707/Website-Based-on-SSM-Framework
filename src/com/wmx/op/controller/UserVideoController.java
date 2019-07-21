package com.wmx.op.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.wmx.op.po.Uservideo;
import com.wmx.op.po.UservideoCustom;
import com.wmx.op.po.UservideoExample;
import com.wmx.op.service.UservideoService;

@Controller
public class UserVideoController {
	@Autowired
	private UservideoService uservideoService;

	@RequestMapping("/findVideoById")
	public ModelAndView findVideoByID(HttpServletRequest request,
			@RequestParam("method") int videoid) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		Uservideo uservideo = uservideoService.findvideoByID(videoid);
		modelAndView.addObject("uservideo", uservideo);
		modelAndView.setViewName("videoone");
		return modelAndView;
	}

	/*
	 * 主分页查询视频列表
	 */
	@RequestMapping(value = "/findvideoPage", method = RequestMethod.GET)
	public ModelAndView findvideoByPage(HttpServletRequest request,
			HttpSession session) throws Exception {
		UservideoExample example = new UservideoExample();
		UservideoCustom uservideoCustom = new UservideoCustom();
		int pages = 1;// 待显示页数
		int totalpages = 0;// 总页数
		int pagesize = 15;// 每页条数
		int count = uservideoService.findcount(example);// 总条数

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
		uservideoCustom.setPageNo((pages - 1) * pagesize);
		uservideoCustom.setPageSize(pagesize);
		List<Uservideo> uservideoList = uservideoService
				.findvideBypage(uservideoCustom);
		ModelAndView modelAndView = new ModelAndView();
		// 计算上一页
		int prepages = pages - 1;
		modelAndView.addObject("prepages", prepages);
		// 计算下一页
		int nextpages = pages + 1;
		modelAndView.addObject("nextpages", nextpages);
		modelAndView.addObject("uservideoList", uservideoList);
		modelAndView.addObject("pages", pages);
		modelAndView.addObject("totalpages", totalpages);
		modelAndView.setViewName("videoList");
		// List<Uservideo> uservideoList = uploadService
		// .uploadList(uservideoCustom);
		return modelAndView;
	}
	
	/*
	 * 按id查询视频
	 */
	@RequestMapping("/findvideoByid")
	public ModelAndView findvideoByid(HttpServletRequest request,@RequestParam("method")int method) throws Exception{
		ModelAndView modelAndView=new ModelAndView();
		Uservideo uservideo=uservideoService.findvideoByID(method);
		modelAndView.addObject("uservideo", uservideo);
		modelAndView.setViewName("videoone");
		return modelAndView;
	}
}
