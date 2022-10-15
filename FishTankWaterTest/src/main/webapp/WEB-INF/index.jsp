<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome to Fish Tank Water Test Tracker</title>
</head>
<body>
	<h1>It's a matter of life or death!</h1>

	<form action="showTest.do" method="GET">
		Test ID: <input type="text" name="id" /> <input type="submit"
			value="Show Test" />
		<c:forEach var="tanktest" items="${fishTankWaterTests }">
			<ul>
				<li><a href="showTest.do?id=${tanktest.id}">${tanktest.datetested}</a></li>
			</ul>
		</c:forEach>
</body>
</html>