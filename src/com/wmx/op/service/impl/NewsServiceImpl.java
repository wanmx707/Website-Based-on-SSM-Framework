package com.wmx.op.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.wmx.op.mapper.NewsMapper;
import com.wmx.op.po.News;
import com.wmx.op.po.NewsCustom;
import com.wmx.op.po.NewsExample;
import com.wmx.op.service.NewsService;

public class NewsServiceImpl implements NewsService {
	@Autowired
	private NewsMapper newsMapper;

	public News findNewsDetail(Integer method) throws Exception {
		return newsMapper.selectByPrimaryKey(method);
	}

	// 查询总数
	public int countNews(NewsExample example) throws Exception {
		return newsMapper.countByExample(example);
	}

	// 分页查询
	public List<News> findNewsbyPage(NewsCustom newsCustom) throws Exception {
		return newsMapper.selectByPage(newsCustom);
	}

	// 用户写文章
	public int insertNewsByuser(News news) throws Exception {
		return newsMapper.insert(news);
	}

	// 用户分页查询
	public List<News> findUserNewsbyPage(NewsCustom newsCustom)
			throws Exception {
		return newsMapper.findUserNewsbyPage(newsCustom);
	}

	// 更新文章
	public int updateNewsById(News news) throws Exception {
		return newsMapper.updateByPrimaryKeySelective(news);
	}

}
