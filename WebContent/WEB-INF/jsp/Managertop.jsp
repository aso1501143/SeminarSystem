<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>管理者トップページ</title>
</head>
<body>

<h1>管理者</h1>
<form action="<%= request.getContextPath() %>/T01ZemiRegister" method="POST"><button>ゼミ科目の登録</button></form>

<br><br><br>


<form action="<%= request.getContextPath() %>/T01SL_confirmation" method="POST"><button>受講生徒一覧表</button></form>


</body>
</html>
