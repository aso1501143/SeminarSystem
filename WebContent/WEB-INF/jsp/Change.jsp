<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ちぇんじ</title>
</head>
<body>
<form action="<%= request.getContextPath() %>/G01torikesi" method="POST">

<style>
table {
	border-collapse: collapse;
}
td {
	border: solid 1px;
	padding: 0.5em;
}

</style>

	　　<b>ゼミ科目変更</b><br />

			<p>・IT<br>
				<input type="checkbox" name="q1" value="その1"> ITパスポート  <br>
				<input type="checkbox" name="q1" value="その2"> 基本情報      <br>
				<input type="checkbox" name="q1" value="その3"> 応用情報      <br>
		</p>




			<p>・英語<br>
				<input type="checkbox" name="q1" value="その1"> 英語基礎 <br>
				<input type="checkbox" name="q1" value="その2"> リスニング    <br>

		</p>




			<p>・コミュニケーション<br>
				<input type="checkbox" name="q1" value="その1"> グループディスカッション  <br>
				<input type="checkbox" name="q1" value="その2"> グループワーク     <br>

		</p>




<input type="reset" value="取り消し"> <input type="submit" value="決定">

<br><br><br><a href="login.jsp">トップページへ</a>

</form>
</body>
</html>


