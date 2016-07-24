package com.jd.exception;

public class SiteException  extends Exception{

	/**
	 * 站点设置异常类
	 */
	private static final long serialVersionUID = 1L;
	
  public SiteException(){
		super.getMessage();
	}
  
  public SiteException(String message){
		super(message);
	}
  
}
