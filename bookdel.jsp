<%@ page language="java" import="java.sql.*" contentType="text/html; charset=GB18030" pageEncoding="GB18030"%>
<%@ page import = "java.sql.*" %>
<%@ page import ="com.mysql.jdbc.Driver"%>
<%@ page import ="java.io.*" %>
<!-- <%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%> -->

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <!--<base href="<%=basePath%>">  -->
    
    <title>删除图书</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<meta http-equiv="Content-Type" content="text/html;charest=UTF-8">
	<meta http-equiv="refresh" content="3;URL=result.jsp">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    <%
    String driverName = "com.mysql,jdbc.Driver";
    String userName = "root";
    String passWord = "123456";
    String dbName = "lkl";
    Connection conn = null;
    Class.forName("com.mysql.jdbc.Driver");// 加载Mysql数据驱动
	conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/bh", "root", "123456");
    //String url = "jdbc:mysql://localhost/"+dbName+"?user="+userName+"&password="+passWord;
    String author = request.getParameter("author");
    //Class.forName(driverName).newInstance();
    //Connection conn = DriverManager.getConnection(url);
    Statement stat = conn.createStatement();
    String sql1 = "delete from usermanager where name = author";
    //int row1 = stat.executeUpdate(sql1);
    out.print("数据被删除！");
    stat.close(); //this is for lab 4(2).
    conn.close(); %> 
    <tr><a href = index.jsp>回到查询主页</a></tr>
  </body>
</html>
