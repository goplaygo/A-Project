package com.jd.util;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PageHelper {
	private static PreparedStatement ps = null;
	private static ResultSet rs = null;

	public static int[] page(int pageNow, int pageSize, String biao) {

		String sql = "select count(*) from " + biao;
		return getPage(pageNow, pageSize, biao, sql);

	}
	public static int[] page(int pageNow, int pageSize, String biao,String where) {

		String sql = "select count(*) from " + biao + " where " + where;
		return getPage(pageNow, pageSize, biao, sql);

	}
	
	public static int[] getPage(int pageNow, int pageSize, String biao,String sql){
		
		int rowCount = 0;// 总记录数
		int pageCount = 1;// 总页数
		int start = 0;// 每页开始位置
		int[] arr = new int[2];
		try {
			ps = SqlHelper.getConnection().prepareStatement(sql);
			rs = ps.executeQuery();
			if (rs.next()) {
				rowCount = rs.getInt(1);// 取出总记录数
			}
			pageCount = rowCount % pageSize == 0 ? rowCount / pageSize
					: rowCount / pageSize + 1;// 总页数
			if (pageNow == 0 && pageNow > pageCount) {
				pageNow = 1;
			}
			// 分页的limit查询第一个参数的计算公式（开始位置）
			start = (pageNow - 1) * pageSize;
			arr[0] = pageCount;
			arr[1] = start;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return arr;
	}

}
