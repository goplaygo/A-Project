package com.jd.service;

import java.sql.SQLException;

import com.jd.dao.WebSiteDao;
import com.jd.dao.impl.WebSiteDaoImpl;
import com.jd.exception.SiteException;
import com.jd.model.WebSite;

public class WebSiteService {
	private WebSiteDao webSiteDao;
	
	public void setWebSiteDao() {
		this.webSiteDao = new WebSiteDaoImpl();
	}
	/**
	 * 查询站点所有的信息
	 * */
	public WebSite findAll() throws SQLException{
		setWebSiteDao();//创建webSiteDao对象
		WebSite webSite=webSiteDao.findAll();
		if(webSite.getId()==0){
			try {
				throw new SiteException("站点查询失败！");
			} catch (SiteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return webSite;
	}
	/**
	 * 更新站点所有的信息
	 * */
	public int updateAll(WebSite webSite) throws SQLException{
		setWebSiteDao();//创建webSiteDao对象
		int count=webSiteDao.updateAll(webSite);
		return count;
	}
}
