<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<form action="deleteTestConfirmation.do" method="GET">
<label for="id">Delete?</label>
<input name="id" value="${FishTankWaterTest.id}">
<input type="button"
		value="I'm Sure" />
		</form>
<body>

</body>
</html>