package com.jd.dao;

import java.util.List;

import com.jd.model.New;

public interface NewDao {
	public int insertNew(New news);//插入新闻
	
	public List<Object> showNew(int pageNow,int pageSize,String biao,String where);//查询所有新闻
	
	public New findNewByNid(int nid);//查询某条新闻
	
	public int updateNew(New news);//更新新闻
	
	public int delNew(int nid);//删除新闻
	
	public List<New>findAllNewByCid(int ncid,int count);//查询分类下新闻

}
