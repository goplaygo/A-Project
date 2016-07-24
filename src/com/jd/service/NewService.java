package com.jd.service;

import java.util.List;

import com.jd.dao.NewDao;
import com.jd.dao.impl.NewDaoImpl;
import com.jd.exception.SiteException;
import com.jd.model.New;

public class NewService {
	private NewDao newDao;
	private int count=0;
	public void setNewDao() {
		this.newDao = new NewDaoImpl();
	}
	/**
	 * 添加新闻
	 * */
	public int insertNew(New news){
		setNewDao();
		count=newDao.insertNew(news);
		if(count==0){
			try {
				throw new SiteException("插入新闻失败");
			} catch (SiteException e) {
				// TODO Auto-generated catch block
				e.getMessage();
			}
		}
		
		return count;
		
	}
	/**
	 * 查询所有新闻
	 * */
	public List<Object> showNew(int pageNow, int pageSize, String biao,
			String where){
		setNewDao();
		List<Object> objects=newDao.showNew(pageNow, pageSize, biao, where);
		if(objects.isEmpty()){
    		try {
				throw new SiteException("查询失败！");
			} catch (SiteException e) {
				// TODO Auto-generated catch block
				e.getMessage();
			}
    	}
		return objects;
	}
	/**
	 * 查询某条新闻
	 * */
	public New findNewByNid(int nid) {
		setNewDao();
		return newDao.findNewByNid(nid);
	}
	/**
	 * 更新新闻
	 * */
	public int updateNew(New news){
		setNewDao();
		count=newDao.updateNew(news);
		if(count==0){
			try {
				throw new SiteException("更新新闻失败");
			} catch (SiteException e) {
				// TODO Auto-generated catch block
				e.getMessage();
			}
		}
		
		return count;
		
	}
	/**
	 * 删除新闻
	 * */
	public int delNew(int nid) {
		setNewDao();
		count=newDao.delNew(nid);
		if(count==0){
			try {
				throw new SiteException("删除新闻失败");
			} catch (SiteException e) {
				// TODO Auto-generated catch block
				e.getMessage();
			}
		}
		
		return count;
		
	}
	/**
	 * 查询分类下的新闻
	 * */
	public List<New> findAllNewByCid(int ncid,int count){
		setNewDao();
    	return newDao.findAllNewByCid(ncid,count);
    }
}
