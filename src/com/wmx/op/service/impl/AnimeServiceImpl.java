package com.wmx.op.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.wmx.op.mapper.AnimeMapper;
import com.wmx.op.po.Anime;
import com.wmx.op.po.AnimeCustom;
import com.wmx.op.po.AnimeExample;
import com.wmx.op.service.AnimeService;

public class AnimeServiceImpl implements AnimeService {
	@Autowired
	private AnimeMapper animeMapper;
	//查询首页动画列表
	public List<Anime> findAnime() throws Exception {
		return animeMapper.selectIndexAnime();
	}
	//按id查询动画
	public Anime findAnimeByid(Integer animeid) throws Exception {
		return animeMapper.selectByPrimaryKey(animeid);
	}
	//上传动画
	public int updateAnime(Anime anime) throws Exception {
		return animeMapper.insertSelective(anime);
	}
	//管理分页
	public List<Anime> selectAnimeByPage(AnimeCustom animeCustom)
			throws Exception {
		return animeMapper.selectAnimeByPage(animeCustom);
	}
	//查询总数
	public int selecCount(AnimeExample example) throws Exception {
		return animeMapper.countByExample(example);
	}
	//修改动画信息
	public int updateAnimeByid(Anime anime) throws Exception {
		return animeMapper.updateByPrimaryKeySelective(anime);
	}
	//按id删除动画
	public int delAnimeByid(Integer animeid) throws Exception {
		return animeMapper.deleteByPrimaryKey(animeid);
	}
	//查询动画列表
	public List<Anime> findAnimeAll(AnimeExample example) throws Exception {
		return animeMapper.selectByExample(example);
	}
	//升序查询动画列表
	public List<Anime> findAnimeAllASC(AnimeExample example) throws Exception {
		return animeMapper.selectASCAnime(example);
	}

}
