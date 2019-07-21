package com.wmx.op.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.wmx.op.po.News;
import com.wmx.op.po.NewsCustom;
import com.wmx.op.po.Picture;
import com.wmx.op.po.PictureCustom;
import com.wmx.op.po.Uservideo;
import com.wmx.op.po.UservideoCustom;
import com.wmx.op.po.UservideoExample;
import com.wmx.op.service.NewsService;
import com.wmx.op.service.PictureService;
import com.wmx.op.service.ReviewSerivce;
import com.wmx.op.service.UservideoService;

@Controller
public class ReviewController {
	@Autowired
	private ReviewSerivce reviewSerivce;
	@Autowired
	private UservideoService uservideoService;
	@Autowired
	private PictureService pictureService;
	@Autowired
	private NewsService newsService;

	/************************************************************************
	 ************************************************************************
	 ******************************* 视频审核区域*********************************
	 ************************************************************************
	 ************************************************************************
	 */
	/*
	 * 审核分页查询视频列表
	 */
	@RequestMapping(value = "/findvideoStatus", method = RequestMethod.GET)
	public ModelAndView findvideoStatus(HttpServletRequest request,
			HttpSession session) throws Exception {
		UservideoExample example = new UservideoExample();
		UservideoCustom uservideoCustom = new UservideoCustom();
		int pages = 1;// 待显示页数
		int totalpages = 0;// 总页数
		int pagesize = 5;// 每页条数
		int count = reviewSerivce.findcountstatus();// 总条数

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
		List<Uservideo> uservideoList = reviewSerivce
				.findvideBystatus(uservideoCustom);
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
		modelAndView.setViewName("user/manage/reviewManage/videoList");
		return modelAndView;
	}

