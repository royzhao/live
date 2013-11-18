<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page  isELIgnored="false"%>  

<html>
	<head>
		<title>欢迎回来</title>
	</head>
	<body>
		${user.name } 欢迎回来
		<a href="<c:url value="/logout.html" />">退出登陆</a>
	</body>
</html>