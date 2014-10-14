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
  <table border="3" width="400px">
  <tr>
     <td>书名</td>
     <td><a href = bookdetails.jsp?price=${price}&isbn=${isbn}&age=${age}&country=${country}>${booknames}</a></td>
  </tr>
  <tr> 
     <td>第一版出版日期</td>  
     <td>${date}</td>
  </tr>
  <tr> 
     <td>出版社</td>  
     <td>${publisher}</td>
  </tr>
  <tr>  
     <td>作者ID</td> 
     <td>${authid}</td>

  </tr> 
  


  <tr><td><a href = bookdel.jsp?author=${author}>删除</a></td>
  <td><a href = index.jsp>回到查询主页</a></td></tr>
     </table>
  </body>
</html>
