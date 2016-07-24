package com.jd.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.jd.model.NewCategory;
import com.jd.service.NewCategoryService;

public class NewCategoryController extends HttpServlet {
	private NewCategoryService newCategoryService;
	public void setNewCategoryService() {
		this.newCategoryService = new NewCategoryService();
	}

	public void setNewCategory() {
		this.newCategory = new NewCategory();
	}
	private NewCategory newCategory;
	private int cid;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The doGet method of the servlet. <br>
	 * 
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request
	 *            the request send by the client to the server
	 * @param response
	 *            the response send by the server to the client
	 * @throws ServletException
	 *             if an error occurred
	 * @throws IOException
	 *             if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("utf-8");
		String act = request.getParameter("act");
		if (act != null && act.equals("show_insert_page")) {
			getCategoryList(request, response);//获取分类列表
			request.getRequestDispatcher("/admin/new/addNewClass.jsp").forward(request, response);
		} else if (act != null && act.equals("show_list")) {
			getCategoryList(request, response);//获取分类列表
			request.getRequestDispatcher("/admin/new/showNewClass.jsp").forward(request, response);
		}else if (act != null && act.equals("del")){
			if(request.getParameter("cid")!=null){
				cid=Integer.parseInt(request.getParameter("cid"));
				setNewCategoryService();//创建NewCategoryService对象
				if(newCategoryService.findNewCategoriesByFid(cid)!=0){
					response.sendRedirect("/Company/error.jsp?controller=NewCategoryController&act=show_list&message=dnc");
				}else{
					if(1==newCategoryService.delCategories(cid)){
						
						response.sendRedirect("/Company/NewCategoryController?act=show_list");
					}
				}
			}
			
		}else if(act != null && act.equals("show_update_page")){
			if(request.getParameter("cid")!=null){
				
				cid=Integer.parseInt(request.getParameter("cid"));
				setNewCategoryService();//创建NewCategoryService对象
				request.setAttribute("Category",newCategoryService.findNewCategoriesByCid(cid));
				getCategoryList(request, response);//获取分类列表
				request.getRequestDispatcher("/admin/new/updateNewClass.jsp").forward(request, response);
				
			}
			
			
		}
	}

	/**
	 * The doPost method of the servlet. <br>
	 * 
	 * This method is called when a form has its tag value method equals to
	 * post.
	 * 
	 * @param request
	 *            the request send by the client to the server
	 * @param response
	 *            the response send by the server to the client
	 * @throws ServletException
	 *             if an error occurred
	 * @throws IOException
	 *             if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		String act = request.getParameter("act");
		if (act != null && act.equals("insert")) {
			dealnewCategory(request,response);//处理分类数据
			
			if (1 == newCategoryService.insertCategories(newCategory)) {
				response.sendRedirect("/Company/success.jsp?controller=NewCategoryController&act=show_insert_page");
				
			} else {

			}
		}else if(act != null && act.equals("update")){
			dealnewCategory(request,response);//处理分类数据
			if (1 == newCategoryService.updateCategories(newCategory)) {
				response.sendRedirect("/Company/NewCategoryController?act=show_list");
			} else {

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
	 * 处理分类信息
	 * */
	public void dealnewCategory(HttpServletRequest request, HttpServletResponse response){
		setNewCategory();//创建NewCategory对象
		newCategory.setCname(request.getParameter("cname"));
		newCategory.setFid(Integer.parseInt(request.getParameter("cid")));
		if(request.getParameter("id")!=null){
			newCategory.setCid(Integer.parseInt(request.getParameter("id")));
		}
	
		setNewCategoryService();//创建NewCategoryService对象
		newCategory.setLevel(newCategoryService.findLevel(Integer.parseInt(request.getParameter("cid")),"new_class"));
	}

}
