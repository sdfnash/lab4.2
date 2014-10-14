<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
<body style="font-size: 36px;color: #330000; font-family:仿宋">
   <div class="text" style=" text-align:center;">欢迎来到Liet查询</div>
   </body>
   <body>
 
    <table>
    <tr><td>
    	<form action="GetBooksAction" method="post">
    		<div> 作者姓名  <input type = "text" name = "username" size = "40" style="text-align:center"></div>
    	
    		<input type = "submit" name = "sub" value = "提交" style="text-align:center">
    	</form>
    	</td>
    </tr>
    </table>
  </body>
</html>

