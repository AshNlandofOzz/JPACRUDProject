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
<body>
<main class="container-fluid">
<form action="deleteTestConfirmation.do" method="GET">
<label for="id">Delete?</label>
<input name="id" value="${FishTankWaterTest.id}">
<input type="button"
		value="I'm Sure" />
		</form>
			</main>
	<jsp:include page="../bootstrapFoot.jsp"/>

</body>
</html>