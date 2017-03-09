<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'users.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  <body>
    <h1>This is User JSP page.</h1>
    <a href="Users/add">Add</a><br/>
    <c:forEach items="${users }" var="user">
    	${user.userName }
    	----------<a href="Users/${user.id }">${user.id }</a>
    	-----------------${user.age }
    	-----------${user.email }
    	-----------<a href="Users/${user.id }/update">Update</a>
    	-----------<a href="Users/${user.id }/delete">Delete</a><br/>
    </c:forEach>
  </body>
</html>