	/*
	 * 按id查询视频
	 */
	@RequestMapping("/findstatusvideoByid")
	public ModelAndView findvideoByid(HttpServletRequest request,
			@RequestParam("method") int method) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		Uservideo uservideo = uservideoService.findvideoByID(method);
		modelAndView.addObject("uservideo", uservideo);
		modelAndView.setViewName("user/manage/reviewManage/videoone");
		return modelAndView;
	}

	/*
	 * 通过视频
	 */
	@RequestMapping(value = "/passvideoByid", method = RequestMethod.GET)
	public String passvideoByID(HttpServletRequest request,
			HttpSession session, HttpServletResponse response) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		Uservideo uservideo = new Uservideo();
		uservideo.setStstus(1);
		if (dovideo(request, session, uservideo) == 1) {
			return "redirect:/findvideoStatus.action";
		} else {
			modelAndView.addObject("message", "出现错误！！");
			return "failure";
		}
	}

	/*
	 * 驳回视频
	 */
	@RequestMapping(value = "/backvideoByid", method = RequestMethod.GET)
	public String backvideoByid(HttpServletRequest request, HttpSession session)
			throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		Uservideo uservideo = new Uservideo();
		uservideo.setStstus(2);
		if (dovideo(request, session, uservideo) == 1) {
			return "redirect:/findvideoStatus.action";
		} else {
			modelAndView.addObject("message", "出现错误！！");
			return "failure";
		}
	}

	public int dovideo(HttpServletRequest request, HttpSession session,
			Uservideo uservideo) throws Exception {
		String strid = request.getParameter("uservideoid");
		uservideo.setVideoid(Integer.parseInt(strid));
		return reviewSerivce.updatevideo(uservideo);
	}

	/************************************************************************
	 ************************************************************************
	 ******************************* 图片审核区域*********************************
	 ************************************************************************
	 ************************************************************************
	 */
	/*
	 * 未审核分页查询图片列表
	 */
	@RequestMapping(value = "/findpictureStatus", method = RequestMethod.GET)
	public ModelAndView findpictureStatus(HttpServletRequest request,
			HttpSession session) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		PictureCustom pictureCustom = new PictureCustom();
		int pages = 1;// 待显示页数
		int totalpages = 0;// 总页数
		int pagesize = 5;// 每页条数
		pictureCustom.setStatus(0);
		int count = reviewSerivce.findcountstatusPic(pictureCustom);// 总条数

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
		pictureCustom.setPageNo((pages - 1) * pagesize);
		pictureCustom.setPageSize(pagesize);
		List<Picture> userpicList = reviewSerivce
				.findpictureBystatus(pictureCustom);
		// 计算上一页
		int prepages = pages - 1;
		modelAndView.addObject("prepages", prepages);
		// 计算下一页
		int nextpages = pages + 1;
		modelAndView.addObject("nextpages", nextpages);
		modelAndView.addObject("userpicList", userpicList);
		modelAndView.addObject("pages", pages);
		modelAndView.addObject("totalpages", totalpages);
		modelAndView.setViewName("user/manage/reviewManage/pictureList");
		return modelAndView;
	}

	/*
	 * 按id查询图片
	 */
	@RequestMapping("/findstatuspicByid")
	public ModelAndView findstatuspicByid(HttpServletRequest request,
			@RequestParam("method") int method) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		Picture picture = pictureService.findPictureOne(method);
		modelAndView.addObject("picture", picture);
		modelAndView.setViewName("reviewpicone");
		return modelAndView;
	}

	/*
	 * 通过图片
	 */
	@RequestMapping(value = "/passpicByID", method = RequestMethod.GET)
	public String passpicByID(HttpServletRequest request, HttpSession session,
			HttpServletResponse response) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		Picture picture = new Picture();
		picture.setStatus(1);
		int result = dopic(request, session, response, picture);
		if (result == 1) {
			return "redirect:/findpictureStatus.action";
		} else {
			modelAndView.addObject("message", "出现错误！！");
			return "failure";
		}
	}

	/*
	 * 驳回图片
	 */
	@RequestMapping(value = "/backpicByID", method = RequestMethod.GET)
	public String backpicByID(HttpServletRequest request, HttpSession session,
			HttpServletResponse response) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		Picture picture = new Picture();
		picture.setStatus(2);
		int result = dopic(request, session, response, picture);
		if (result == 1) {
			return "redirect:/findpictureStatus.action";
		} else {
			modelAndView.addObject("message", "出现错误！！");
			return "failure";
		}
	}

	/*
	 * 删除图片
	 */
	@RequestMapping(value = "/delpicByID", method = RequestMethod.GET)
	public ModelAndView delpicByID(HttpServletRequest request,
			HttpSession session) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		String strid = request.getParameter("picid");
		int id = Integer.parseInt(strid);
		if (reviewSerivce.delpicByid(id) == 1) {
			modelAndView.addObject("message", "删除成功！！！");
			modelAndView.setViewName("success");
		} else {
			modelAndView.addObject("message", "删除失败！！！");
			modelAndView.setViewName("failure");
		}
		return modelAndView;
	}

	/**
	 * 更新状态
	 */
	public int dopic(HttpServletRequest request, HttpSession session,
			HttpServletResponse respons, Picture picture) throws Exception {
		String strid = request.getParameter("picid");
		int id = Integer.parseInt(strid);
		picture.setPicid(id);
		return reviewSerivce.updatepicture(picture);
	}

	/************************************************************************
	 ************************************************************************
	 ******************************* 文章审核区域*********************************
	 ************************************************************************
	 ************************************************************************
	 */
	/*
	 * 审核分页查询
	 */
	@RequestMapping(value = "/findNewsstatus", method = RequestMethod.GET)
	public ModelAndView findNewsstatus(HttpServletRequest request,
			HttpSession session) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		NewsCustom newsCustom = new NewsCustom();
		int pages = 1;// 待显示页数
		int totalpages = 0;// 总页数
		int pagesize = 5;// 每页条数
		newsCustom.setStatus(0);
		int count = reviewSerivce.findcountstatus();// 总条数

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
		newsCustom.setPageNo((pages - 1) * pagesize);
		newsCustom.setPageSize(pagesize);
		List<News> newsList = reviewSerivce.findNewsBystatus(newsCustom);
		// 计算上一页
		int prepages = pages - 1;
		modelAndView.addObject("prepages", prepages);
		// 计算下一页
		int nextpages = pages + 1;
		modelAndView.addObject("nextpages", nextpages);
		modelAndView.addObject("newsList", newsList);
		modelAndView.addObject("pages", pages);
		modelAndView.addObject("totalpages", totalpages);
		modelAndView.setViewName("user/manage/reviewManage/newsList");
		return modelAndView;
	}

	/*
	 * 审核按id查询
	 */
	@RequestMapping(value = "/findnewsstatusByid", method = RequestMethod.GET)
	public ModelAndView findnewsstatusByid(HttpServletRequest request,
			@RequestParam("method") int id) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		News news = newsService.findNewsDetail(id);
		modelAndView.addObject("news", news);
		modelAndView.setViewName("reviewnews");
		return modelAndView;
	}

	/*
	 * 文章通过审核
	 */
	@RequestMapping("passNewsByid")
	public String passNewsByid(HttpServletRequest request, HttpSession sessions)
			throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		News news = new News();
		news.setStatus(1);
		if (doNews(request, sessions, news) == 1) {
			return "redirect:/findNewsstatus.action";
		} else {
			modelAndView.addObject("message", "出现错误！！");
			return "failure";
		}
	}

	/*
	 * 文章驳回审核
	 */
	@RequestMapping("/backNewsByid")
	public String backNewsByid(HttpServletRequest request, HttpSession sessions)
			throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		News news = new News();
		news.setStatus(2);
		if (doNews(request, sessions, news) == 1) {
			return "redirect:/findNewsstatus.action";
		} else {
			modelAndView.addObject("message", "出现错误！！");
			return "failure";
		}
	}

	/*
	 * 删除文章
	 */
	@RequestMapping("/delNewsByid")
	public String delNewsByid(HttpServletRequest request, HttpSession sessions)
			throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		String strid = request.getParameter("newsid");
		if (reviewSerivce.delNewsByid(Integer.parseInt(strid)) == 1) {
			modelAndView.addObject("message", "出现错误！！");
			return "success";
		} else {
			modelAndView.addObject("message", "出现错误！！");
			return "failure";
		}
	}

	/*
	 * 更新news状态
	 */
	public int doNews(HttpServletRequest request, HttpSession session, News news)
			throws Exception {
		String strid = request.getParameter("newsid");
		news.setNewsid(Integer.parseInt(strid));
		return reviewSerivce.updateNews(news);
	}
}
