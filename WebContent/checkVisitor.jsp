<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title></title>
<link rel="stylesheet" href="style.css" type="text/css" />
</head>
<body>
	<form action="${pageContext.request.contextPath}/serachVistor" method="post">
		<table border="1px" align="center" widhth="520px" height="110px"
			bgcolor="aquamarine" cellpadding="0px">
			&nbsp;
			<tr>
				<td colspan="4" align="center"><font color="black" size="5">来访查询</font>(*为必填项)</td>
			</tr>
			<tr>
				<td align="center" width="150px" height="30px">来访日期</td>
				<td><input type="text" name="date" required="required"
					style="color: white" />*</td>
				<td align="center"> <input type="submit" value="查询" />
				</td>
					<td align="center"><input type="reset" value="重置" />
					</td>						
			</tr>

		</table>
	</form>
</body>
</html>