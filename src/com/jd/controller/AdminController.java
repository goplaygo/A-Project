package com.jd.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jd.model.Admin;
import com.jd.service.AdminService;
import com.jd.util.MD5;
public class AdminController extends HttpServlet {

	/**
	 * 管理员控制器
	 */
	private static final long serialVersionUID = 1L;
    private Admin admin;
    private AdminService adminService;
	public void setAdminService() {
		this.adminService = new AdminService();
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String act=request.getParameter("act");
		if(act!=null&&act.equals("logout")){
			HttpSession session=request.getSession(false);
			session.removeAttribute("name");
			session.removeAttribute("pid");
			session.removeAttribute("is_login");
			response.sendRedirect("/Company/admin/login.jsp");
		}
	
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String act=request.getParameter("act");
		if(act!=null&&act.equals("login")){
			String aname=request.getParameter("aname");
			String apassword=request.getParameter("apassword");
			
			if(aname==null||apassword==null||aname.equals("")||apassword.equals("")){
				response.sendRedirect("/Company/admin/login.jsp?code=1");
				return;
			}
			apassword=MD5.GetMD5Code(apassword);
			setAdminService();
			Object[] objects=new Object[2];  
			objects=adminService.findAdminByName(aname, apassword);
			if((Integer)objects[1]==1){
				   HttpSession session=request.getSession(true);//创建session对象
				   admin=(Admin)objects[0];
		           session.setAttribute("name",admin.getAname());
		           session.setAttribute("pid",admin.getPid());
		           session.setAttribute("is_login", "ok");
				   response.sendRedirect("/Company/admin");
				
			}else{
				
				response.sendRedirect("/Company/admin/login.jsp?code=2");
			}
		}

	}

}
