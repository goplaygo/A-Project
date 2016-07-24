package com.jd.controller.front;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jd.model.New;
import com.jd.model.NewCategory;
import com.jd.model.WebSite;
import com.jd.service.NewCategoryService;
import com.jd.service.NewService;
import com.jd.service.WebSiteService;

public class NewFrontController extends HttpServlet {
	private WebSiteService webSiteService;
	private WebSite website;
	private NewCategoryService newCategoryService;
	private List<NewCategory> newCategories;
	private NewService newService;
	/**
	 * 前台新闻控制器
	 */
	private static final long serialVersionUID = 1L;

	@SuppressWarnings("unchecked")
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String act=request.getParameter("act");
		if(act!=null&&act.equals("show_list_page")){
			int ncid=Integer.parseInt(request.getParameter("ncid"));
			/**
			 * 站点基本信息
			 **/
			webSiteService=new WebSiteService();
			try {
				website=webSiteService.findAll();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			request.setAttribute("website", website);
			/**
			 * 新闻分类
			 * */
			newCategoryService=new NewCategoryService();//创建service层对象
			newCategories=newCategoryService.findCategories();//调用service层查询所有分类方法
			request.setAttribute("categories", newCategoryService.getSortCate(newCategories, 0));//获取排序分类，添加到request作用域
			/**
			 * 新闻列表
			 * */
			int pageNow=1;
			int pageSize=1; 
			String biao="new";
			String where="ncid="+ncid;
			if(request.getParameter("pageNow")!=null){
				pageNow=Integer.parseInt(request.getParameter("pageNow"));
			}
			newService=new NewService();
		    List<Object> objects=newService.showNew(pageNow, pageSize, biao, where);
			request.setAttribute("pageCount", (Integer)objects.get(0));
			request.setAttribute("news", (List<New>)objects.get(1));
			request.setAttribute("pageNow", pageNow);
			request.setAttribute("ncid", ncid);
			request.getRequestDispatcher("/newList.jsp").forward(request, response);
		}else if(act!=null&&act.equals("show_detail_page")){
			int nid=Integer.parseInt(request.getParameter("nid"));
			/**
			 * 站点基本信息
			 **/
			webSiteService=new WebSiteService();
			try {
				website=webSiteService.findAll();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			request.setAttribute("website", website);
			/**
			 * 新闻分类
			 * */
			newCategoryService=new NewCategoryService();//创建service层对象
			newCategories=newCategoryService.findCategories();//调用service层查询所有分类方法
			request.setAttribute("categories", newCategoryService.getSortCate(newCategories, 0));//获取排序分类，添加到request作用域
			/**
			 * 新闻详情
			 * */
			newService=new NewService();
			request.setAttribute("new", newService.findNewByNid(nid));
			request.getRequestDispatcher("/newDetail.jsp").forward(request, response);
		}
		
	}


	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {


	}

}
