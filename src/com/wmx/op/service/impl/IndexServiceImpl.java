package com.wmx.op.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.wmx.op.mapper.AnimeMapper;
import com.wmx.op.mapper.ComicsMapper;
import com.wmx.op.mapper.InformationMapper;
import com.wmx.op.mapper.NewsMapper;
import com.wmx.op.mapper.PictureMapper;
import com.wmx.op.mapper.UservideoMapper;
import com.wmx.op.po.Anime;
import com.wmx.op.po.AnimeExample;
import com.wmx.op.po.Comics;
import com.wmx.op.po.ComicsExample;
import com.wmx.op.po.Information;
import com.wmx.op.po.InformationExample;
import com.wmx.op.po.News;
import com.wmx.op.po.NewsExample;
import com.wmx.op.po.Picture;
import com.wmx.op.po.PictureExample;
import com.wmx.op.po.Uservideo;
import com.wmx.op.po.UservideoExample;
import com.wmx.op.service.IndexService;

public class IndexServiceImpl implements IndexService {
	@Autowired
	private ComicsMapper comicsMapper;
	@Autowired
	private NewsMapper newsMappper;
	@Autowired
	private AnimeMapper animeMapper;
	@Autowired
	private InformationMapper informationMapper;
	@Autowired
	private PictureMapper pictureMapper;
	@Autowired
	private UservideoMapper uservideoMapper;
	public List<Comics> findComics(ComicsExample comics) throws Exception {
		return comicsMapper.selectByIndex(comics);
	}

	public List<News> findNews(NewsExample news) throws Exception {
		return newsMappper.selectByIndex(news);
	}

	public List<Anime> findAnime() throws Exception {
		return animeMapper.selectIndexAnime();
	}

	public List<Information> findInformation(InformationExample information) throws Exception {
		return informationMapper.selectByIndex(information);
	}

	public List<Picture> findPicture(PictureExample example) throws Exception {
		return pictureMapper.selectByIndex(example);
	}

	public List<Uservideo> findUservideo(UservideoExample example)
			throws Exception {
		return uservideoMapper.selectByIndex(example);
	}

}
