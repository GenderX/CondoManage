<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title></title>
</head>
<body>
<%-- <a href="${pageContext.request.contextPath}/listStudentServlet">学生列表</a><br> --%>
	<form method="post" action="${pageContext.request.contextPath}/UpdateStudentServlet2">
	<table border="1px" align="center" width="900px" height="400px" bgcolor="aquamarine" cellpadding="0px">&nbsp;
		<tr>
			<td colspan="4" align="center"><font size="5">学生基本信息修改</font>(*为必填项)</td>
		</tr>
		<tr>
			<td alig/n="center" width="150px" height="50px">学号</td>
			<td><input type="text" name="sid"  value="${student.sid }" readonly="readonly" />*</td>
			<td align="center" width="150px" height="50px">姓名 </td>
			<td><input type="text" name="name" value="${student.name }" required="required" />*</td>
		</tr>
		<tr>
			<td align="center" width="150px" height="50px">性别</td>
			<td>
				<select name="sex">
				<option value="男" selected="selected">男</option>
				<option value="女">女</option></select>*
			</td>
			<td align="center" width="150px" height="50px">籍贯</td>
			<td>
				<input type="text" name="address"  value="${student.address }"  required="required" />*
			</td>
		</tr>
		<tr>
			<td align="center" width="150px" height="50px">年度</td>
			<td><input type="text" name="year"  value="${student.year }"  required="required" />*</td>
			<td align="center" width="150px" height="50px">年制</td>
			<td><input type="text" name="calendarYear" value="${student.calendarYear }"  required="required" />*</td>
		</tr>
		<tr>
			<td align="center" width="150px" height="50px">学院</td>
			<td>
			<select name="college">
				<option value="计算机科学" selected="selected">计算机科学</option>
				<option value="物信">物信</option>
				<option value="机建">机建</option></select>*</td>
			<td align="center" width="150px" height="50px">系</td>
			<td><input type="text" name="dedpartment" value="${student.dedpartment }" required="required" />*</td>
		</tr>
		<tr>
			<td align="center" width="150px" height="50px">专业</td>
			<td><input type="text" name="major" value="${student.major }" required="required" />*</td>
			<td align="center" width="150px" height="50px">班级</td>
			<td><input type="text" name="classes"  value="${student.classes }" required="required" />*</td>
		</tr>
		<tr>
			<td align="center" width="150px" height="50px">备注</td>
			<td><textarea name="note">
			${student.note }
			</textarea></td>
			<td colspan="2" ><input type="submit" value="录入" />
			&nbsp;&nbsp;&nbsp;&nbsp;<input type="reset" value="重置" />
			</td>
		</tr>
	</table>
	</form>
</body>
</html>