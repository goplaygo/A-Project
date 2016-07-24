package com.jd.dao;

import java.sql.SQLException;

import com.jd.model.WebSite;

public interface WebSiteDao {
	public WebSite findAll() throws SQLException;//查询站点所有信息
	public int updateAll(WebSite webSite);//更新站点信息
}
