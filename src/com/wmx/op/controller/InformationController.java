package com.wmx.op.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.catalina.connector.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.wmx.op.po.Information;
import com.wmx.op.po.InformationCustom;
import com.wmx.op.po.InformationExample;
import com.wmx.op.po.News;
import com.wmx.op.po.NewsExample;
import com.wmx.op.service.InformationService;

@Controller
public class InformationController {
	@Autowired
	private InformationService informationService;

	/*
	 * 列分页表查询情报
	 */
	@RequestMapping(value = "/findInformation", method = RequestMethod.GET)
	public ModelAndView findNews(HttpServletRequest request,
			InformationExample informationExample) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		int page = 0;// 待显示页数
		int pageSize = 9;// 页面大小
		int totalpage = 0;// 总条数
		int count = informationService.findcount(informationExample);
		totalpage = (int) Math.ceil(count / pageSize * 1.0);
		String strpage = request.getParameter("page");
		if (strpage == null) {
			page = 1;
		} else {
			page = Integer.parseInt(strpage);
			if (page < 1) {
				page = 1;
			} else if (page > totalpage) {
				page = 1;
			}
		}
		InformationCustom informationCustom=new InformationCustom();
		informationCustom.setPageNo(page);
		informationCustom.setPageSize(pageSize);
		List<Information> inforList=informationService.findInforByPage(informationCustom);
		//计算上一页
		int prepage=page-1;
		modelAndView.addObject("prepage", prepage);
		//计算下一页
		int nextpage=page+1;
		modelAndView.addObject("nextpage", nextpage);
		modelAndView.addObject("inforList", inforList);
		modelAndView.addObject("totalpage", totalpage);
		modelAndView.addObject("page", page);
		modelAndView.setViewName("inforList");
		return modelAndView;
	}

	/*
	 * 查询具体的情报
	 */
	@RequestMapping(value = "/findInforByid", method = RequestMethod.GET)
	public ModelAndView findInforByid(HttpServletRequest request,
			HttpSession session) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		String strId = request.getParameter("method");
		int id = 0;
		if (strId != null) {
			id = Integer.parseInt(strId);
		} else {
			modelAndView.addObject("error", "出现错误！！！");
			modelAndView.setViewName("failure");
		}
		Information information = informationService.findInforByid(id);
		modelAndView.addObject("information", information);
		modelAndView.setViewName("informationdetail");
		return modelAndView;
	}
}
