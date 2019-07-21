package com.wmx.op.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.wmx.op.po.Anime;
import com.wmx.op.po.Comics;
import com.wmx.op.po.ComicsExample;
import com.wmx.op.po.Fruittype;
import com.wmx.op.po.FruittypeExample;
import com.wmx.op.po.Information;
import com.wmx.op.po.InformationExample;
import com.wmx.op.po.News;
import com.wmx.op.po.NewsExample;
import com.wmx.op.po.Picture;
import com.wmx.op.po.PictureExample;
import com.wmx.op.po.Uservideo;
import com.wmx.op.po.UservideoExample;
import com.wmx.op.service.FruitService;
import com.wmx.op.service.IndexService;
import com.wmx.op.webmagic.MyProcessor;

/**
 * 主页的controller
 * 
 * @author 温孟旋
 *
 */
@Controller
public class IndexController {
	@Autowired
	private IndexService indexSerivice;
	@Autowired
	private FruitService fruitService;

	@RequestMapping(value="/queryindex", method=RequestMethod.GET)
	public ModelAndView findIndex(HttpServletRequest request,
			ComicsExample comics, NewsExample news,InformationExample information,
			PictureExample example,UservideoExample uservideo)
			throws Exception {
		//System.out.println("s是"+method	);
		//System.out.println("哈哈哈哈哈");
		List<Comics> listComics = indexSerivice.findComics(comics); 	
		List<News> listNews = indexSerivice.findNews(news);
		List<Anime> listAnime = indexSerivice.findAnime();
		List<Information> listInformation=indexSerivice.findInformation(information);
		List<Picture> listPicture=indexSerivice.findPicture(example);
		List<Uservideo> listUservideo=indexSerivice.findUservideo(uservideo);
		List<Fruittype> listFruittype=fruitService.findFruitList();
		// 返回ModelAndView
		ModelAndView modelAndView = new ModelAndView();
		// 相当于request的setAttribut,在jsp页面中通过itemList取数据
		modelAndView.addObject("listComics", listComics);
		modelAndView.addObject("listNews", listNews);
		modelAndView.addObject("listAnime", listAnime);
		modelAndView.addObject("listInformation", listInformation);
		modelAndView.addObject("listPicture",listPicture );
		modelAndView.addObject("listUservideo", listUservideo);
		modelAndView.addObject("listFruittype", listFruittype);
		// 指定视图
		// 下面的路径，如果在视图解析器中配置jsp路径的前缀和后缀，修改为
		// modelAndView.setViewName("/WEB-INF/jsp/items/itemsList.jsp");
		// 上边的路径配置可以不指定jsp路径的前缀和后缀
		modelAndView.setViewName("index");
		return modelAndView;
	}

}
