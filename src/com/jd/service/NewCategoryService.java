package com.jd.service;

import java.util.ArrayList;
import java.util.List;

import com.jd.dao.NewCategoryDao;
import com.jd.dao.impl.NewCategoryDaoImpl;
import com.jd.exception.NewException;
import com.jd.model.NewCategory;

public class NewCategoryService {
	public void setNewCategoryDao() {
		this.newCategoryDao = new NewCategoryDaoImpl();
	}
	private List<NewCategory> categories;
	private NewCategoryDao newCategoryDao;
	private List<NewCategory> cates=new ArrayList<NewCategory>();
	private int count;
	/**
	 * 获取所有分类
	 * */
	public List<NewCategory> findCategories(){
		setNewCategoryDao();//创建newCategoryDao对象
		categories=newCategoryDao.findAllCategories();
		return categories;
	}
	/**
	 * 分类排序
	 * */
	public List<NewCategory>getSortCate(List<NewCategory> cats,int fid){
		for(int i=0;i<cats.size();i++){
			if(fid==cats.get(i).getFid()){
				cates.add(cats.get(i));
				getSortCate(cats, cats.get(i).getCid());
			}
			
		}
		
		return cates;
	}
	/**
	 * 无限分类得到层级level
	 * */
	public int findLevel(int fid,String tableName){
		setNewCategoryDao();//创建newCategoryDao对象
		return newCategoryDao.findLevel(fid, tableName);
	}
	/**
	 * 添加分类
	 * */
	public int insertCategories(NewCategory newCategory) {
		setNewCategoryDao();//创建newCategoryDao对象
		count=newCategoryDao.insertCategories(newCategory);
		if(0==count){
			try {
				throw new NewException("添加新闻分类异常！");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.getMessage();
			}
		}
		return count;
	}
	/**
	 * 查询某个分类
	 * */
	public NewCategory findNewCategoriesByCid(int cid){
		setNewCategoryDao();//创建newCategoryDao对象
		return newCategoryDao.findNewCategoriesByCid(cid);
	}
	/**
	 * 更新某个分类
	 * */
	public int updateCategories(NewCategory newCategory){
		setNewCategoryDao();//创建newCategoryDao对象
		count=newCategoryDao.updateCategories(newCategory);
		if(0==count){
			try {
				throw new NewException("更新新闻分类异常！");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.getMessage();
			}
		}
		return count;
	}
	/**
	 * 删除某个分类
	 * */
	public int delCategories(int cid){
		setNewCategoryDao();//创建newCategoryDao对象
		count=newCategoryDao.delCategories(cid);
		if(0==count){
			try {
				throw new NewException("删除新闻分类异常！");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.getMessage();
			}
		}
		return count;
	}
	/**
	 * 查询某个分类子类
	 * */
	public int findNewCategoriesByFid(int cid) {
		setNewCategoryDao();//创建newCategoryDao对象
		count=newCategoryDao.findNewCategoriesByFid(cid);
		return count;
	}
	
}
