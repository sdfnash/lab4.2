<%@ page language="java" import="java.util.*" pageEncoding="utf-8" %>
<%@ page import="java.util.*,com.opensymphony.xwork2.util.*" %>  
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>信息</title>
	<meta http-equiv="Content-Type" content="text/html;charset=utf-8"/>
  </head>
  
  <body>

<form action="GetBooksAction" method="get">

	<%String price = request.getParameter("price"); %>
	<%String isbn = request.getParameter("isbn"); %>
	<%String age = request.getParameter("age"); %>
	<%String country = request.getParameter("country"); %>
  <table border="3" width="400px">

 <tr>
 <td>价格</td>
  <td><%= price %></td>
  </tr>
   <tr>
 <td>ISBN</td>
  <td><%= isbn %></td>
  </tr>
     <tr>
 <td>作者年龄</td>
  <td><%= age %></td>
  </tr>
      <tr>
 <td>作者国籍</td>
  <td><%= country %></td>
  </tr>
  <tr><td><a href = index.jsp>回到查询主页</a></td></tr>
   </table>
</form>
</body>
</html>
