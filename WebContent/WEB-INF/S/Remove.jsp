<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Remove</title>
<link rel="stylesheet" href="bootstrap-3.3.7/css/bootstrap.css">
<link rel="stylesheet" href="css/style.css">
</head>
<body>



	<form action="<%=request.getContextPath()%>/G01Sure" method="POST">

		<style>
td, tr {
	padding: 15px 15px;
}
</style>

		<h1>科目の削除</h1>

		<center>
			<table border="1" width="150dp">
				<tr align="center">
				<tr>
					<td></td>
					<td align="center"><input type="radio"></td>
				</tr>
				<tr align="center">
				<tr>
					<td></td>
					<td align="center"><input type="radio"></td>
				</tr>
				<tr align="center">
				<tr>
					<td></td>
					<td align="center"><input type="radio"></td>
				</tr>
			</table>

			<br>
			<button type="button" class="btn btn-primary">
				<span class="glyphicon glyphicon-ok-sign"></span>決定
			</button>
			<button type="button" class="btn btn-primary">
				<span class="glyphicon glyphicon-remove-sign"></span>取り消し
			</button>
		</center>
		<br> <br> <a href="login.jsp">トップページへ</a>

	</form>
</body>
</html>

