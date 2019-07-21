package com.wmx.op.service;

import java.util.List;

import org.omg.PortableInterceptor.INACTIVE;

import com.wmx.op.po.Anime;
import com.wmx.op.po.AnimeCustom;
import com.wmx.op.po.AnimeExample;

public interface AnimeService {
	//查询首页动画列表
	public List<Anime> findAnime()throws Exception;
	//查询首页动画列表
	public List<Anime> findAnimeAll(AnimeExample example)throws Exception;
	//逆序查询动画列表
	public List<Anime> findAnimeAllASC(AnimeExample example)throws Exception;
	//查询单个动画
	public Anime findAnimeByid(Integer animeid)throws Exception;
	//上传动画信息
	public int updateAnime(Anime anime)throws Exception;
	//管理分页
	public List<Anime> selectAnimeByPage(AnimeCustom animeCustom)throws Exception;
	//查询总数
	public int selecCount(AnimeExample example)throws Exception;
	//修改动画信息
	public int updateAnimeByid(Anime anime)throws Exception;
	//按id删除动画
	public int delAnimeByid(Integer animeid)throws Exception;
}
