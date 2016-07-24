<%@ page language="java" import="java.util.*,org.apache.commons.lang3.StringUtils" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
%>
<%@ include  file="header.jsp"%>
 <div id="new_main">
			<%@ include  file="newleft.jsp"%>
			<div class="new_main_right">
				<h4>新闻中心</h4>
                 <h2>${new.nname }</h2>
				<p class="p_8">来源：${new.nauthor}&nbsp;&nbsp;浏览数：${new.nhit}&nbsp;&nbsp;时间：${new.ntime }</p>
				<p style="text-align:center">${new.ncontent }</p>
			</div>
</div>
 
 <%@ include  file="footer.jsp"%>
</div>
</body>
</html>

