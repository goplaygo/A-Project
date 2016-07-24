package com.jd.controller.front;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jd.model.WebSite;
import com.jd.service.NewService;
import com.jd.service.WebSiteService;

public class IndexController extends HttpServlet {
	private WebSite WebSite;
	private WebSiteService webSiteService;
	private NewService newService;
	/**
	 * 首页控制器
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		    webSiteService=new WebSiteService();
			try {
				WebSite=webSiteService.findAll();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		request.setAttribute("Website", WebSite);
		newService=new NewService();
		request.setAttribute("studynews", newService.findAllNewByCid(25, 6));
		
		request.getRequestDispatcher("/index.jsp").forward(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
