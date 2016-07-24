<%@ page language="java" import="java.util.*,org.apache.commons.lang3.StringUtils" pageEncoding="UTF-8"%>
<div class="new_main_left">
				<h2>&nbsp;&nbsp;新闻中心</h2>
				<ul class="list">
				 <c:forEach var="cates" items="${categories}">
			 <c:set var="level" value="${cates.level}" scope="request"></c:set>
			 <li><a href="${cates.cid}"><%=StringUtils.repeat("----",(Integer)request.getAttribute("level")-1)%>${cates.cname}</a></li>
			 </c:forEach>					
				</ul>
</div>
			