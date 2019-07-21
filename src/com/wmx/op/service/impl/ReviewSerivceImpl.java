package com.wmx.op.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.wmx.op.mapper.NewsMapper;
import com.wmx.op.mapper.PictureMapper;
import com.wmx.op.mapper.UservideoMapper;
import com.wmx.op.po.News;
import com.wmx.op.po.NewsCustom;
import com.wmx.op.po.Picture;
import com.wmx.op.po.PictureCustom;
import com.wmx.op.po.Uservideo;
import com.wmx.op.po.UservideoCustom;
import com.wmx.op.po.UservideoExample;
import com.wmx.op.service.ReviewSerivce;

public class ReviewSerivceImpl implements ReviewSerivce {
	@Autowired
	private UservideoMapper uservideoMapper;
	@Autowired
	private PictureMapper pictureMapper;
	@Autowired
	private NewsMapper newsMapper;
	public List<Uservideo> findVideo(UservideoExample example) {
		return uservideoMapper.selectByExample(example);
	}

	//查询未审核视频总数
	public int findcountstatus() throws Exception {
		return uservideoMapper.selectstatus();
	}
	//视频审核分页查询
	public List<Uservideo> findvideBystatus(UservideoCustom uservideoCustom)
			throws Exception {
		return uservideoMapper.selectBystatus(uservideoCustom);
	}
	//视频审核更新
	public int updatevideo(Uservideo uservideo) throws Exception {
		return uservideoMapper.updateByPrimaryKeySelective(uservideo);
	}

	/*
	 * 图片审核
	 */
	public int findcountstatusPic(PictureCustom pictureCustom) throws Exception {
		return pictureMapper.selectstatusPage(pictureCustom);
	}

	public List<Picture> findpictureBystatus(PictureCustom pictureCustom)
			throws Exception {
		return pictureMapper.selectstatusByPage(pictureCustom);
	}
	//更新状态
	public int updatepicture(Picture picture) throws Exception {
		return pictureMapper.updateByPrimaryKeySelective(picture);
	}

	//按id删除图片
	public int delpicByid(Integer id) throws Exception {
		return pictureMapper.deleteByPrimaryKey(id);
	}
	/*
	 * 文章审核
	 */
	//查询未审核文章数
	public int findcountstatusNews( ) throws Exception {
		return newsMapper.countBystatus();
	}

	//分页查询审核文章
	public List<News> findNewsBystatus(NewsCustom newsCustom)
			throws Exception {
		return newsMapper.findNewsstatusbyPage(newsCustom);
	}

	//更新文章审核结果
	public int updateNews(News news) throws Exception {
		return newsMapper.updateByPrimaryKeySelective(news);
	}

	//删除文章
	public int delNewsByid(Integer id) throws Exception {
		return newsMapper.deleteByPrimaryKey(id);
	}

	//举报分页查询
	public List<News> findNewsByJubao(NewsCustom newsCustom) throws Exception {
		return newsMapper.findNewsstatusbyPageByJubao(newsCustom);
	}
}
