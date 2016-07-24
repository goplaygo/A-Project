<%@ page language="java" import="java.util.*,org.apache.commons.lang3.StringUtils" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="../header.jsp" %> 
<%@ include file="leftmenu.jsp" %>
<div class="centercontent">
 <form action="<%=path%>/NewCategoryController" method="post">
        <table class="table">
   <thead>
      <tr>
         <th>名称</th>
         <th>内容</th>
      </tr>
   </thead>
   <tbody>
  <tr>
  		<td><label for="name">上级分类</label></td>
         <td>
          <select name="cid">
			   <option value="0" selected="selected">顶级分类</option>
			   <c:forEach var="cls" items="${classes}">
			   <c:set var="levels" value="${cls.level}" scope="request"/>
			   <option value="${cls.cid}">
			   <%=StringUtils.repeat("&nbsp;&nbsp;&nbsp;&nbsp;", (Integer)request.getAttribute("levels")-1)%>${cls.cname}
			   </option>
			   </c:forEach>
			  
		</select> 
      </td>
      </tr>
      <tr>
         <td>分类名称</td>
         <td><input type="text"  name="cname" placeholder="请输入分类名称"  class="btn"></td>
      </tr>
         <td colspan=2 style="text-align:center"><input type="hidden" name="act" value="insert"><input type="hidden" name="act" value="insert"/><input type="submit" value="提交"/></td>
         
      </tr>
   </tbody>
</table>
</form>   
	</div><!-- centercontent -->
    
    
</div><!--bodywrapper-->

</body>
</html>
