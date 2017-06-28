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
		<form action="<%=request.getContextPath()%>/T01ZemiRegister2"
			method="POST">
			<p>
				教科： <select name="subjectcf">
					<option value="I">IT</option>
					<option value="C">コミュニケーション</option>
					<option value="E">英語</option>
				</select>
			</p>
			科目名:
			<input type="text" name="subjectname"> <br> 
			<button type="button" class="btn btn-primary">
			<span class="glyphicon glyphicon-ok-sign"></span>決定
		</button>

			<button type="button" class="btn btn-primary">
			<span class="glyphicon glyphicon-remove-sign"></span>リセット
		</button>
		</form>
		<a href="Managerlogin.jsp">TOP!</a>

	</center>
</body>
</html>