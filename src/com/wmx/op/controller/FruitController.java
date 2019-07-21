package com.wmx.op.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.wmx.op.po.Fruit;
import com.wmx.op.service.FruitService;

@Controller
public class FruitController {
	@Autowired
	private FruitService fruitService;
	@RequestMapping("/findFruitByid")
	public ModelAndView findFruitByid(@RequestParam("method") int method,
			HttpServletRequest request, HttpSession session) throws Exception {
		ModelAndView modelAndView=new ModelAndView();
		Fruit fruit=fruitService.findFruitByid(method);
		modelAndView.addObject("fruit", fruit);
		modelAndView.setViewName("fruitdetail");
		return modelAndView;
	}
}
