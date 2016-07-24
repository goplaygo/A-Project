package com.jd.util;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.jsp.JspFactory;
import javax.servlet.jsp.PageContext;

import org.lxh.smart.SmartUpload;
import org.lxh.smart.SmartUploadException;

public class UploadHelper extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
            request.setCharacterEncoding("UTF-8");
    		SmartUpload aSmartUpload=new SmartUpload();
    		PageContext context = JspFactory.getDefaultFactory().getPageContext(this, request, response, null, true, 8*1024, true);
    		IPTimeStamp iTimeStamp=new IPTimeStamp("192.168.1.3");
    		try {
    			aSmartUpload.initialize(context);
    			aSmartUpload.upload();
    			if(aSmartUpload.getFiles().getFile(0).isMissing()){
    				response.sendRedirect("/Company/admin/new/uploads.jsp?error=2");
    				return;
    			}
    			String name = iTimeStamp.getIPTimeStampRand() + "." + aSmartUpload.getFiles().getFile(0).getFileExt() ;
    			String fileName = context.getServletContext().getRealPath("/") + "uploads/" + name ;
    			aSmartUpload.getFiles().getFile(0).saveAs(fileName) ;
    			response.sendRedirect("/Company/admin/new/uploads.jsp?name="+name);
    			
    			
    		} catch (ServletException e1) {
    			// TODO Auto-generated catch block
    			e1.printStackTrace();
    		} catch (SmartUploadException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		} catch (IOException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		} 
    	
	}

}
