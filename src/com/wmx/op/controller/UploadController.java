package com.wmx.op.controller;

import java.io.File;
import java.io.PrintWriter;
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
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.wmx.op.po.News;
import com.wmx.op.po.Picture;
import com.wmx.op.po.PictureCustom;
import com.wmx.op.po.Picturedetail;
import com.wmx.op.po.Uservideo;
import com.wmx.op.po.UservideoCustom;
import com.wmx.op.service.NewsService;
import com.wmx.op.service.PictureService;
import com.wmx.op.service.UploadPicService;
import com.wmx.op.service.UploadService;
import com.wmx.op.service.UservideoService;

@Controller
public class UploadController {
	@Autowired
	private UploadService uploadService;
	@Autowired
	private UploadPicService uploadPicService;
	@Autowired
	private UservideoService uservideoService;
	@Autowired
	private NewsService newsService;
	@Autowired
	private PictureService pictureService;
	/*
	 * 上传视频
	 */
	@RequestMapping("/upload")
	public ModelAndView findupload(
			HttpServletRequest request,
			HttpSession session,
			Uservideo video,
			@RequestParam(value = "videopicture", required = false) MultipartFile videopicfile,
			@RequestParam(value = "file", required = false) MultipartFile files)
			throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		String originalPicFilename = videopicfile.getOriginalFilename();
		if (videopicfile != null && originalPicFilename != null
				&& originalPicFilename.length() > 0) {
			String pic_path = "E:\\java\\upload\\videoImg\\";
			String newPicPathName = UUID.randomUUID()
					+ originalPicFilename.substring(originalPicFilename
							.lastIndexOf("."));
			File newPicFile = new File(pic_path + newPicPathName);
			videopicfile.transferTo(newPicFile);
			video.setVideopic(newPicPathName);
		}
		String originalFilename = files.getOriginalFilename();
		// 上传视频
		if (files != null && originalFilename != null
				&& originalFilename.length() > 0) {
			// 存储视频的物理路径
			String video_path = "E:\\java\\upload\\";
			// 新的视频名称
			// UUID.randomUUID()随机数，
			// originalFilename.substring(originalFilename.lastIndexOf(".")扩展名
			String newFileName = UUID.randomUUID()
					+ originalFilename.substring(originalFilename
							.lastIndexOf("."));
			// 新视频
			File newFile = new File(video_path + newFileName);
			// 将内存中的数据写入磁盘
			files.transferTo(newFile);

			// 将新的视频名称写入video
			video.setWay(newFileName);
			video.setVideoaddtime(getcurrenttime());
			// System.out.println(session.getAttribute("userid"));
			video.setUserid((int) session.getAttribute("userid"));
			// itemsCustom.setPic(newFileName);
			int result = uploadService.uploadvideo(video);
			modelAndView.setViewName("success");
		} else {
			modelAndView.addObject("error", "上传文件存在错误！！");
			modelAndView.setViewName("failure");
		}
		return modelAndView;
	}

	/*
	 * 分页查询视频列表
	 */
	@RequestMapping(value = "/findvideoByPage", method = RequestMethod.GET)
	public ModelAndView findvideoByPage(HttpServletRequest request,
			HttpSession session) throws Exception {
		UservideoCustom uservideoCustom = new UservideoCustom();
		uservideoCustom.setUserid((int) session.getAttribute("userid"));
		int pages = 1;// 待显示页数
		int totalpages = 0;// 总页数
		int pagesize = 5;// 每页条数
		int count = uploadService.getTotalpage(uservideoCustom);// 总条数

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
		List<Uservideo> uservideoList = uploadService
				.uploadList(uservideoCustom);
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
		modelAndView.setViewName("user/manage/videoManage/videoList");
		// List<Uservideo> uservideoList = uploadService
		// .uploadList(uservideoCustom);
		return modelAndView;
	}

	// 查看视频
	@RequestMapping(value = "/findvideoByID", method = RequestMethod.GET)
	public ModelAndView findvideoByID(HttpServletRequest request,
			HttpSession session) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		String strid = request.getParameter("method");
		int id = Integer.parseInt(strid);
		Uservideo uservideo = uploadService.findvideoByid(id);
		modelAndView.addObject("uservideo", uservideo);
		modelAndView.setViewName("user/manage/videoManage/videoone");
		// modelAndView.setViewName("user/manage/videoManage/kanshipin");
		return modelAndView;
	}

	/*
	 * 删除视频
	 */
	@RequestMapping(value = "/delvideoByID", method = RequestMethod.GET)
	public String delvideoByID(HttpServletRequest request, HttpSession session,
			HttpServletResponse response) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		String strid = request.getParameter("deluserid");
		int id = Integer.parseInt(strid);
		int del = uploadService.delvideoByid(id);
		if (del == 1) {
			return "success";
		} else {
			modelAndView.addObject("message", "出现错误！！");
			return "failure";
		}
	}

	/*
	 * 修改视频信息
	 */
	@RequestMapping(value = "/findvideochange")
	public ModelAndView findvideochange(HttpServletRequest request,
			HttpSession sessions, Uservideo video) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		if (uservideoService.findvideochange(video) == 1) {
			modelAndView.addObject("message", "修改成功!!!");
			modelAndView.setViewName("success");
		} else {
			modelAndView.addObject("error", "很抱歉，修改失败!!!");
			modelAndView.setViewName("failure");
		}
		return modelAndView;
	}

	/*
	 * 显示修改文章
	 */
	@RequestMapping(value = "/findNewschange", method = RequestMethod.GET)
	public ModelAndView findNewsdetail(@RequestParam int method)
			throws Exception {
		News news = newsService.findNewsDetail(method);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("news", news);

		modelAndView.setViewName("user/manage/writeManage/changewrite");

		return modelAndView;
	}
	
	/*
	 * 修改文章
	 */
	@RequestMapping("/updateNewschange")
	public ModelAndView findNewschange(@Validated News news,
			BindingResult bindingResult, HttpServletRequest request,
			HttpSession session) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		if (bindingResult.hasErrors()) {
			List<ObjectError> allErrors = bindingResult.getAllErrors();
			modelAndView.addObject("allErrors", allErrors);
			modelAndView.setViewName("user/manage/writeManage/changewrite");
		} else {
			news.setAddtime(getcurrenttime());
			if (newsService.updateNewsById(news) == 1) {
				modelAndView.addObject("message", "恭喜你，文章修改成功！！！");
				modelAndView.setViewName("success");
			} else {
				modelAndView.addObject("error", "很抱歉，文章修改失败！！！");
				modelAndView.setViewName("failure");
			}
		}
		return modelAndView;

	}
	
	/*
	 * 更新图集信息
	 */
	@RequestMapping("/updatePicureName")
	public String updatePicureName(Picture picture, HttpServletRequest request,
			HttpSession session) throws Exception {
		ModelAndView modelAndView=new ModelAndView();
		if(pictureService.updatePicture(picture)==1){
			return "redirect:/findpicByID.action?method="+picture.getPicid();
		}else{
			modelAndView.addObject("error", "修改失败，请重试！！");
			return "failure";
			
		}
	}
	/*
	 * 上传图片
	 */
	@RequestMapping("/uploadpic")
	public String uploadFileJunior(Picture picture, MultipartFile filefengmian,
			@RequestParam("fileupload") MultipartFile[] files,
			HttpServletRequest request, HttpServletResponse response,
			HttpSession session, Model model) throws Exception {
		String pic_path = "E:\\java\\upload\\";
		picture.setPicaddtime(getcurrenttime());
		picture.setUserid((int) session.getAttribute("userid"));
		if (!filefengmian.isEmpty()) {
			String originafmname = filefengmian.getOriginalFilename();
			String newfnname = UUID.randomUUID()
					+ originafmname.substring(originafmname.lastIndexOf("."));
			File newfmname = new File(pic_path + newfnname);
			picture.setPicfengmian(newfnname);
			filefengmian.transferTo(newfmname);
		} else {
			model.addAttribute("error", "封面上传错误，请重试！！！");
			return "failure";
		}
		int result = uploadPicService.insertPic(picture);
		System.out.println(picture.getPicid());
		for (MultipartFile file : files) {
			if (!file.isEmpty()) {
				String originalFilename = file.getOriginalFilename();
				String newFileName = UUID.randomUUID()
						+ originalFilename.substring(originalFilename
								.lastIndexOf("."));
				File newFile = new File(pic_path + newFileName);
				if (!newFile.isDirectory()) {
					newFile.mkdir();
				}
				Picturedetail picturedetail = new Picturedetail();
				picturedetail.setPicway(newFileName);
				picturedetail.setPicid(picture.getPicid());
				uploadPicService.insertPicDetail(picturedetail);
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
	 * 分页查询图片列表
	 */
	@RequestMapping(value = "/findPicByPage", method = RequestMethod.GET)
	public ModelAndView findPicByPage(HttpServletRequest request,
			HttpSession session) throws Exception {
		PictureCustom pictureCustom = new PictureCustom();
		pictureCustom.setUserid((int) session.getAttribute("userid"));
		int pages = 1;// 待显示页数
		int totalpages = 0;// 总页数
		int pagesize = 5;// 每页条数
		int count = uploadPicService.getTotalpage(pictureCustom);// 总条数

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
		List<Picture> pictureList = uploadPicService.selectbyId(pictureCustom);
		ModelAndView modelAndView = new ModelAndView();
		// 计算上一页
		int prepages = pages - 1;
		modelAndView.addObject("prepages", prepages);
		// 计算下一页
		int nextpages = pages + 1;
		modelAndView.addObject("nextpages", nextpages);
		modelAndView.addObject("pictureList", pictureList);
		modelAndView.addObject("pages", pages);
		modelAndView.addObject("totalpages", totalpages);
		modelAndView.setViewName("user/manage/picManage/pictureList");
		// List<Uservideo> uservideoList = uploadService
		// .uploadList(uservideoCustom);

		return modelAndView;
	}

	/*
	 * 查看图片
	 */
	@RequestMapping(value = "/findpicByID", method = RequestMethod.GET)
	public ModelAndView findpicByID(HttpServletRequest request,
			HttpSession session) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		String strid = request.getParameter("method");
		int id = Integer.parseInt(strid);
		Picture picture=pictureService.findPictureOne(id);
		
		modelAndView.addObject("picture", picture);
		modelAndView.setViewName("user/manage/picManage/piconechange");
		return modelAndView;
	}

	// 获取当前时间
	public Date getcurrenttime() {
		Date date = new Date();
		return new Date(date.getTime());
	}
}
