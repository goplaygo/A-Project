package com.jd.service;

import com.jd.dao.AdminDao;
import com.jd.dao.impl.AdminDaoImpl;
import com.jd.model.Admin;

public class AdminService {
	private AdminDao adminDao;
	private int count=0;
	private Admin admin;
	public void setAdminDao() {
		this.adminDao =new AdminDaoImpl();
	}
	/**
	 * 查询管理员用户
	 * */
	public Object[] findAdminByName(String aname,String apassword) {
		setAdminDao();
		admin=adminDao.findAdminByName(aname);
		if(admin.getAname()!=null&&admin.getApassword().equals(apassword)){
			count=1;
		}
		Object[] object=new Object[2];
		object[0]=admin;
		object[1]=count;
		return object;
	}

}
