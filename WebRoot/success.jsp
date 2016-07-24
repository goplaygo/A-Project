<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
request.setCharacterEncoding("UTF-8");
String act=request.getParameter("act");
String controller=request.getParameter("controller");
String pageNow=null;
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>My JSP 'error.jsp' starting page</title>
	<script type="text/javascript">
	alert("成功!");
	<% if(pageNow!=null){%>
	window.location.href="<%=path%>/<%=controller%>?act=<%=act%>&pageNow=1";
	<%}else{%>
	window.location.href="<%=path%>/<%=controller%>?act=<%=act%>";
	<%}%>
	</script>
  </head>
  
  <body>
  </body>
</html>
