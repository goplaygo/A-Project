<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %> 
<%@ include file="leftmenu.jsp" %>             
    <div class="centercontent">
       <form action="<%=path%>/WebSiteController" method="post">
       <table class="table">
       <tr><th>名称</th><th>内容</th></tr>
         <tbody>
  <tr>
         <td>管理员名称</td>
         <td>
         <input type="text" name="aname">
      </td>
      </tr>
      <tr>
         <td>管理员密码</td>
         <td><input type="text"  name="apassword"></td>
      </tr>
      <tr>
         <td>管理员权限</td>
         <td><input type="checkbox" name="pname" value="">管理员<input type="checkbox" name="pname" value="">站点管理<input type="checkbox" name="pname" value="">新闻分类<input type="checkbox" name="pname" value="">新闻管理<input type="checkbox" name="pname" value="">会员管理</td>
      </tr>
      <tr>
      <td>操作</td>
         <td ><input type="submit" value="提交"/></td>
         
      </tr>
   </tbody>
       </table>
       
       </form>
        
	</div><!-- centercontent -->
    
    
</div><!--bodywrapper-->

</body>
</html>
