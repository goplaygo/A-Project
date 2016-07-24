<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
request.setCharacterEncoding("UTF-8");
String name=null;
name=request.getParameter("name");
String error="1";
if(request.getParameter("error")!=null){
error=request.getParameter("error");
}
%>
<script type="text/javascript">
<%if(name!=null){%>
alert("成功！");
<%}
%>
<%if(error.equals("2")){%>
alert("请选择上传文件！");
<%}
%>
</script>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head> 
<style type="text/css">
*{padding:0; margin:0;}
</style>
  </head>
  
  <body>
  <%if(name==null){%>
  <form action="<%=path%>/UploadsHelper" method="post" encType="multipart/form-data">
    <table style=""><tr><td><input type="file" name="npic" style="width:200px"></td><td><input type="submit" value="上传"/>&nbsp;<font color=red>上传成功后,点击下面文本框获取图片路径</font></td></tr></table>
  </form>
  <% }else {%>
  <input type="hidden" id="mypic" value="<%=name%>"/><font color=red>上传成功后,点击下面文本框获取图片路径</font>
  <%} %>
  </body>
</html>
