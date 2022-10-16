<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Test Page</title>
</head>
<body>
	<h1>Add Test</h1>

	<form action="addTest.do" method="POST">
		Date: </label>: <input type="text" name="datetested" /><br>
		Ammonia: <input type="number" step="0.01" name="ammonia"/><br>
		Nitrites: <input type="number" step="0.01" name="nitrites" /> <br>
		Nitrates: <input type="number" step="0.01" name="nitrates" /><br>
		PH: <input type="number" step="0.01" name="ph" /> <br>		
		<input type="submit"
			value="ADD TEST" /><br>
			
	</form>






</body>
</html>