<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %> 
<%@ include file="leftmenu.jsp" %>             
    <div class="centercontent">
 <form action="<%=path%>/WebSiteController" method="post">
        <table class="table">
   <thead>
      <tr>
         <th>名称</th>
         <th>内容</th>
      </tr>
   </thead>
   <tbody>
  <tr>
         <td> <label for="name">网站关键字</label></td>
         <td>
         <input type="text" name="keywords" placeholder="请输入关键字" value="${webSite.keywords}" class="btn">
      </td>
      </tr>
      <tr>
         <td>网站描述</td>
         <td><input type="text"  name="descption" placeholder="请输入描述" value="${webSite.descption}" class="btn"></td>
      </tr>
      <tr>
         <td>网站版权</td>
         <td><input type="text" name="copy" placeholder="请输入版权" value="${webSite.copy}" class="btn"></td>
      </tr>
      <tr>
         <td>公司地址</td>
         <td><input type="text" name="addr" placeholder="请输入地址" value="${webSite.addr}" class="btn"></td>
      </tr>
      <tr>
         <td>公司联系方式</td>
         <td><input type="text" name="mobile" placeholder="请输入联系方式" value="${webSite.moblie}" class="btn"></td>
      </tr>
      <tr>
      <input type="hidden" name="id" value="${webSite.id}"/>
         <td colspan=2 style="text-align:center"><input type="submit" value="提交"/></td>
         
      </tr>
   </tbody>
</table>
</form>   
	</div><!-- centercontent -->
    
    
</div><!--bodywrapper-->

</body>
</html>
