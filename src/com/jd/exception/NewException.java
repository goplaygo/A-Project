package com.jd.exception;

public class NewException  extends Exception{

	/**
	 * 站点设置异常类
	 */
	private static final long serialVersionUID = 1L;
	
  public NewException(){
		super.getMessage();
	}
  
  public NewException(String message){
		super(message);
	}
  
}
