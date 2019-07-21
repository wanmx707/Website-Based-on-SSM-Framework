package com.wmx.op.service;

import java.util.List;

import com.wmx.op.po.News;
import com.wmx.op.po.NewsCustom;
import com.wmx.op.po.NewsExample;

/**
 * 分析文章
 * @author 温孟旋
 *
 */
public interface NewsService {
	//查询总数
	public int countNews(NewsExample example)throws Exception;
	//分页查询
	public List<News> findNewsbyPage(NewsCustom newsCustom)throws Exception;
	//用户分页查询
	public List<News> findUserNewsbyPage(NewsCustom newsCustom)throws Exception;
	//按id查询
	public News findNewsDetail(Integer method)throws Exception;
	//用户写文章
	public int insertNewsByuser(News news)throws Exception;
	//更新文章
	public int updateNewsById(News news)throws Exception;
}
