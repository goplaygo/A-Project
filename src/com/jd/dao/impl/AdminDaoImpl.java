package com.jd.dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.jd.dao.AdminDao;
import com.jd.model.Admin;
import com.jd.util.SqlHelper;

public class AdminDaoImpl implements AdminDao {
	private Admin admin;
	private int count = 0;
	private PreparedStatement ps = null;
	private ResultSet rs = null;
	private String sql = null;
	/**
	 * 查询管理员用户
	 * */
	@Override
	public Admin findAdminByName(String aname) {
		// TODO Auto-generated method stub
		sql="select * from admin where aname=?";
		admin=new Admin();
		try {
			ps=SqlHelper.getConnection().prepareStatement(sql);
			ps.setString(1, aname);
			rs=ps.executeQuery();
			if(rs.next()){
				admin.setAid(rs.getInt("aid"));
				admin.setAname(rs.getString("aname"));
				admin.setApassword(rs.getString("apassword"));
				admin.setPid(rs.getString("pid"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SqlHelper.closeConnect();
		return admin;
	}

}
