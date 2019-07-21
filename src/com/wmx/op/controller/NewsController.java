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

import com.wmx.op.po.Comment;
import com.wmx.op.po.News;
import com.wmx.op.po.NewsCustom;
import com.wmx.op.po.NewsExample;
import com.wmx.op.po.Uservideo;
import com.wmx.op.po.UservideoCustom;
import com.wmx.op.service.NewsService;
@Controller
public class NewsController {
	@Autowired
	private NewsService newsService;

	/*
	 * 列表分页查询分析文章
	 */
	/*@RequestMapping("findNews")
	public ModelAndView findNews(NewsExample news)throws Exception{
		List<News> newsList=newsService.findNews(news);
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("newsList", newsList);
		
		modelAndView.setViewName("fenxiList");
		
		return modelAndView;
	}
	*/
	/*
	 * 分页查询分析文章列表
	 */
	@RequestMapping(value = "/findNews", method = RequestMethod.GET)
	public ModelAndView findvideoByPage(HttpServletRequest request,
			HttpSession session,NewsExample example) throws Exception {
		NewsCustom newsCustom = new NewsCustom();
		int pages = 1;// 待显示页数
		int totalpages = 0;// 总页数
		int pagesize = 10;// 每页条数
		int count=newsService.countNews(example);// 总条数

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
		List<News> newsList = newsService.findNewsbyPage(newsCustom);
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
		modelAndView.setViewName("fenxiList");
		
		return modelAndView;
	}
	
	/*
	 * 按id查询分析文章
	 */
	@RequestMapping(value="/findfenxiDetail",method=RequestMethod.GET)
	public ModelAndView findNewsdetail(@RequestParam int method)throws Exception{
		News news=newsService.findNewsDetail(method);
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("news", news);
		modelAndView.setViewName("fenxidetail");	
		return modelAndView;
	}
}
