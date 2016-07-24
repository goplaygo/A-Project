package com.jd.model;

import java.io.Serializable;

public class NewCategory implements Serializable{
	/**
	 * 新闻分类实体
	 */
	private static final long serialVersionUID = 1L;
	private int cid;//分类id
	private String cname;//分类名称
	private int level;//分类深度
	private int fid;//类别父亲id
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getFid() {
		return fid;
	}
	public void setFid(int fid) {
		this.fid = fid;
	}

	

}
