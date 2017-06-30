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
	<h1>登録確認</h1>
	<center>
		<form action="T01ZemiRegister" method="POST">
			<table>
				<tr>
					<th>教科</th>
					<td><c:out value="${T01ZemiRegister.subjectcf}" /></td>
				</tr>

				<tr>
					<th>科目名</th>
					<td><c:out value="${T01ZemiRegister.subjectname}" /></td>
				</tr>
			</table>
			<p>
				<button type="button" class="btn btn-primary">
					<span class="glyphicon glyphicon-ok-sign"></span>OK!
				</button>
			</p>
		</form>
	</center>
	<p>
		<a href="T01ZemiRegister">変更</a><br>
	    <a href="Managerlogin.jsp">TOP!!</a>
	</p>
</body>
</html>