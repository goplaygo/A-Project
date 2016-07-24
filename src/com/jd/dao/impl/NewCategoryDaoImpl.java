package com.jd.dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.jd.dao.NewCategoryDao;
import com.jd.model.NewCategory;
import com.jd.util.SqlHelper;

public class NewCategoryDaoImpl implements NewCategoryDao{
	private NewCategory newCategory;
	private PreparedStatement ps=null;
	private ResultSet rs=null;
	private int count=0;
	private String sql=null;
	/**
	 * 查询所有分分类
	 * */
	@Override
	public List<NewCategory> findAllCategories() {
		// TODO Auto-generated method stub
		 sql="select * from new_class ";
		
		try {
			ps = SqlHelper.getConnection().prepareStatement(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		List<NewCategory> categories=new ArrayList<NewCategory>();
		try {
			rs=ps.executeQuery();
			while(rs.next()){
				newCategory=new NewCategory();
				newCategory.setCid(rs.getInt("cid"));
				newCategory.setCname(rs.getString("cname"));
				newCategory.setFid(rs.getInt("fid"));
				newCategory.setLevel(rs.getInt("level"));
				categories.add(newCategory);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SqlHelper.closeConnect();
		return categories;
	}
	/**
	 * 查询级别
	 * */
	@Override
	public int findLevel(int fid, String tableName) {
		// TODO Auto-generated method stub
		int level=1;
		sql = "select level from "+tableName+" where cid = "+fid;
		try {
			ps = SqlHelper.getConnection().prepareStatement(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			rs=ps.executeQuery();
			if(rs.next()){
				level=rs.getInt("level")+1;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SqlHelper.closeConnect();
		return level;
	}
	/**
	 * 添加分类
	 * */
	@Override
	public int insertCategories(NewCategory newCategory) {
		// TODO Auto-generated method stub
		sql="insert into new_class set cname=?,level=?,fid=?";
		try {
			ps = SqlHelper.getConnection().prepareStatement(sql);
			ps.setString(1, newCategory.getCname());
			ps.setInt(2,newCategory.getLevel());
			ps.setInt(3, newCategory.getFid());
			count=ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SqlHelper.closeConnect();
		return count;
	}
	/**
	 * 查询某个分类
	 * */
	@Override
	public NewCategory findNewCategoriesByCid(int cid) {
		// TODO Auto-generated method stub
		sql = "select * from  new_class where cid = ?";
		try {
			ps = SqlHelper.getConnection().prepareStatement(sql);
			ps.setInt(1, cid);
			rs=ps.executeQuery();
			newCategory=new NewCategory();
			while(rs.next()){
				newCategory=new NewCategory();
				newCategory.setCid(rs.getInt("cid"));
				newCategory.setCname(rs.getString("cname"));
				newCategory.setFid(rs.getInt("fid"));
				newCategory.setLevel(rs.getInt("level"));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SqlHelper.closeConnect();
		return newCategory;
	}
	
	/**
	 * 删除分类
	 * */
	@Override
	public int delCategories(int cid) {
		// TODO Auto-generated method stub
		
		sql = "delete from  new_class where cid =?";
		try {
			ps = SqlHelper.getConnection().prepareStatement(sql);
			ps.setInt(1, cid);
			count=ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SqlHelper.closeConnect();
		return count;
	}
	/**
	 * 修改分类
	 * */
	@Override
	public int updateCategories(NewCategory newCategory) {
		// TODO Auto-generated method stub
		sql="update new_class set cname=?,level=?,fid=? where cid=?";
		try {
			ps = SqlHelper.getConnection().prepareStatement(sql);
			ps.setString(1, newCategory.getCname());
			ps.setInt(2,newCategory.getLevel());
			ps.setInt(3, newCategory.getFid());
			ps.setInt(4, newCategory.getCid());
			count=ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SqlHelper.closeConnect();
		return count;
	}
	/**
	 * 查询分类的子类
	 * */
	@Override
	public int findNewCategoriesByFid(int cid) {
		// TODO Auto-generated method stub
		sql = "select count(*) from  new_class where fid = ?";
		try {
			ps = SqlHelper.getConnection().prepareStatement(sql);
			ps.setInt(1, cid);
			rs=ps.executeQuery();
				if(rs.next()){
					count=rs.getInt(1);
				}
			}catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		SqlHelper.closeConnect();
		return count;
	}
	

}
