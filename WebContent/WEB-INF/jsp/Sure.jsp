<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function change() {
		document.form.action = "G01Change";

	}

	function sakujo() {
		document.form.action = "G01Remove";

	}
</script>
</head>
<body>



	<form name="form" method="POST" onSubmit="return check()">


		<table border="1" width="300" cellspacing="0" cellpadding="30"
			bordercolor="#333333">
			<caption>科目の確認</caption>
			<tr>
				<td title="セル1-1">科目の確認</td>
				<td title="セル1-2">日付</td>

			</tr>
			<tr>
				<td title="セル2-1"></td>
				<td title="セル2-2"></td>
			</tr>

			<tr>
				<td title="セル2-1"></td>
				<td title="セル2-2"></td>
			</tr>

			<tr>
				<td title="セル2-1"></td>
				<td title="セル2-2"></td>
			</tr>



		</table>

		<input type="submit" value="変更" onclick="change()">
		<input
			type="submit" value="削除" onclick=" sakujo() ">

	</form>

</body>
</html>