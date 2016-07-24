<%@ page language="java" import="java.util.*,org.apache.commons.lang3.StringUtils" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="../header.jsp" %> 
<%@ include file="leftmenu.jsp" %>
<link rel="stylesheet" href="<%=path%>/admin/css/self/normalize.css" >
<link rel="stylesheet" href="<%=path%>/admin/css/self/baze.modal.css">
<div class="centercontent">
        <table class="table">
   <thead>
      <tr>
         <td>新闻编号</td>
         <td>新闻标题</td>
         <td>新闻分类</td>
         <td>浏览次数</td>
         <td>操作</td>
      </tr>
   </thead>
   <tbody>
  <c:forEach var="new" items="${news}">
      <tr>
         <td>${new.nid}</td>
         <td>${new.nname}</td>
		 <td>${new.ncname}</td>
		 <td>${new.nhit}</td>
         <td><a href="<%=path%>/NewController?act=show_update_page&nid=${new.nid}">修改</a>&nbsp;&nbsp;<a href="<%=path%>/NewController?act=del&nid=${new.nid}">删除</a>&nbsp;&nbsp;<button class="ngehe" data-target="#modal2" onclick="show_detail(${new.nid})">查看</button></td>
      </tr>
      </c:forEach>
      <tr>
         <td colspan="5" style="text-align:center;font-size:14px;">共计${pageCount}页 &nbsp;当前${pageNow}第页&nbsp<a href="<%=path%>/NewController?act=show_list_page&pageNow=1">首页</a>&nbsp;&nbsp;<a href="<%=path%>/NewController?act=show_list_page&pageNow=${pageNow-1==0?1:pageNow-1}">上一页</a>&nbsp;&nbsp;<a href="<%=path%>/NewController?act=show_list_page&pageNow=${pageNow+1>pageCount?pageCount:pageNow+1}">下一页</a>&nbsp;&nbsp;<a href="<%=path%>/NewController?act=show_list_page&pageNow=${pageCount}">末页</a></td>
      </tr>
   </tbody>
</table>
	</div><!-- centercontent -->
   <div class="bzm-content" id="modal2" data-title="新闻详情">
     <div id="shuzu"></div>
</div>
<script src="<%=path%>/admin/js/custom/baze.modal.js" type="text/javascript"></script> 
<script type="text/javascript">

function show_detail(nid){
jQuery.getJSON("<%=path%>/NewController?act=show_detail_page&nid="+nid,function(Data){
jQuery("#modal2 #shuzu table").remove();
var table=jQuery("<table>");
var tr=jQuery("<tr><td width='20%'>新闻标题:</td><td width='80%'>"+Data['nname']+"</td></tr><tr><td>新闻点击率:</td><td>"+Data['nhit']+"</td></tr><tr><td>新闻作者:</td><td>"+Data['nauthor']+"</td></tr><tr><td>新闻图片:</td><td> <img src='<%=path%>"+Data['npic']+"'alt='无图片' width='200' height='300'/></td></tr><tr><td>新闻分类:</td><td>"+Data['ncname']+"</td></tr><tr><td>添加时间:</td><td>"+Data['ntime']+"</td></tr>");
table.append(tr);
jQuery("#modal2 #shuzu").append(table);
 });
}
jQuery(".ngehe").bazeModal();
</script>   
    
</div><!--bodywrapper-->

</body>
</html>
