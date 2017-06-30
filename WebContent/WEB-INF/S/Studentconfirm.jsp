<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ include file="/WEB-INF/jsp/common.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登録確認</title>
<link rel="stylesheet" href="bootstrap-3.3.7/css/bootstrap.css">
<link rel="stylesheet" href="css/style.css">
</head>
<body>
	<form action="G01Confirm" method="POST">
		<table>
			<tr>
				<th>学生ID</th>
				<td><c:out value="${regdata.studentid}" /></td>
			</tr>

			<tr>
				<th>科目名</th>
				<td><c:out value="${regdata.subjectid}" /></td>
			</tr>
		</table>
		<p>
			<input type="submit" value="OK!!">
		</p>
	</form>
	<p>
		<a href="G01Select">変更</a> <a href="/WEB-INF/S/StudentTop.jsp">TOP!!</a>
	</p>
</body>
</html>