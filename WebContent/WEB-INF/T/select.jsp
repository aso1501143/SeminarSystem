<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ゼミ科目申込画面</title>
<link rel="stylesheet" href="bootstrap-3.3.7/css/bootstrap.css">
<link rel="stylesheet" href="css/style.css">
</head>
<body>

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

	<button type="button" class="btn btn-primary">
		<span class="glyphicon glyphicon-ok-sign"></span>決定
	</button>
	<button type="button" class="btn btn-primary">
		<span class="glyphicon glyphicon-remove-sign"></span>取消
	</button>


</body>
</html>