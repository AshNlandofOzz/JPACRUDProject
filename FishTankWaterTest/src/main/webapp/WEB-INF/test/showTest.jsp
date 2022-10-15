<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Test Details</title>
</head>
<body>
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
</body>
</html>