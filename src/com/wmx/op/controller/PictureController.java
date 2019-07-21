package com.wmx.op.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.wmx.op.po.Comment;
import com.wmx.op.po.Picture;
import com.wmx.op.po.PictureCustom;
import com.wmx.op.po.PictureExample;
import com.wmx.op.service.PictureDetailService;
import com.wmx.op.service.PictureService;

@Controller
public class PictureController {
	@Autowired
	private PictureService pictureService;
	@Autowired
	private PictureDetailService pictureDetailService;

	/*
	 * 分页查询图片列表
	 */
	@RequestMapping(value = "/findPicture", method = RequestMethod.GET)
	public ModelAndView findPicByPage(HttpServletRequest request,
			HttpSession session, PictureExample example) throws Exception {
		PictureCustom pictureCustom = new PictureCustom();
		int pages = 1;// 待显示页数
		int totalpages = 0;// 总页数
		int pagesize = 12;// 每页条数
		int count = pictureService.selectcount(example);// 总条数

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
		List<Picture> pictureList = pictureService.selectPicList(pictureCustom);
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
		modelAndView.setViewName("picture");
		// List<Uservideo> uservideoList = uploadService
		// .uploadList(uservideoCustom);

		return modelAndView;
	}

	/*
	 * 单个图集
	 */
	@RequestMapping(value = "/findPictureByid", method = RequestMethod.GET)
	public ModelAndView findPictureByid(HttpServletRequest request,
			HttpSession session) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		String strid = request.getParameter("method");
		int id = 0;
		if (strid != null) {
			id = Integer.parseInt(strid);
		} else {
			modelAndView.addObject("error", "出现错误！请联系管理员！！！");
			modelAndView.setViewName("failure");
		}
		Picture picture = pictureService.findPictureOne(id);
		/*List<Comment> commenList=commentAndReplyService.findCommentAndReply(picture.getUuid());
		modelAndView.addObject("commenList", commenList);*/
		modelAndView.addObject("nextpic", id + 1);
		modelAndView.addObject("prepic", id - 1);
		modelAndView.addObject("picture", picture);
		modelAndView.setViewName("picone");
		return modelAndView;
	}

	/*
	 * 删除具体的图片
	 */
	@RequestMapping(value = "/delPictureDetailByid", method = RequestMethod.GET)
	public String delPictureDetailByid(HttpServletRequest request,
			HttpSession session, int picdetailid) throws Exception {
		String strid = request.getParameter("picdetailid");
		int id = Integer.parseInt(strid);
		int re = pictureDetailService.delPicDetail(id);
		System.out.println("结果为" + re);
		String strpicid = request.getParameter("picid");
		return "redirect:/findpicByID.action?method=" + strpicid;
	}
}
