package com.jd.dao;

import java.util.List;

import com.jd.model.NewCategory;

public interface NewCategoryDao {
	public List <NewCategory> findAllCategories();//查询所有分类
	public int findLevel(int fid,String tableName);//查询级别
	public int insertCategories(NewCategory newCategory);//添加分类
	public NewCategory findNewCategoriesByCid(int cid);//查询分类
	public int findNewCategoriesByFid(int cid);//查询分类子类
	public int delCategories(int cid);//删除分类
	public int updateCategories(NewCategory newCategory);//修改分类
	
}
