package com.wmx.op.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.wmx.op.po.Anime;
import com.wmx.op.po.AnimeExample;
import com.wmx.op.service.AnimeService;

@Controller
public class AnimeController {
	@Autowired
	private AnimeService animeService;
	/**
	 * 查询动画
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/findanime")
	public ModelAndView findAnime(HttpServletRequest request) throws Exception{
		AnimeExample animeexample=new AnimeExample();
		List<Anime> animeLsit=animeService.findAnimeAll(animeexample);
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("animeLsit", animeLsit);
		modelAndView.setViewName("anime/donghua");
		return modelAndView;
	}
	/*
	 * 按id查询动画
	 */
	@RequestMapping("/findanimeByid")
	public ModelAndView findanimeByid(HttpServletRequest request,@RequestParam("method")int method) throws Exception{
		Anime anime=animeService.findAnimeByid(method);
		AnimeExample animeexample=new AnimeExample();
		List<Anime> animeLsit=animeService.findAnimeAllASC(animeexample);
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("anime", anime);
		modelAndView.addObject("animeLsit", animeLsit);
		modelAndView.setViewName("animeone");
		return modelAndView;
	}
}
