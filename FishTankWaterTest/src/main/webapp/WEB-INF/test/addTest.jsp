<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Test Page</title>
<jsp:include page="../bootstrapHead.jsp"/>
</link rel="stylesheet" href="css/main.css">
</head>
<body>
<main class="container-fluid">
	<h1>Add Test</h1>

	<form action="addTest.do" method="POST">
		Date: <input type="text" name="datetested" /><br>
		Ammonia: <input type="number" step="0.01" name="ammonia"/><br>
		Nitrites: <input type="number" step="0.01" name="nitrites" /> <br>
		Nitrates: <input type="number" step="0.01" name="nitrates" /><br>
		PH: <input type="number" step="0.01" name="ph" /> <br>		
		<input type="submit"
			value="ADD TEST" /><br>
			
	</form>
	</main>
	<jsp:include page="../bootstrapFoot.jsp"/>






</body>
</html>