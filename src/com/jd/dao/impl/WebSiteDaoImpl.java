package com.jd.dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.jd.dao.WebSiteDao;
import com.jd.model.WebSite;
import com.jd.util.SqlHelper;

public class WebSiteDaoImpl implements WebSiteDao {
	private WebSite webSite ;
	/**
	 * 查询站点所有信息
	 * */
	@Override
	public WebSite findAll() throws SQLException {
		// TODO Auto-generated method stub
		String sql="select * from website";
		PreparedStatement ps=SqlHelper.getConnection().prepareStatement(sql);
		ResultSet rs=ps.executeQuery();
	    if(rs.next()){
	    	webSite=new WebSite();
	    	webSite.setId(rs.getInt("id"));
	    	webSite.setKeywords(rs.getString("keywords"));
	    	webSite.setDescption(rs.getString("descption"));
	    	webSite.setCopy(rs.getString("copy"));
	    	webSite.setAddr(rs.getString("addr"));
	    	webSite.setMoblie(rs.getLong("moblie"));
	    	
	    }
	    SqlHelper.closeConnect();
		return webSite;
	}
	/**
	 * 更新站点所有信息
	 * */
	@Override
	public int updateAll(WebSite webSite) {
		int count=0;
		// TODO Auto-generated method stub
		String sql="update website set keywords=?,descption=?,copy=?,addr=?,moblie=? where id=?";
		try {
			PreparedStatement ps=SqlHelper.getConnection().prepareStatement(sql);
			ps.setString(1, webSite.getKeywords());
			ps.setString(2, webSite.getDescption());
			ps.setString(3, webSite.getCopy());
			ps.setString(4, webSite.getAddr());
			ps.setLong(5, webSite.getMoblie());
			ps.setInt(6, webSite.getId());
			count=ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SqlHelper.closeConnect();
		return count;
	}

}
