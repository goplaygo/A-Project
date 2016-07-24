package com.jd.model;

import java.io.Serializable;

public class WebSite implements Serializable{
	/**
	 * 站点基本信息实体
	 */
	private static final long serialVersionUID = 1L;
	private int id;//站点信息id
	private String keywords;//网站关键字
	private String descption;//网站描述信息
	private String copy;//网站版权
	private String addr;//公司地址
	private long moblie;//公司联系方式
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getKeywords() {
		return keywords;
	}
	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}
	public String getDescption() {
		return descption;
	}
	public void setDescption(String descption) {
		this.descption = descption;
	}
	public String getCopy() {
		return copy;
	}
	public void setCopy(String copy) {
		this.copy = copy;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public long getMoblie() {
		return moblie;
	}
	public void setMoblie(long moblie) {
		this.moblie = moblie;
	}
	
}
