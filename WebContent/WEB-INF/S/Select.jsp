<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/common.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ゼミ科目の申込</title>
</head>
<body>
<form action="G01Select" method="POST">
		<h1>ゼミ科目申込</h1>
	<br>
		・IT分野<br>
	<ul style="list-style:none;">
		<li><input type="checkbox" name="q1" value="その1">
		<span style="border-bottom:dotted 3px #89abc6;">ITパスポート</span>
		</li>
		<li>
		 <input type="checkbox" name="q1" value="その2">
		<span style="border-bottom:dotted 3px #89abc6;">基本情報</span>
		</li>
		<li>
		<input type="checkbox" name="q1" value="その3">
		<span style="border-bottom:dotted 3px #89abc6;">応用情報</span>
		</li>
	</ul>




		・英語<br>
		<ul style="list-style:none;">
		<li>
		<input type="checkbox" name="q1" value="その1">
		<span style="border-bottom:dotted 3px #89abc6;">英語基礎</span><br>
		</li>
		<li>
		<input type="checkbox" name="q1" value="その2">
		<span style="border-bottom:dotted 3px #89abc6;">リスニング</span><br>
		</li>
		</ul>




		・コミュニケーション<br>
		<ul style="list-style:none;">
		<li>
		<input type="checkbox" name="q1" value="その1">
		<span style="border-bottom:dotted 3px #89abc6;">グループディスカッション</span><br>
		</li>
		<li>
		<input type="checkbox" name="q1" value="その2">
		<span style="border-bottom:dotted 3px #89abc6;">グループワーク</span><br>
		</li>
		</ul>

<input type="submit" value="決定"> <input type="submit" value="取り消し"> <br><br><br><a href="login.jsp">トップページへ</a>

</form>
</body>
</html>