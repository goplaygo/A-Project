<%@ page language="java" import="java.util.*,org.apache.commons.lang3.StringUtils" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="../header.jsp" %> 
<%@ include file="leftmenu.jsp" %>
<div class="centercontent">
        <table class="table">
   <thead>
      <tr>
         <th>名称</th>
         <th>内容</th>
          <th>操作</th>
      </tr>
   </thead>
   <tbody>
   <c:forEach var="cls" items="${classes}">
      <tr>
         <td>分类名称</td>
         <td>
			   <c:set var="levels" value="${cls.level}" scope="request"/>
			   <%=StringUtils.repeat("-----", (Integer)request.getAttribute("levels")-1)%>${cls.cname}
			   </td>
         <td><a href="<%=path%>/NewCategoryController?act=show_update_page&cid=${cls.cid}">修改</a>&nbsp;&nbsp;<a href="<%=path%>/NewCategoryController?act=del&cid=${cls.cid}">删除</a></td>
      </tr>
      </c:forEach>
         
      </tr>
   </tbody>
</table>
	</div><!-- centercontent -->
    
    
</div><!--bodywrapper-->

</body>
</html>
