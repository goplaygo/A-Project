package com.jd.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jd.model.WebSite;
import com.jd.service.WebSiteService;

public class WebSiteController extends HttpServlet {

	private WebSiteService webSiteService;
	private WebSite webSite;

	public void setWebSite() {
		this.webSite =new WebSite();
	}

	public void setWebSiteService() {
		this.webSiteService =new WebSiteService() ;
	}

	/**
	 *站点基本信息
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		setWebSiteService();//创建webSiteService对象
		try {
			webSite=webSiteService.findAll();//查询站点信息
			if(webSite!=null){
				request.setAttribute("webSite", webSite);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		request.getRequestDispatcher("/admin/system/website.jsp").forward(request, response);
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			request.setCharacterEncoding("UTF-8");
			int count=0;
			setWebSite();//创建WebSite对象
			webSite.setId(Integer.parseInt(request.getParameter("id")));
			webSite.setKeywords(request.getParameter("keywords"));
			webSite.setKeywords(request.getParameter("keywords"));
			webSite.setDescption(request.getParameter("descption"));
			webSite.setCopy(request.getParameter("copy"));
			webSite.setAddr(request.getParameter("addr"));
			webSite.setMoblie(Long.parseLong(request.getParameter("mobile")));
			if(webSite.getKeywords()!=null){
				setWebSiteService();//创建webSiteService对象
				try {
					count=webSiteService.updateAll(webSite);
					if(count!=0){
						webSite=webSiteService.findAll();
						request.setAttribute("webSite", webSite);
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			request.getRequestDispatcher("/admin/system/website.jsp").forward(request, response);
	}

}
