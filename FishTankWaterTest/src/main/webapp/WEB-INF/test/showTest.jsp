<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Test Details</title>
<jsp:include page="../bootstrapHead.jsp"/>
</link rel="stylesheet" href="css/main.css">
</head>
<body>
<main class="container-fluid">
<h5>TEST Results</h5>
<table>
<tr>
<th>TestID</th>
<th>Ammonia</th>
<th>Nitrites</th>
<th>Nitrates</th>
<th>PH</th>
</tr>
<tr>
<td>${FishTankWaterTest.id}</td>
<td>${FishTankWaterTest.ammonia}</td>
<td>${FishTankWaterTest.nitrites}</td>
<td>${FishTankWaterTest.nitrates}</td>
<td>${FishTankWaterTest.ph}</td>
</tr>
</table>
<form action="delete.do" action="GET">
<input type="hidden" name="id" value="${FishTankWaterTest.id}"/>
<input type="submit" type="button" value="Delete this test" />
		</form>
		
<form action="updateTestConfirmation.do" action="GET">
<input type="hidden" name="id" value="${FishTankWaterTest.id}"/>
<input type="submit" type="button" value="Update this test" />
		</form>
			</main>
	<jsp:include page="../bootstrapFoot.jsp"/>
</body>
</html>