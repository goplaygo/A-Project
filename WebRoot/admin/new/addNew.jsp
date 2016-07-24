<%@ page language="java" import="java.util.*,org.apache.commons.lang3.StringUtils" pageEncoding="UTF-8"%>
<% String paths = request.getContextPath();
   request.setAttribute("pa",paths);
   request.setCharacterEncoding("UTF-8");
   String name=request.getParameter("name");
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ include file="../header.jsp"%>
<%@ include file="leftmenu.jsp"%>
<script type="text/javascript">

function appendPic(){
	var obj=window.frames['ifr'].document.getElementById("mypic");
	var getpic=document.getElementById("getpic");
		getpic.value="/uploads/"+obj.value;
	}
</script>
<div class="centercontent">
	<form action="<%=path%>/NewController" method="post">
		<table class="table">
			<thead>
				<tr>
					<th>名称</th>
					<th>内容</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>新闻标题</td>
					<td><input type="text" name="nname"></td>
				</tr>
				<tr>
					<td>来源</td>
					<td><input type="text" name="nauthor"></td>
				</tr>
				<tr>
					<td>浏览次数</td>
					<td><input type="text" name="nhit"></td>
				</tr>
				<tr>
					<td>上传图片</td>
					<td><iframe src="<%=path%>/admin/new/uploads.jsp" height=32 name="ifr" width=600></iframe><input type="text" name="npic" id="getpic" onclick="appendPic()"/></td>
				</tr>
				<tr>
					<td>新闻分类
					</td>
					<td><select name="cid">
			   <c:forEach var="cls" items="${classes}">
			   <c:set var="levels" value="${cls.level}" scope="request"/>
			   <option value="${cls.cid}">
			   <%=StringUtils.repeat("&nbsp;&nbsp;&nbsp;&nbsp;", (Integer)request.getAttribute("levels")-1)%>${cls.cname}
			   </option>
			   </c:forEach>
			  
		</select> </td>
				</tr>
				<tr>
					<td style="vertical-align:middle">新闻详情</td>
					<td> <textarea id="editor_id" name="content" style="height:400px;visibility:hidden;"></textarea></td>
					
				</tr>
				<tr>
				<td colspan=2 style="text-align:center"><input type="hidden"
					name="act" value="insert" /><input type="submit" value="提交" />
				</td>

				</tr>
			</tbody>
		</table>
	</form>
</div>
<!-- centercontent -->
<script>
        var K=window.KindEditor; 
         var options = {
         cssPath : '${pa}/admin/kindeditor/plugins/code/prettify.css',
		 uploadJson : '${pa}/admin/kindeditor/jsp/upload_json.jsp',
		 fileManagerJson : '${pa}/admin/kindeditor/jsp/file_manager_json.jsp',
         filterMode : true
    };
   var editor = K.create('textarea[name="content"]', options);
 </script>
</div>
<!--bodywrapper-->

</body>
</html>
