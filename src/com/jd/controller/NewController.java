package com.jd.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jd.model.New;
import com.jd.model.NewCategory;
import com.jd.service.NewCategoryService;
import com.jd.service.NewService;

public class NewController extends HttpServlet {
	private NewCategoryService newCategoryService;
	public void setNewCategoryService() {
		this.newCategoryService = new NewCategoryService();
	}
	private New news;
	public void setNews() {
		this.news = new New();
	}
	private NewService newService;
	public void setNewService() {
		this.newService = new NewService();
	}
	
	/**
	 * 新闻控制器
	 */
	private static final long serialVersionUID = 1L;

	@SuppressWarnings("unchecked")
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		String act = request.getParameter("act");
		if (act != null && act.equals("show_insert_page")) {
			getCategoryList(request, response);//获取分类列表
			request.getRequestDispatcher("/admin/new/addNew.jsp").forward(request, response);
		}else if(act != null && act.equals("show_list_page")){
			int pageNow=1;
			int pageSize=5;
			String biao="new";
			String where="";
			if(request.getParameter("pageNow")!=null){
				pageNow=Integer.parseInt(request.getParameter("pageNow"));
			}
			setNewService();
			List<Object> objects=newService.showNew(pageNow, pageSize, biao, where);
			request.setAttribute("pageCount", (Integer)objects.get(0));
			request.setAttribute("pageNow", pageNow);
			request.setAttribute("news", (List<New>)objects.get(1));
			request.getRequestDispatcher("/admin/new/showNew.jsp").forward(request, response);
		}else if(act != null && act.equals("show_update_page")){
			int nid=0;
			if(request.getParameter("nid")!=null){
				nid=Integer.parseInt(request.getParameter("nid"));
			}else{
				return;
			}
			setNewService();
			request.setAttribute("new", newService.findNewByNid(nid));
			getCategoryList(request, response);//获取分类列表
			request.getRequestDispatcher("/admin/new/updateNew.jsp").forward(request, response);
			
		}else if(act!=null&& act.equals("del")){
			int nid=0;
			if(request.getParameter("nid")!=null){
				nid=Integer.parseInt(request.getParameter("nid"));
			}else{
				return;
			}
			setNewService();
			if(1==newService.delNew(nid)){
				response.sendRedirect("/Company/success.jsp?controller=NewController&act=show_list_page&pageNow=1");
			}
			
		}else if(act!=null&& act.equals("show_detail_page")){
			int nid=0;
			if(request.getParameter("nid")!=null){
				nid=Integer.parseInt(request.getParameter("nid"));
				
			}else{
				return;
			}
			setNewService();
			response.getWriter().println(objectToJson(newService.findNewByNid(nid)));
		}

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			request.setCharacterEncoding("UTF-8");
			String act = request.getParameter("act");
			if (act != null && act.equals("insert")) {//添加新闻
				dealnewCategory(request,response);//处理分类数据
				
				setNewService();
				if (1 == newService.insertNew(news)) {
					response.sendRedirect("/Company/success.jsp?controller=NewController&act=show_insert_page");
					
				} else {
					response.sendRedirect("/Company/error.jsp?controller=NewController&act=show_insert_page&message=an");
				}
			}else if(act != null && act.equals("update")){
				dealnewCategory(request,response);//处理分类数据
				setNewService();
				if (1 == newService.updateNew(news)) {
					response.sendRedirect("/Company/success.jsp?controller=NewController&act=show_list_page&pageNow=1");
				}else{
					return;
				}
			}
	}
	
	/**
	 * 获取获取分类列表
	 * */
	public void getCategoryList(HttpServletRequest request, HttpServletResponse response){
		setNewCategoryService();//创建NewCategoryService对象
		List<NewCategory> categories = newCategoryService.findCategories();
		int fid = 0;
		List<NewCategory> classes = newCategoryService.getSortCate(categories, fid);
		request.setAttribute("classes", classes);
	}
	/**
	 * 处理新闻信息
	 * */
	public void dealnewCategory(HttpServletRequest request, HttpServletResponse response){
		setNews();//创建NewCategory对象
		if(request.getParameter("nid")!=null){
		news.setNid(Integer.parseInt(request.getParameter("nid")));
		}
		if(request.getParameter("npic")!=null){
		news.setNpic(request.getParameter("npic"));
		}
		news.setNname(request.getParameter("nname"));
		news.setNauthor(request.getParameter("nauthor"));
		news.setNhit(Integer.parseInt(request.getParameter("nhit")));
		news.setNcontent(request.getParameter("content"));
	    news.setNcid(Integer.parseInt(request.getParameter("cid")));
	    
	}
public String objectToJson(Object object) throws JsonProcessingException{
	    ObjectMapper mapper = new ObjectMapper();
		mapper.writeValueAsString(object);
		return mapper.writeValueAsString(object);
	}

}
