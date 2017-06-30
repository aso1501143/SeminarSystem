<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/common.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>受講生徒一覧</title>
<link rel="stylesheet" href="bootstrap-3.3.7/css/bootstrap.css">
<link rel="stylesheet" href="css/style.css">
</head>
<body>

	<h1>受講生徒一覧</h1>

		<center>
		<c:forEach var="data" items="${requestScope.array}" varStatus="status">
			科目名：<c:out value="${ data.subjectname }"></c:out>
		</c:forEach>
			<table border="1" class="table-design-set-1">
	
				<tr>
					<th>学生ID</th>
					<th>氏名</th>
				</tr>
				<tr align="center">
				<c:forEach var="data" items="${requestScope.array}" varStatus="status">
				<tr>
					<td><c:out value="${data.studentid }" /></td>
					<td><c:out value="${data.studentname }" /></td>
				</tr>
				</c:forEach>
			</table>
			<button type="button" class="btn btn-primary" onclick="window.print();">
				<span class="glyphicon glyphicon-print"></span>印刷
			</button>

		</center>
</body>
</html>