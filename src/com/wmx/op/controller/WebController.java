package com.wmx.op.controller;

import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.omg.CosNaming.Binding;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.wmx.op.po.Anime;
import com.wmx.op.po.AnimeCustom;
import com.wmx.op.po.AnimeExample;
import com.wmx.op.po.Comics;
import com.wmx.op.po.ComicsCustom;
import com.wmx.op.po.ComicsExample;
import com.wmx.op.po.Fruit;
import com.wmx.op.po.FruitCustom;
import com.wmx.op.po.FruitExample;
import com.wmx.op.po.Information;
import com.wmx.op.po.InformationCustom;
import com.wmx.op.po.InformationExample;
import com.wmx.op.po.News;
import com.wmx.op.po.NewsCustom;
import com.wmx.op.po.Opdata;
import com.wmx.op.po.OpdataCustom;
import com.wmx.op.po.OpdataExample;
import com.wmx.op.po.User;
import com.wmx.op.po.Uservideo;
import com.wmx.op.po.UservideoCustom;
import com.wmx.op.po.UservideoExample;
import com.wmx.op.service.AnimeService;
import com.wmx.op.service.ComicsService;
import com.wmx.op.service.FruitService;
import com.wmx.op.service.InformationService;
import com.wmx.op.service.NewsService;
import com.wmx.op.service.OpdataService;
import com.wmx.op.service.ReviewSerivce;
import com.wmx.op.util.Sendmail;

@Controller
public class WebController {
	@Autowired
	private AnimeService animeService;
	@Autowired
	private ComicsService comicsService;
	@Autowired
	private InformationService informationService;
	@Autowired
	private OpdataService opdataService;
	@Autowired
	private FruitService fruitService;
	@Autowired
	private NewsService newsService;
	@Autowired
	private ReviewSerivce reviewSerivce;

	/*****************************************************
	 *****************************************************
	 ******************** 动画管理****************************
	 *****************************************************
	 *****************************************************
	 */

