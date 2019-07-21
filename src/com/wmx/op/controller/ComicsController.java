package com.wmx.op.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.wmx.op.po.Comics;
import com.wmx.op.po.ComicsExample;
import com.wmx.op.service.ComicsService;

@Controller
public class ComicsController {
	@Autowired
	private ComicsService comicsService;
	
	@RequestMapping("/findcomics")
	public ModelAndView findComics(HttpServletRequest request,ComicsExample comics)throws Exception{
		List<Comics> comicsList=comicsService.findComics(comics);
		ModelAndView modelAndView=new ModelAndView();
		
		modelAndView.addObject("comicsList", comicsList);
		modelAndView.setViewName("comicList");
		return modelAndView;
	}
	
	@RequestMapping(value="/findcomicsDetail" , method=RequestMethod.GET)
	public ModelAndView findComicsDetail(HttpServletRequest request,@RequestParam int method)throws Exception{
		Comics comics=comicsService.findComicsDetail(method);
		ModelAndView modelAndView=new ModelAndView();
		
		modelAndView.addObject("comics", comics);
		modelAndView.setViewName("comicsdetail");
		return modelAndView;
	}
}
