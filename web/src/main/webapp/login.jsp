<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page  isELIgnored="false"%>  
<html>
	<head>
		<title>登陆系统测试</title>
	</head>
	<body>
		<c:if test="${!empty error }">
			
			<p style="color:red">
				<c:out value="${error }" ></c:out>
			</p>
		</c:if>
		
		<form action="<c:url value="/loginCheck.html" />" method="post">
			用户名:
			<input type="text" name="userName">
			<br>
			密码：
			<input type="password" name="password">
			<br>
			<input type="submit" value="登陆" />
			<input type="reset" value="重置" />
		</form>
		
	</body>
</html>