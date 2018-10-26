<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
		<!--声明文档兼容模式，表示使用IE浏览器的最新模式-->
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<!--设置视口的宽度(值为设备的理想宽度)，页面初始缩放值<理想宽度/可见宽度>-->
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
		<title>添加学生</title>

		<!-- 引入Bootstrap核心样式文件 -->
		<link href="css/bootstrap.min.css" rel="stylesheet">
        <!--引入jQuery核心js文件 --> 
		<script src="js/jquery-1.11.0.min.js"></script>
		<!-- 引入BootStrap核心js文件 -->
		<script src="js/bootstrap.min.js"></script>
		<style>   
body {TEXT-ALIGN: center;}
#center { MARGIN-RIGHT: auto; MARGIN-LEFT: auto; }
</style>
</head>
<body>
<%-- <a href="${pageContext.request.contextPath}/listStudentServlet">学生列表</a><br> --%>
	<form method="post" action="${pageContext.request.contextPath}/addStudentServlet">
	<table class="table table-striped" >
		<tr>
			 <caption align="center">学生基本信息录入(*为必填项)</caption>
		</tr>
		<tr>
			<td alig/n="center" width="150px" height="50px">学号</td>
			<td><input type="text" name="sid" required="required" />*</td>
			<td align="center" width="150px" height="50px">姓名 </td>
			<td><input type="text" name="name" required="required" />*</td>
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
				<input type="text" name="address" required="required" />*
			</td>
		</tr>
		<tr>
			<td align="center" width="150px" height="50px">年度</td>
			<td><input type="text" name="year" required="required" />*</td>
			<td align="center" width="150px" height="50px">年制</td>
			<td><input type="text" name="calendarYear" required="required" />*</td>
		</tr>
		<tr>
			<td align="center" width="150px" height="50px">学院</td>
			<td>
			<select name="college">
				<option value="计算机科学" selected="selected">计算机科学</option>
				<option value="物信">物信</option>
				<option value="机建">机建</option></select>*</td>
			<td align="center" width="150px" height="50px">系</td>
			<td><input type="text" name="dedpartment" required="required" />*</td>
		</tr>
		<tr>
			<td align="center" width="150px" height="50px">专业</td>
			<td><input type="text" name="major" required="required" />*</td>
			<td align="center" width="150px" height="50px">班级</td>
			<td><input type="text" name="classes" required="required" />*</td>
		</tr>
		<tr>
			<td align="center" width="150px" height="50px">备注</td>
			<td><textarea name="note">
			
			</textarea></td>
			<tr >
		<td colspan="8" >
			<button type="submit" class="btn btn-default">提交</button>
			 <button type="reset" class="btn btn-default">重置</button>
		</td>
	</tr>		
		</tr>
	</table>
	</form>
</body>
</html>