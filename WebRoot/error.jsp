<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
request.setCharacterEncoding("UTF-8");
String act=request.getParameter("act");
String controller=request.getParameter("controller");
String message=request.getParameter("message");
if(message.equals("dnc")){
	message="请先删除子类";
}
if(message.equals("an")){
	message="添加新闻失败";
}
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>My JSP 'error.jsp' starting page</title>
	<script type="text/javascript">
	alert("<%=message%>");
	window.location.href="<%=path%>/<%=controller%>?act=<%=act%>";
	</script>
  </head>
  
  <body>
  </body>
</html>
