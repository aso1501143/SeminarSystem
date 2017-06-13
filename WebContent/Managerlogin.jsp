<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>管理者ログイン</title>
</head>
<body>
<h1>管理者ログイン</h1>

<form action="<%= request.getContextPath() %>/Login" method="POST">
	　
		<table>
	　　　	　　<tr>
			<tr align="center">
			<td>ID:</td>
			<td><input type="text" name="id"></td>
		　　</tr>
		　　<tr>
			<td>パスワード:</td>
			<td><input type="password" name="password"></td>
		　　</tr>
		</table>
	　　<input type="submit" value="ログイン"> <input type="reset" value="リセット">
	</form>
	<font color="red">${errorMessage}</font>
</body>
</html>