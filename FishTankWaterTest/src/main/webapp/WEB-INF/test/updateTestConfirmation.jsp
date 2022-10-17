<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<jsp:include page="../bootstrapHead.jsp"/>
</link rel="stylesheet" href="css/main.css">
</head>
<form action="updateTest.do" method="POST">
ID:<input name="id" value="${FishTankWaterTest.id}" type="hidden" />
Date Tested: <input name="datetested" value="${FishTankWaterTest.datetested}"><br>
Ammonia: <input name="ammmonia" value="${FishTankWaterTest.ammonia}"><br>
Nitrites: <input name="nitrites" value="${FishTankWaterTest.nitrites}"><br>
Nitrates: <input name="nitrates" value="${FishTankWaterTest.nitrates}"><br>
PH: <input name="ph" value="${FishTankWaterTest.ph}"><br>
<input type="submit" type="button" value="Update this test" />
		</form>
		<jsp:include page="../bootstrapHead.jsp"/>
</link rel="stylesheet" href="css/main.css">
<body>

</body>
</html>