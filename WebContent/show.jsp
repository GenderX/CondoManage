<%@ page language="java" contentType="text/html; charset=utf8"
	pageEncoding="utf8"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta charset="utf-8">
	<!--声明文档兼容模式，表示使用IE浏览器的最新模式-->
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<!--设置视口的宽度(值为设备的理想宽度)，页面初始缩放值<理想宽度/可见宽度>-->
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
		<title>Bootstrap基本模板</title>

		<!-- 引入Bootstrap核心样式文件 -->
		<link href="css/bootstrap.min.css" rel="stylesheet">
        <!--引入jQuery核心js文件 --> 
		<script src="js/jquery-1.11.0.min.js"></script>
		<!-- 引入BootStrap核心js文件 -->
		<script src="js/bootstrap.min.js"></script>
<title>Insert title here</title>
</head>
<body>

	<table class="table table-striped" >
  <caption align="center">学生基本信息</caption>
  <thead>
			<TR
				style="FONT-WEIGHT: bold; FONT-STYLE: normal; BACKGROUND-COLOR: #eeeeee; TEXT-DECORATION: none">
				<TD>学号</TD>
				<TD>姓名</TD>
				<TD>性别</TD>
				<TD>入学年份</TD>
				<TD>学院</TD>
				<TD>专业</TD>
				<TD>房间号</TD>
				<td>楼号</td>
				<td>地址</td>
				<td>系</td>
				<td>班级</td>
			</TR>
			</thead>
			<c:forEach items="${list }" var="student">
				<TR
					style="FONT-WEIGHT: normal; FONT-STYLE: normal; BACKGROUND-COLOR: white; TEXT-DECORATION: none">
					<TD>${student.sid }</TD>
					<TD>${student.name }</TD>
					<TD>${student.sex }</TD>
					<TD>${student.year }</TD>
					<TD>${student.college }</TD>
					<TD>${student.major }</TD>
					<TD>${student.houseid }</TD>
					<td>${student.buildingid}</td>
					<td>${student.address}</td>
					<td>${student.dedpartment}</td>
					<td>${student.classes}</td>
					<TD><a
						href="${pageContext.request.contextPath }/upDateStudentToEdit?sid=${student.sid}">修改</a>
						&nbsp;&nbsp; <a
						href="${pageContext.request.contextPath }/DeleteStudentServlet?sid=${student.sid}">删除</a>
					</TD>
				</TR>

			</c:forEach>

		</TBODY>
	</TABLE>


</body>
</html>