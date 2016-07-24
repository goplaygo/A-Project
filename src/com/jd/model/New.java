package com.jd.model;

import java.io.Serializable;

public class New implements Serializable{
	/**
	 * 新闻实体
	 */
	private static final long serialVersionUID = 1L;
	private int nid;
	private String nname;
	private String nauthor;
	private String ntime;
	private int nhit;
	private String ncontent;
	private int ncid;
	private String npic;
	public String getNpic() {
		return npic;
	}
	public void setNpic(String npic) {
		this.npic = npic;
	}

	public String getNcname() {
		return ncname;
	}
	public void setNcname(String ncname) {
		this.ncname = ncname;
	}
	private String ncname;
	public int getNid() {
		return nid;
	}
	public void setNid(int nid) {
		this.nid = nid;
	}
	public String getNname() {
		return nname;
	}
	public void setNname(String nname) {
		this.nname = nname;
	}
	public String getNauthor() {
		return nauthor;
	}
	public void setNauthor(String nauthor) {
		this.nauthor = nauthor;
	}
	public String getNtime() {
		return ntime;
	}
	public void setNtime(String ntime) {
		this.ntime = ntime;
	}
	public int getNhit() {
		return nhit;
	}
	public void setNhit(int nhit) {
		this.nhit = nhit;
	}
	public String getNcontent() {
		return ncontent;
	}
	public void setNcontent(String ncontent) {
		this.ncontent = ncontent;
	}
	public int getNcid() {
		return ncid;
	}
	public void setNcid(int ncid) {
		this.ncid = ncid;
	}
	
	

}
