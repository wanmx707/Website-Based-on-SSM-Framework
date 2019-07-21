package com.wmx.op.controller;

import java.io.File;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.wmx.op.po.Anime;
import com.wmx.op.po.Comics;
import com.wmx.op.po.Comicsdetail;
import com.wmx.op.po.Fruit;
import com.wmx.op.po.Information;
import com.wmx.op.po.News;
import com.wmx.op.po.Opdata;
import com.wmx.op.po.Picture;
import com.wmx.op.po.Picturedetail;
import com.wmx.op.service.AnimeService;
import com.wmx.op.service.ComicsService;
import com.wmx.op.service.FruitService;
import com.wmx.op.service.InformationService;
import com.wmx.op.service.OpdataService;

/**
 * 管理员管理控制器
 * 
 * @author 温孟旋
 *
 */
@Controller
public class WebWriteController {
	@Autowired
	private ComicsService comicsService;
	@Autowired
	private AnimeService animeService;
	@Autowired
	private InformationService informationService;
	@Autowired
	private OpdataService opdataService;
	@Autowired
	private FruitService fruitService;

	// 上传漫画
	@RequestMapping("/uploadcomics")
	public String uploadFileComics(@RequestParam("comnumber") String num,
			Comics comics, @RequestParam("fileupload") MultipartFile[] files,
			HttpServletRequest request, HttpServletResponse response,
			HttpSession session, Model model) throws Exception {
		String comics_path = "E:\\java\\upload\\op\\" + num + "\\";
		File filedirectory = new File(comics_path);
		comics.setAddtime(getcurrenttime());
		comics.setUuid(UUID.randomUUID().toString());
		comicsService.insertcomics(comics);
		if (!filedirectory.exists()) {
			filedirectory.mkdirs();
		}
		for (MultipartFile file : files) {
			if (!file.isEmpty()) {
				String originalFilename = file.getOriginalFilename();
				File newFile = new File(comics_path + originalFilename);
				if (!newFile.isDirectory()) {
					newFile.mkdir();
				}
				Comicsdetail comicsdetail = new Comicsdetail();
				comicsdetail.setComicsid(comics.getComicsid());
				comicsdetail.setDetailpaper(num + "/" + originalFilename);
				comicsService.insertcomicsDetail(comicsdetail);
				file.transferTo(newFile);
			} else {
				model.addAttribute("error", "图片上传错误，请重试！！！");
				return "failure";
			}
		}
		model.addAttribute("message", "图片上传成功！！！");
		return "success";
	}

	/*
	 * 上传动画
	 */
	@RequestMapping("/uploadAnime")
	public ModelAndView updateAnime(Anime anime, HttpServletRequest request,
			HttpSession session) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		anime.setAnimeaddtime(getcurrenttime());
		if (animeService.updateAnime(anime) == 1) {
			modelAndView.addObject("message", "上传成功！！！");
			modelAndView.setViewName("success");
		} else {
			modelAndView.addObject("error", "上传错误，请重试！！！");
			modelAndView.setViewName("failure");
		}
		return modelAndView;
	}

	/*
	 * 写情报
	 */
	@RequestMapping("/uploadInfor")
	public ModelAndView uploadInfor(@Validated Information information,
			BindingResult bindingResult, HttpServletRequest request,
			HttpSession session, HttpServletResponse response) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		if (bindingResult.hasErrors()) {
			List<ObjectError> allErrors = bindingResult.getAllErrors();
			modelAndView.addObject("allErrors", allErrors);
			modelAndView.setViewName("user/manage/webWrite/newswrite");
		} else {
			information.setInforaddtime(getcurrenttime());
			if (informationService.insertInform(information) == 1) {
				modelAndView.addObject("message", "恭喜你，文章上传成功！！！");
				modelAndView.setViewName("success");
			} else {
				modelAndView.addObject("error", "很抱歉，文章上传失败！！！");
				modelAndView.setViewName("failure");
			}
		}
		return modelAndView;
	}

	/*
	 * 写资料
	 */
	@RequestMapping("/uploadOpdata")
	public ModelAndView uploadInfor(@RequestParam("file") MultipartFile file,
			@Validated Opdata opdata, BindingResult bindingResult,
			HttpServletRequest request, HttpSession session,
			HttpServletResponse response) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		if (bindingResult.hasErrors()) {
			List<ObjectError> allErrors = bindingResult.getAllErrors();
			modelAndView.addObject("allErrors", allErrors);
			modelAndView.setViewName("user/manage/webWrite/newswrite");
		} else {
			String path = "E:\\java\\upload\\ziliao\\";
			if (!file.isEmpty()) {
				String originalFilename = file.getOriginalFilename();
				String filename=UUID.randomUUID()
						+ originalFilename.substring(originalFilename
								.lastIndexOf("."));
				File newFile = new File(path+filename);
				if (!newFile.isDirectory()) {
					newFile.mkdir();
				}
				file.transferTo(newFile);
				
				opdata.setOpdatapic(filename);
				opdata.setAddtime(getcurrenttime());
				opdata.setUuid(UUID.randomUUID().toString());
				if (opdataService.insertopdata(opdata)== 1) {
					modelAndView.addObject("message", "恭喜你，资料上传成功！！！");
					modelAndView.setViewName("success");
				} else {
					modelAndView.addObject("error", "很抱歉，资料上传失败！！！");
					modelAndView.setViewName("failure");
				}
			} else {
				modelAndView.addObject("error", "图片上传错误，请重试！！！");
				modelAndView.setViewName("failure");
			}
		}
		return modelAndView;
	}

	/*
	 * 写恶魔果实
	 */
	@RequestMapping("/uploadFruit")
	public ModelAndView uploadFruit(@Validated Fruit fruit,
			BindingResult bindingResult, HttpServletRequest request,
			HttpSession session, HttpServletResponse response) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		if (bindingResult.hasErrors()) {
			List<ObjectError> allErrors = bindingResult.getAllErrors();
			modelAndView.addObject("allErrors", allErrors);
			modelAndView.setViewName("user/manage/webWrite/newswrite");
		} else {
			fruit.setAddtime(getcurrenttime());
			fruit.setUuid(UUID.randomUUID().toString());
			if (fruitService.insertFruit(fruit) == 1) {
				modelAndView.addObject("message", "恭喜你，文章上传成功！！！");
				modelAndView.setViewName("success");
			} else {
				modelAndView.addObject("error", "很抱歉，文章上传失败！！！");
				modelAndView.setViewName("failure");
			}
		}
		return modelAndView;
	}
	// 获取当前时间
	public Date getcurrenttime() {
		Date date = new Date();
		return new Date(date.getTime());
	}
}
