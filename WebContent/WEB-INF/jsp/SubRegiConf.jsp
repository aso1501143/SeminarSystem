<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登録確認</title>
</head>
<body>
<form action="T01ZemiRegister" method="POST">
<table>
<tr><th>subname</th><td><c:out value="${T01ZemiRegister.subjectname}" /></td></tr>

<tr><th>subcf</th><td><c:out value="${T01ZemiRegister.subjectcf}" /></td></tr>
</table>
<p><input type="submit" value="OK!!"></p>
</form>
<p><a href="T01ZemiRegister">CHANGE!!</a>
<a href="Managerlogin.jsp">TOP!!</a></p>
</body>
</html>