package com.wmx.op.service;

import java.util.List;

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


public interface IndexService {
	public List<Comics> findComics(ComicsExample comics)throws Exception; 
	
	public List<News> findNews(NewsExample news)throws Exception;
	
	public List<Anime> findAnime()throws Exception;
	
	public List<Information> findInformation(InformationExample information)throws Exception;
	
	public List<Picture> findPicture(PictureExample example)throws Exception;
	
	public List<Uservideo> findUservideo(UservideoExample example)throws Exception;
}