	/**
	 * 管理动画分页查询
	 * 
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/selectManageAnimeByPage")
	public ModelAndView selectAnimeByPage(HttpServletRequest request,
			HttpSession session) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		AnimeExample example = new AnimeExample();
		AnimeCustom animeCustom = new AnimeCustom();
		int pages = 1;
		int pagesize = 5;
		int count = animeService.selecCount(example);
		int totalpages = (int) Math.ceil(count / (pagesize * 1.0));

		String strpages = request.getParameter("pages");
		if (strpages == null) {
			pages = 1;
		} else {
			pages = Integer.parseInt(strpages);
			if (pages < 1) {
				pages = 1;
			} else if (pages > totalpages) {
				pages = 1;
			}
		}
		animeCustom.setPageNo((pages - 1) * pagesize);
		animeCustom.setPageSize(pagesize);
		List<Anime> animelist = animeService.selectAnimeByPage(animeCustom);
		modelAndView.addObject("animelist", animelist);
		int prepages = pages - 1;
		modelAndView.addObject("prepages", prepages);
		int nextpages = pages + 1;
		modelAndView.addObject("nextpages", nextpages);

		modelAndView.addObject("pages", pages);
		modelAndView.addObject("totalpages", totalpages);
		modelAndView.setViewName("user/manage/webManage/AnimeList");
		return modelAndView;
	}

	/**
	 * 按id查询动画
	 */
	@RequestMapping("/findAnimeManageByID")
	public ModelAndView findAnimeManageByID(HttpServletRequest request,
			HttpSession session, @RequestParam("method") int animeid)
			throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		Anime anime = animeService.findAnimeByid(animeid);
		modelAndView.addObject("anime", anime);
		modelAndView.setViewName("user/manage/webManage/animeManage");
		return modelAndView;
	}

	/**
	 * 按id修改动画
	 */
	@RequestMapping("/updateAnimeManageByID")
	public ModelAndView updateAnimeManageByID(@Validated Anime anime,
			BindingResult bindingResult, HttpServletRequest request,
			HttpSession session) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		if (bindingResult.hasErrors()) {
			List<ObjectError> allErrors = bindingResult.getAllErrors();
			modelAndView.addObject("allErrors", allErrors);
			modelAndView.setViewName("user/manage/webManage/animeManage");
		} else {
			if (animeService.updateAnimeByid(anime) == 1) {
				modelAndView.addObject("message", "修改完成！");
				modelAndView.setViewName("success");
			} else {
				modelAndView.addObject("error", "修改失败！");
				modelAndView.setViewName("failure");
			}
		}
		return modelAndView;
	}

	/**
	 * 按id删除动画
	 */
	@RequestMapping("/delAnimeManageByID")
	public ModelAndView delAnimeManageByID(HttpServletRequest request,
			HttpSession session, int animeid) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		if (animeService.delAnimeByid(animeid) == 1) {
			modelAndView.addObject("message", "删除完成！");
			modelAndView.setViewName("success");
		} else {
			modelAndView.addObject("error", "删除失败！");
			modelAndView.setViewName("failure");
		}
		return modelAndView;
	}

	/*****************************************************
	 *****************************************************
	 ******************** 漫画管理****************************
	 *****************************************************
	 *****************************************************
	 */

	/**
	 * 漫画管理分页查询
	 * 
	 * @throws Exception
	 */
	@RequestMapping("/selectComicsManage")
	public ModelAndView selectComicsManage(HttpServletRequest request,
			HttpSession session) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		ComicsExample example = new ComicsExample();
		ComicsCustom comicsCustom = new ComicsCustom();
		int pages = 1;
		int pageSize = 15;
		int count = comicsService.selectComicsCount(example);
		int totalpages = (int) Math.ceil(count / (pageSize * 1.0));
		String strpage = request.getParameter("pages");
		if (strpage == null) {
			pages = 1;
		} else {
			pages = Integer.parseInt(strpage);
			if (pages < 1) {
				pages = 1;
			} else if (pages > totalpages) {
				pages = 1;
			}
		}
		comicsCustom.setPageNo((pages - 1) * pageSize);
		comicsCustom.setPageSize(pageSize);
		List<Comics> comicsList = comicsService.selectComicsPgae(comicsCustom);
		modelAndView.addObject("comicsList", comicsList);
		modelAndView.addObject("pages", pages);
		modelAndView.addObject("prepages", pages - 1);
		modelAndView.addObject("nextpages", pages + 1);
		modelAndView.addObject("totalpages", totalpages);
		modelAndView.setViewName("user/manage/webManage/ComicsList");
		return modelAndView;
	}

	/**
	 * 按id删除漫画
	 */
	@RequestMapping("/delComicsManageByID")
	public ModelAndView delComicsManageByID(HttpServletRequest request,
			HttpSession session, int comicsid) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		if (comicsService.delComicsByid(comicsid) == 1) {
			modelAndView.addObject("message", "删除完成！");
			modelAndView.setViewName("success");
		} else {
			modelAndView.addObject("error", "删除失败！");
			modelAndView.setViewName("failure");
		}
		return modelAndView;
	}

	/*****************************************************
	 *****************************************************
	 ******************** 情报管理****************************
	 *****************************************************
	 *****************************************************
	 */
	/**
	 * 情报管理分页查询
	 * 
	 * @throws Exception
	 */
	@RequestMapping("/selectNewsManage")
	public ModelAndView selectNewsManage(HttpServletRequest request,
			HttpSession session) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		InformationExample example = new InformationExample();
		InformationCustom informationCustom = new InformationCustom();
		int pages = 1;
		int pageSize = 5;
		int count = informationService.findcount(example);
		int totalpages = (int) Math.ceil(count / (pageSize * 1.0));
		String strpage = request.getParameter("pages");
		if (strpage == null) {
			pages = 1;
		} else {
			pages = Integer.parseInt(strpage);
			if (pages < 1) {
				pages = 1;
			} else if (pages > totalpages) {
				pages = 1;
			}
		}
		informationCustom.setPageNo((pages - 1) * pageSize);
		informationCustom.setPageSize(pageSize);
		List<Information> inforList = informationService
				.findInforByPage(informationCustom);
		modelAndView.addObject("inforList", inforList);
		modelAndView.addObject("pages", pages);
		modelAndView.addObject("prepages", pages - 1);
		modelAndView.addObject("nextpages", pages + 1);
		modelAndView.addObject("totalpages", totalpages);
		modelAndView.setViewName("user/manage/webManage/InforList");
		return modelAndView;
	}

	/*
	 * 按id查询的情报
	 */
	@RequestMapping(value = "/selectInManageforByid", method = RequestMethod.GET)
	public ModelAndView selectInManageforByid(HttpServletRequest request,
			HttpSession session) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		String strId = request.getParameter("method");
		int id = 0;
		if (strId != null) {
			id = Integer.parseInt(strId);
			Information information = informationService.findInforByid(id);
			modelAndView.addObject("information", information);
			modelAndView.setViewName("user/manage/webManage/informationManage");
		} else {
			modelAndView.addObject("error", "出现错误！！！");
			modelAndView.setViewName("failure");
		}
		return modelAndView;
	}

	/*
	 * 按id修改的情报
	 */
	@RequestMapping("/updateInManageforByid")
	public ModelAndView updateInManageforByid(
			@Validated Information information, BindingResult bindingResult,
			HttpServletRequest request, HttpSession session,
			HttpServletResponse response) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		if (bindingResult.hasErrors()) {
			List<ObjectError> allErrors = bindingResult.getAllErrors();
			modelAndView.addObject("allErrors", allErrors);
			modelAndView.setViewName("user/manage/webManage/informationManage");
		} else {
			if (informationService.updateInformByid(information) == 1) {
				modelAndView.addObject("message", "恭喜你，情报修改成功！！！");
				modelAndView.setViewName("success");
			} else {
				modelAndView.addObject("error", "很抱歉，情报修改失败！！！");
				modelAndView.setViewName("failure");
			}
		}
		return modelAndView;
	}

	/*
	 * 按id删除情报
	 */
	@RequestMapping(value = "/delInManageforByid", method = RequestMethod.GET)
	public ModelAndView delInManageforByid(HttpServletRequest request,
			HttpSession session, int inforid) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		if (informationService.delInformByid(inforid) == 1) {
			modelAndView.addObject("message", "恭喜你，情报删除成功！！！");
			modelAndView.setViewName("success");
		} else {
			modelAndView.addObject("error", "很抱歉，情报删除失败！！！");
			modelAndView.setViewName("failure");
		}
		return modelAndView;
	}

	/*****************************************************
	 *****************************************************
	 ******************** 资料管理****************************
	 *****************************************************
	 *****************************************************
	 */
	/**
	 * 资料管理分页查询
	 * 
	 * @throws Exception
	 */
	@RequestMapping("/selectOpdataManage")
	public ModelAndView selectOpdataManage(HttpServletRequest request,
			HttpSession session) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		OpdataExample example = new OpdataExample();
		OpdataCustom opdataCustom = new OpdataCustom();
		int pages = 1;
		int pageSize = 5;
		int count = opdataService.selectCount(example);
		int totalpages = (int) Math.ceil(count / (pageSize * 1.0));
		String strpage = request.getParameter("pages");
		if (strpage == null) {
			pages = 1;
		} else {
			pages = Integer.parseInt(strpage);
			if (pages < 1) {
				pages = 1;
			} else if (pages > totalpages) {
				pages = 1;
			}
		}
		opdataCustom.setPageNo((pages - 1) * pageSize);
		opdataCustom.setPageSize(pageSize);
		List<Opdata> opdataList = opdataService
				.selectOpdataByPage(opdataCustom);
		modelAndView.addObject("opdataList", opdataList);
		modelAndView.addObject("pages", pages);
		modelAndView.addObject("prepages", pages - 1);
		modelAndView.addObject("nextpages", pages + 1);
		modelAndView.addObject("totalpages", totalpages);
		modelAndView.setViewName("user/manage/webManage/ziliaoList");

		return modelAndView;
	}

	/*
	 * 按id查询的资料
	 */
	@RequestMapping(value = "/selectOpdataByid", method = RequestMethod.GET)
	public ModelAndView selectOpdataByid(HttpServletRequest request,
			HttpSession session) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		String strId = request.getParameter("method");
		int id = 0;
		if (strId != null) {
			id = Integer.parseInt(strId);
			Opdata opdata = opdataService.findopdataById(id);
			modelAndView.addObject("opdata", opdata);
			modelAndView.setViewName("user/manage/webManage/ziliaoManage");
		} else {
			modelAndView.addObject("error", "出现错误！！！");
			modelAndView.setViewName("failure");
		}
		return modelAndView;
	}

	/*
	 * 更新资料
	 */
	@RequestMapping("/updateOpdataByid")
	public ModelAndView updateOpdataByid(
			@RequestParam("file") MultipartFile file, @Validated Opdata opdata,
			BindingResult bindingResult, HttpServletRequest request,
			HttpSession session, HttpServletResponse response) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		if (bindingResult.hasErrors()) {
			List<ObjectError> allErrors = bindingResult.getAllErrors();
			modelAndView.addObject("allErrors", allErrors);
			modelAndView.setViewName("user/manage/webWrite/newswrite");
		} else {
			String path = "E:\\java\\upload\\ziliao\\";
			if (!file.isEmpty()) {
				String originalFilename = file.getOriginalFilename();
				String filename = UUID.randomUUID()
						+ originalFilename.substring(originalFilename
								.lastIndexOf("."));
				File newFile = new File(path + filename);
				if (!newFile.isDirectory()) {
					newFile.mkdir();
				}
				file.transferTo(newFile);
				opdata.setOpdatapic(filename);
			}
		}
		if (opdataService.updateOpdataByid(opdata) == 1) {
			modelAndView.addObject("message", "恭喜你，资料更新成功！！！");
			modelAndView.setViewName("success");
		} else {
			modelAndView.addObject("error", "很抱歉，资料更新失败！！！");
			modelAndView.setViewName("failure");
		}
		return modelAndView;
	}

	/**
	 * 按id删除资料
	 */
	@RequestMapping(value = "/delOpdatByid", method = RequestMethod.GET)
	public ModelAndView delOpdatByid(HttpServletRequest request,
			HttpSession session, int opdataid) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		if (opdataService.delOpdataByid(opdataid) == 1) {
			modelAndView.addObject("message", "恭喜你，资料删除成功！！！");
			modelAndView.setViewName("success");
		} else {
			modelAndView.addObject("error", "很抱歉，资料删除失败！！！");
			modelAndView.setViewName("failure");
		}
		return modelAndView;
	}

	/*****************************************************
	 *****************************************************
	 ******************** 恶魔果实管理****************************
	 *****************************************************
	 *****************************************************
	 */
	/**
	 * 恶魔果实管理分页查询
	 * 
	 * @throws Exception
	 */
	@RequestMapping("/selectFruitManage")
	public ModelAndView selectFruitManage(HttpServletRequest request,
			HttpSession session) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		FruitExample example = new FruitExample();
		FruitCustom fruitCustom = new FruitCustom();
		int pages = 1;
		int pageSize = 5;
		int count = fruitService.selectCount(example);
		int totalpages = (int) Math.ceil(count / (pageSize * 1.0));
		String strpage = request.getParameter("pages");
		if (strpage == null) {
			pages = 1;
		} else {
			pages = Integer.parseInt(strpage);
			if (pages < 1) {
				pages = 1;
			} else if (pages > totalpages) {
				pages = 1;
			}
		}
		fruitCustom.setPageNo((pages - 1) * pageSize);
		fruitCustom.setPageSize(pageSize);
		List<Fruit> fruitList = fruitService.selectFruitBypage(fruitCustom);
		modelAndView.addObject("fruitList", fruitList);
		modelAndView.addObject("pages", pages);
		modelAndView.addObject("prepages", pages - 1);
		modelAndView.addObject("nextpages", pages + 1);
		modelAndView.addObject("totalpages", totalpages);
		modelAndView.setViewName("user/manage/webManage/fruitList");

		return modelAndView;
	}

	/*
	 * 按id查询的恶魔果实
	 */
	@RequestMapping(value = "/selectFruitByid", method = RequestMethod.GET)
	public ModelAndView selectFruitByid(HttpServletRequest request,
			HttpSession session) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		String strId = request.getParameter("method");
		int id = 0;
		if (strId != null) {
			id = Integer.parseInt(strId);
			Fruit fruit = fruitService.findFruitByid(id);
			modelAndView.addObject("fruit", fruit);
			modelAndView.setViewName("user/manage/webManage/fruitManage");
		} else {
			modelAndView.addObject("error", "出现错误！！！");
			modelAndView.setViewName("failure");
		}
		return modelAndView;
	}

	/*
	 * 按id修改的恶魔果实
	 */
	@RequestMapping("/updateFruitByid")
	public ModelAndView updateFruitByid(@Validated Fruit fruit,
			BindingResult bindingResult, HttpServletRequest request,
			HttpSession session, HttpServletResponse response) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		if (bindingResult.hasErrors()) {
			List<ObjectError> allErrors = bindingResult.getAllErrors();
			modelAndView.addObject("allErrors", allErrors);
			modelAndView.setViewName("user/manage/webManage/fruitManage");
		} else {
			if (fruitService.updateByFruit(fruit) == 1) {
				modelAndView.addObject("message", "恭喜你，恶魔果实信息修改成功！！！");
				modelAndView.setViewName("success");
			} else {
				modelAndView.addObject("error", "很抱歉，恶魔果实信息修改失败！！！");
				modelAndView.setViewName("failure");
			}
		}
		return modelAndView;
	}

	/**
	 * 按id删除恶魔果实信息
	 */
	@RequestMapping(value = "/delFruitByid", method = RequestMethod.GET)
	public ModelAndView delFruitByid(HttpServletRequest request,
			HttpSession session, int fruitid) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		if (fruitService.delFruitByid(fruitid) == 1) {
			modelAndView.addObject("message", "恭喜你，恶魔果实信息删除成功！！！");
			modelAndView.setViewName("success");
		} else {
			modelAndView.addObject("error", "很抱歉，恶魔果实信息删除失败！！！");
			modelAndView.setViewName("failure");
		}
		return modelAndView;
	}

	/*****************************************************
	 *****************************************************
	 ******************** 举报管理****************************
	 *****************************************************
	 *****************************************************
	 */

	/**
	 * 举报文章
	 * 
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/jubao")
	public Map jubao(HttpServletRequest request, HttpSession session,
			@RequestBody Map<String, Object> map) throws Exception {
		String status = (String) map.get("jubaoselect");
		Integer id = (Integer) map.get("newsid");
		News news = new News();
		news.setStatus(Integer.parseInt(status));
		news.setNewsid(id);
		if (1 == newsService.updateNewsById(news)) {
			map.put("answer", "举报成功！！！");
			return map;
		} else {
			map.put("answer", "举报失败！！！");
			return map;
		}
	}
	
	/*
	 * 被举报文章分页查询
	 */
	@RequestMapping(value = "/findNewsJubao", method = RequestMethod.GET)
	public ModelAndView findNewsstatus(HttpServletRequest request,
			HttpSession session) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		NewsCustom newsCustom = new NewsCustom();
		int pages = 1;// 待显示页数
		int totalpages = 0;// 总页数
		int pagesize = 5;// 每页条数
		newsCustom.setStatus(0);
		int count = reviewSerivce.findcountstatus();// 总条数

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
		List<News> newsList = reviewSerivce.findNewsByJubao(newsCustom);
		// 计算上一页
		int prepages = pages - 1;
		modelAndView.addObject("prepages", prepages);
		// 计算下一页
		int nextpages = pages + 1;
		modelAndView.addObject("nextpages", nextpages);
		modelAndView.addObject("newsList", newsList);
		modelAndView.addObject("pages", pages);
		modelAndView.addObject("totalpages", totalpages);
		modelAndView.setViewName("user/manage/webManage/newsList");
		return modelAndView;
	}
	/*
	 * 文章通过审核
	 */
	@RequestMapping("passNewsByidJubao")
	public String passNewsByid(HttpServletRequest request, HttpSession sessions)
			throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		News news = new News();
		news.setStatus(1);
		if (doNews(request, sessions, news) == 1) {
			return "redirect:/findNewsJubao.action";
		} else {
			modelAndView.addObject("message", "出现错误！！");
			return "failure";
		}
	}

	/*
	 * 文章驳回审核
	 */
	@RequestMapping("/backNewsByidJubao")
	public String backNewsByid(HttpServletRequest request, HttpSession sessions)
			throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		News news = new News();
		news.setStatus(2);
		if (doNews(request, sessions, news) == 1) {
			return "redirect:/findNewsJubao.action";
		} else {
			modelAndView.addObject("message", "出现错误！！");
			return "failure";
		}
	}

	/*
	 * 删除文章
	 */
	@RequestMapping("/delNewsByidJubao")
	public String delNewsByid(HttpServletRequest request, HttpSession sessions)
			throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		String strid = request.getParameter("newsid");
		if (reviewSerivce.delNewsByid(Integer.parseInt(strid)) == 1) {
			modelAndView.addObject("message", "出现错误！！");
			return "success";
		} else {
			modelAndView.addObject("message", "出现错误！！");
			return "failure";
		}
	}

	/*
	 * 更新news状态
	 */
	public int doNews(HttpServletRequest request, HttpSession session, News news)
			throws Exception {
		String strid = request.getParameter("newsid");
		news.setNewsid(Integer.parseInt(strid));
		return reviewSerivce.updateNews(news);
	}
}
