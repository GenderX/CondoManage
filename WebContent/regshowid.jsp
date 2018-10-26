<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<script type="text/javascript" src="js/jquery-1.8.3.js"></script>

<title>Insert title here</title>
</head>
<body>

	<TABLE id=grid
		style="BORDER-TOP-WIDTH: 0px; FONT-WEIGHT: normal; BORDER-LEFT-WIDTH: 0px; BORDER-LEFT-COLOR: #cccccc; BORDER-BOTTOM-WIDTH: 0px; BORDER-BOTTOM-COLOR: #cccccc; WIDTH: 100%; BORDER-TOP-COLOR: #cccccc; FONT-STYLE: normal; BACKGROUND-COLOR: #cccccc; BORDER-RIGHT-WIDTH: 0px; TEXT-DECORATION: none; BORDER-RIGHT-COLOR: #cccccc"
		cellSpacing=1 cellPadding=2 rules=all border=0>
		<TBODY>
			<TR
				style="FONT-WEIGHT: bold; FONT-STYLE: normal; BACKGROUND-COLOR: #eeeeee; TEXT-DECORATION: none">
				<TD>保修编号</TD>
				<TD>楼号</TD>
				
				<TD>房间号</TD>
				<TD>原因</TD>
				<TD>日期</TD>
				<TD>维修状态</TD>
				<TD>=====</TD>
	
			</TR>
			<c:forEach items="${listid }" var="reg" varStatus="status">
				<TR
					style="FONT-WEIGHT: normal; FONT-STYLE: normal; BACKGROUND-COLOR: white; TEXT-DECORATION: none">
					<TD>${reg.id }</TD>
					<TD>${reg.buildingId }</TD>
					<TD>${reg.roomId }</TD>
					<TD>${reg.reason }</TD>
					<TD>${reg.registerDate }</TD>
					
					<c:if test="${reg.state==false }">
						<TD>未完成</TD>
					</c:if>
					<c:if test="${reg.state==true }">
						<TD>完成</TD>
					</c:if>
					<TD><button id="${status.count}" onclick="item()">保修完成</button></TD>
				</TR>
<script>
	$(function(){
		var it = ${status.count};
		$("#${status.count}").click(function(){
			window.location.href="${pageContext.request.contextPath }/BaoxiuwanchengServlet?"+"id="+${reg.id}+"&buildingId="+${reg.buildingId};
		})
	});
</script>
			
			</c:forEach>

		</TBODY>
	</TABLE>

</body>
</html>