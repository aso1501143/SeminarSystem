<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>


	<form action="<%= request.getContextPath() %>/Login" method="POST">
	<b>ログイン</b><br />
		<table>
	<tr>
			<td>ID:</td>
			<td><input type="text" name="userid"></td>
			</tr>
		 	<tr>
			<td>password:</td>
			<td><input type="password" name="password"></td>
			</tr>
		</table>
		<input type="submit" value="ログイン"> <input type="reset" value="リセット">
	</form>
	<br>
	<a href="/asoshop/NewUser">新規登録はこちら</a>
</body>
</html>

