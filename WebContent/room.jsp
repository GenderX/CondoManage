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
	<form action="${pageContext.request.contextPath}/addStudentHouseServlet">
		<table border="1px" align="center" width="520px" height="110px" bgcolor="aquamarine" cellpadding="0px">&nbsp;
		<tr>
			<td colspan="4" align="center"><font color="black" size="5">学生入住</font>(*为必填项)</td>
		</tr>
		<tr>
			<td align="center" width="150px" height="30px">学号</td>
			<td><input type="text" name="stuid" required="required" style="color:white" />*</td>
			<td align="center" width="150px" height="30px">楼号</td>
			<td>
				<select name="buildingid" style="color:white;background-color: blue;">
					<option value="1号" selected="selected">1号</option>
					<option value="2号">2号</option>
					<option value="3号">3号</option>
					<option value="4号">4号</option>
					<option value="5号">5号</option>
				</select>*
			</td>
		</tr>
		<tr>
			<td align="center" width="150px" height="30px">房号</td>
			<td><input type="text" name="houseid" required="required" style="color:white" />*</td>
			<td align="center" width="150px" height="30px">入住日期</td>
			<td><input type="datetime-local" name="date" style="color:blue" />*</td>
		</tr>
		<tr>
			<td colspan="4" align="center">
				<input type="submit" value="提交" />&nbsp;&nbsp;&nbsp;&nbsp;
				<input type="reset" value="重置" />
			</td>
		</tr>
		</table>
	</form>
</body>
</html>