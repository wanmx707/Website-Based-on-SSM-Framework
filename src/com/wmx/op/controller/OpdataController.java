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

import com.wmx.op.po.Opdata;
import com.wmx.op.po.Opdatatype;
import com.wmx.op.service.OpdataService;

@Controller
public class OpdataController {
	@Autowired
	private OpdataService opdataService;

	@RequestMapping("/finddata")
	public ModelAndView findopdata(HttpServletRequest request,
			HttpSession session) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		List<Opdatatype> opdatalist = opdataService.finddatatype();
		modelAndView.addObject("opdatalist", opdatalist);
		modelAndView.setViewName("ziliao");
		return modelAndView;
	}

	@RequestMapping(value="/findopdataByID",method=RequestMethod.GET)
	public ModelAndView findopdataByID(HttpServletRequest request,
			HttpSession session, @RequestParam("method") Integer id)
			throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		Opdata opdata = opdataService.findopdataById(id);
		modelAndView.addObject("opdata", opdata);
		modelAndView.setViewName("ziliaoone");
		return modelAndView;
	}
}
