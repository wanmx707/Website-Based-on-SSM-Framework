package com.wmx.op.service;

import java.util.List;

import com.wmx.op.po.News;
import com.wmx.op.po.NewsCustom;
import com.wmx.op.po.Picture;
import com.wmx.op.po.PictureCustom;
import com.wmx.op.po.Uservideo;
import com.wmx.op.po.UservideoCustom;
import com.wmx.op.po.UservideoExample;

/**视频审核接口
 * @author 温孟旋
 *
 */
public interface ReviewSerivce {
	/*
	 * 视频审核
	 */
	public List<Uservideo> findVideo(UservideoExample example);
	//查询视频总数
	public int findcountstatus()throws Exception;
	//审核分页查询
	public List<Uservideo> findvideBystatus(UservideoCustom uservideoCustom)throws Exception;
	//审核更新
	public int updatevideo(Uservideo uservideo)throws Exception;
	/*
	 * 图片审核 
	 */
	//查询视频总数
	public int findcountstatusPic(PictureCustom pictureCustom)throws Exception;
	//审核分页查询
	public List<Picture> findpictureBystatus(PictureCustom pictureCustom)throws Exception;
	//审核更新
	public int updatepicture(Picture picture)throws Exception;
	//按id删除图片
	public int delpicByid(Integer id)throws Exception;
	/*
	 * 文章审核 
	 */
	//查询文章总数
	public int findcountstatusNews()throws Exception;
	//审核分页查询
	public List<News> findNewsBystatus(NewsCustom newsCustom)throws Exception;
	//举报分页查询
	public List<News> findNewsByJubao(NewsCustom newsCustom)throws Exception;
	//审核更新
	public int updateNews(News news)throws Exception;
	//按id删除文章
	public int delNewsByid(Integer id)throws Exception;
}
