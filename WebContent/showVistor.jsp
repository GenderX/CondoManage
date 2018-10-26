<%@ page language="java" contentType="text/html; charset=utf8"
	pageEncoding="utf8"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf8">
<title>Insert title here</title>
</head>
<body>

	<TABLE id=grid
		style="BORDER-TOP-WIDTH: 0px; FONT-WEIGHT: normal; BORDER-LEFT-WIDTH: 0px; BORDER-LEFT-COLOR: #cccccc; BORDER-BOTTOM-WIDTH: 0px; BORDER-BOTTOM-COLOR: #cccccc; WIDTH: 100%; BORDER-TOP-COLOR: #cccccc; FONT-STYLE: normal; BACKGROUND-COLOR: #cccccc; BORDER-RIGHT-WIDTH: 0px; TEXT-DECORATION: none; BORDER-RIGHT-COLOR: #cccccc"
		cellSpacing=1 cellPadding=2 rules=all border=0>
		<TBODY>
			<TR
				style="FONT-WEIGHT: bold; FONT-STYLE: normal; BACKGROUND-COLOR: #eeeeee; TEXT-DECORATION: none">
				<TD>楼号</TD>
				<TD>房间号</TD>
				<TD>被访人姓名</TD>
				<TD>来访人姓名</TD>
				<TD>所属关系</TD>
				<TD>来访时间</TD>
				<TD>证件号码</TD>
				<td>证件名称</td>
				<td>值班人</td>
			</TR>
			<c:forEach items="${list }" var="visitor">
				<TR
					style="FONT-WEIGHT: normal; FONT-STYLE: normal; BACKGROUND-COLOR: white; TEXT-DECORATION: none">
					<TD>${visitor.buildingid }</TD>
					<TD>${visitor.houseid }</TD>
					<TD>${visitor.bevistname }</TD>
					<TD>${visitor.vistname }</TD>
					<TD>${visitor.relative }</TD>
					<TD>${visitor.date }</TD>
					<TD>${visitor.idnumber }</TD>
					<td>${visitor.idtype}</td>
					<td>${visitor.dutyname}</td>
				 	<%-- <TD><a
						href="${pageContext.request.contextPath }/upDateStudentToEdit?sid=${student.sid}">修改</a>
						&nbsp;&nbsp; <a
						href="${pageContext.request.contextPath }/DeleteStudentServlet?sid=${student.sid}">删除</a>
					</TD> --%> 
				</TR>

			</c:forEach>

		</TBODY>
	</TABLE>


</body>
</html>