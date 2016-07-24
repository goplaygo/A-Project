package com.jd.dao.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.jd.dao.NewDao;
import com.jd.model.New;
import com.jd.util.PageHelper;
import com.jd.util.SqlHelper;

public class NewDaoImpl implements NewDao {
	private New news;
	private int count = 0;
	private PreparedStatement ps = null;
	private ResultSet rs = null;
	private String sql = null;
    /**
     * 插入新闻
     * */
	@Override
	public int insertNew(New news) {
		// TODO Auto-generated method stub
		sql = "insert into new set nname=?,nauthor=?,ntime=?,nhit=?,ncontent=?,ncid=?,npic=?";
		try {
			ps = SqlHelper.getConnection().prepareStatement(sql);
			ps.setString(1, news.getNname());
			ps.setString(2, news.getNauthor());
			ps.setString(3,formatTime());
			ps.setInt(4, news.getNhit());
			ps.setString(5, news.getNcontent());
			ps.setInt(6, news.getNcid());
			ps.setString(7, news.getNpic());
			count = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SqlHelper.closeConnect();
		return count;
	}
	 /**
     * 查询所有新闻
     * */
	@Override
	public List<Object> showNew(int pageNow, int pageSize, String biao,
			String where) {
		// TODO Auto-generated method stub
		int[] arr = new int[2];
		List<New> newes = new ArrayList<New>();
		if (where.equals("")) {
			arr = PageHelper.page(pageNow, pageSize, biao);
			
			sql="select new.nid nid,new.nname nname,new.nhit nhit,new_class.cname ncname from new,new_class where new.ncid=new_class.cid order by nid DESC limit ?,?";
			try {
				ps=SqlHelper.getConnection().prepareStatement(sql);
				ps.setInt(1, arr[1]);
				ps.setInt(2, pageSize);
				rs = ps.executeQuery();
				while (rs.next()) {
					news = new New();
					news.setNid(rs.getInt("nid"));
					news.setNname(rs.getString("nname"));
					news.setNhit(rs.getInt("nhit"));
					news.setNcname(rs.getString("ncname"));
					newes.add(news);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			SqlHelper.closeConnect();

		} else {
			arr=PageHelper.page(pageNow, pageSize, biao, where);
			sql="select * from new where "+where+" order by nid DESC limit ?,?";
			try {
				ps=SqlHelper.getConnection().prepareStatement(sql);
				ps.setInt(1, arr[1]);
				ps.setInt(2, pageSize);
				rs=ps.executeQuery();
				while(rs.next()){
					news=new New();
					news.setNid(rs.getInt("nid"));
					news.setNname(rs.getString("nname"));
					news.setNhit(rs.getInt("nhit"));
					newes.add(news);
					
				}
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SqlHelper.closeConnect();

		
	}
		List<Object> list = new ArrayList<Object>();
		list.add(arr[0]);
		list.add(newes);
		return list;
	}
	 /**
     * 查询新闻详情(后台)
     * */
	@Override
	public New findNewByNid(int nid) {
		// TODO Auto-generated method stub
		sql ="select new.nid nid,new.nname nname,new.nhit nhit,new.nauthor nauthor,new.ntime ntime,new.ncontent ncontent,new.npic npic,new.ncid ncid ,new_class.cname ncname from new,new_class where new.nid=? and new.ncid=new_class.cid";
		news=new New();
		try {
			ps=SqlHelper.getConnection().prepareStatement(sql);
			ps.setInt(1, nid);
			rs = ps.executeQuery();
			if(rs.next()){
				news.setNid(rs.getInt("nid"));
				news.setNname(rs.getString("nname"));
				news.setNhit(rs.getInt("nhit"));
				news.setNauthor(rs.getString("nauthor"));
				news.setNcontent(rs.getString("ncontent"));
				news.setNpic(rs.getString("npic"));
				news.setNcid(rs.getInt("ncid"));
				news.setNtime(rs.getString("ntime"));
				news.setNcname(rs.getString("ncname"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SqlHelper.closeConnect();
		return news;
	}
	/**
     * 更新新闻
     * */
	@Override
	public int updateNew(New news) {
		// TODO Auto-generated method stub
		sql = "update new set nname=?,nauthor=?,ntime=?,nhit=?,ncontent=?,ncid=? ,npic=? where nid=?";
		try {
			ps = SqlHelper.getConnection().prepareStatement(sql);
			ps.setString(1, news.getNname());
			ps.setString(2, news.getNauthor());
			ps.setString(3, formatTime());
			ps.setInt(4, news.getNhit());
			ps.setString(5, news.getNcontent());
			ps.setInt(6, news.getNcid());
			ps.setString(7, news.getNpic());
			ps.setInt(8, news.getNid());
			count = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SqlHelper.closeConnect();
		return count;
	}
	/**
     * 删除新闻
     * */
	@Override
	public int delNew(int nid) {
		// TODO Auto-generated method stub
		sql = "delete from new where nid=?";
		try {
			ps=SqlHelper.getConnection().prepareStatement(sql);
			ps.setInt(1, nid);
			count=ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return count;
	}
	/**
     * 格式化时间
     * */
	public String formatTime() {
		// TODO Auto-generated method stub
		Date date = new Date();
		SimpleDateFormat sdFormat=new SimpleDateFormat("yyyy-MM-dd kk:mm:ss");
		String rString=sdFormat.format(date);
		return rString;
	}
	/**
     * 查询首页某个分类下新闻
     * */
	@Override
	public List<New> findAllNewByCid(int ncid, int count) {
		sql="select * from new where ncid=? order by nid DESC limit ?";
		List<New> newObject=new ArrayList<New>();
		try {
			ps=SqlHelper.getConnection().prepareStatement(sql);
			ps.setInt(1, ncid);
			ps.setInt(2, count);
			rs=ps.executeQuery();
			while(rs.next()){
				news=new New();
				news.setNid(rs.getInt("nid"));
				news.setNname(rs.getString("nname"));
				news.setNhit(rs.getInt("nhit"));
			    news.setNauthor(rs.getString("nauthor"));
			    news.setNcid(rs.getInt("ncid"));
			    news.setNcontent(rs.getString("ncontent"));
			    news.setNpic(rs.getString("npic"));
			    news.setNtime(rs.getString("ntime"));
				newObject.add(news);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return newObject;
	}

}
