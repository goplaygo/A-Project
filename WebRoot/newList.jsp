<%@ page language="java" import="java.util.*,org.apache.commons.lang3.StringUtils" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
%>
<%@ include  file="header.jsp"%>
 <div id="new_main">
		<%@ include  file="newleft.jsp"%>
			<div class="new_main_right">
				<h4>新闻中心</h4>
				<ul>
				<c:forEach var="new" items="${news }">
					<li><a href="<%=path%>/NewFrontController?act=show_detail_page&nid=${new.nid}">${new.nname }</a></li>
				</c:forEach>
				</ul>
				<p style="text-align:center">共计${pageCount }页&nbsp;当前第${pageNow}页&nbsp;<a href="<%=path%>/NewFrontController?pageNow=1&act=show_list_page&ncid=${ncid}">首页</a>&nbsp;<a href="<%=path%>/NewFrontController?pageNow=${pageNow-1==0?1:pageNow-1}&act=show_list_page&ncid=${ncid}">上一页</a><a href="<%=path%>/NewFrontController?pageNow=${pageNow+1>pageCount?pageCount:pageNow+1}&act=show_list_page&ncid=${ncid}">下一页</a><a href="<%=path%>/NewFrontController?pageNow=${pageCount}&act=show_list_page&ncid=${ncid}">末页</a></p>
			</div>
</div>
 
 <%@ include  file="footer.jsp"%>
</div>
</body>
</html>

