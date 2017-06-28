<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>科目登録</title>
<link rel="stylesheet" href="bootstrap-3.3.7/css/bootstrap.css">
<link rel="stylesheet" href="css/style.css">
</head>
<body>

<h1>科目登録</h1>
<center>
<form action="<%= request.getContextPath() %>/Login" method="POST">
	　　
		<table>
	　　　	　　<tr>
				<tr align="center">
			<td>教科</td>
			<td><input type="text" name="subject"></td>

		　　</tr>
		　　<tr>
			<td>科目名</td>
			<td><input type="text" name="subject2"></td>
		　　</tr>
		</table>

	<button type="button" class="btn btn-primary">
			<span class="glyphicon glyphicon-ok"></span>登録
	</button>
	</form>
	</center>
</body>

</html>