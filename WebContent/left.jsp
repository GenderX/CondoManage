<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8" %>
<!DOCTYPE html>
<html>
<head>
    <link rel="StyleSheet" href="css/dtree.css" type="text/css"/>
    <script type="text/javascript" src="js/dtree.js"></script>
    <meta charset="utf-8">
    <title></title>
</head>
<body>

    <div class="dtree" >

        <p><a href="javascript: d.openAll();">open all</a> | <a href="javascript: d.closeAll();">close all</a></p>

        <script type="text/javascript">
            

            d = new dTree('d');

            d.add(0, -1, '公寓管理系统');
            d.add(1, 0, '学生管理', '');

            d.add(2, 0, '房间管理', '');
            d.add(3, 0, '财务管理', '');
            d.add(4, 0, '出楼管理', '');
            
            d.add(6, 0, '来访管理', '');
            d.add(7, 0, '维修管理', '');
            d.add(8, 0, '费用管理', '');

            d.add(10, 0, '系统管理', '');

            d.add(11, 1, '添加学生', 'student.jsp','','right');
            d.add(12, 1, '查看学生信息', '${pageContext.request.contextPath}/listStudentServlet','','right');
            d.add(13, 2, '人员入住', 'room.jsp','','right');
            d.add(14, 3, '房间重要财务录入', 'finance.jsp','','right');
            d.add(15, 4, '出楼登记', 'out.jsp','','right');
            d.add(16, 6, '来访查询', 'checkVisitor.jsp','','right');
            d.add(17, 7, '故障报修', 'register.jsp','','right');
            d.add(18, 7, '报修查询', 'report.jsp','','right');
            d.add(19, 8, '设置费用标准', 'money.jsp','','right');
            d.add(20, 8, '费用查询', 'queryFee.jsp','','right');
            d.add(21,6,'来访登记','visitor.jsp','','right')


            document.write(d);

            
        </script>

    </div>


    <%--<tr>
    <td>
    <a href="right.jsp" target="right"><font color="black">【点击查看首页】</font></a><br /><br />
    <a href="student.jsp" target="right"><font color="black">【学生管理】</font></a><br /><br />
    <a href="room.jsp" target="right"><font color="black">【房间管理】</font></a><br /><br />
    <a href="finance.jsp" target="right"><font color="black">【财务管理】</font></a><br /><br />
    <a href="out.jsp" target="right"><font color="black">【出楼管理】</font></a><br /><br />
    <a href="enter.jsp" target="right"><font color="black">【来访管理】</font></a><br /><br />
    <a href="service.jsp" target="right"><font color="black">【维修管理】</font></a><br /><br />
    <a href="money.jsp" target="right"><font color="black">【费用管理】</font></a><br /><br />
    <a href="information.jsp" target="right"><font color="black">【信息管理】</font></a><br /><br />
    <a href="system.jsp" target="right"><font color="black">【系统管理】</font></a>
    </td>
    </tr>--%>
</body>
</html>