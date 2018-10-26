<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>


<!DOCTYPE html>
<html>

	<head>
		<meta charset="UTF-8">
		<title>费用查询</title>
	</head>
	<style>
		input[type='text'] {
			background-color: blue;
		}
	</style>
	</head>

	<body>
		<form action="">
			<table border="1px" align="center" widhth="520px" height="110px" bgcolor="aquamarine" cellpadding="0px">&nbsp;
				<tr>
					<td colspan="4" align="center">
						<font color="black" size="5">费用查询</font>(加*为必填项)</td>
				</tr>
				<tr>
					<td align="center" width="150px" height="30px">学号</td>
					<td><input type="text" name="stuid" required="required" style="color:white" />*</td>
					<td colspan="4" align="center">&nbsp;&nbsp;&nbsp;&nbsp;
						<input type="submit" value="查询" />&nbsp;&nbsp;&nbsp;&nbsp;
						<input type="reset" value="重置" />
					</td>
				</tr>

			</table>
		</form>
	</body>

</html>