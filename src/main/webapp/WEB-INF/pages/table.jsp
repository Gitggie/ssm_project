<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%--border边框厚度，cellspacing 边框与边框之间的间隙大小，cellpadding 边框与其内容的间隙大小--%>

<html>
<head>
    <title>列表</title>
    <script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-1.9.1.min.js"></script>
    <script type="text/javascript">
        <%--/function add() {--%>
             <%--window.location.href="${pageContext.request.contextPath}/insert";--%>
        <%--}--%>

        function del(id) {
            if (confirm("确定删除id吗？")) {
                $.ajax({
                    type: "delete",
                    url: "${pageContext.request.contextPath}/student/" + id,
                    data: "{id:id}",
                    dataType: "text",
                    success: function (msg) {
                        if (msg == "suc") {
                            alert("删除成功");
                            location.reload();
                        } else {
                            alert("删除失败");
                        }
                    }
                })
            }
        }
    </script>
</head>
<body>

<form>
    <table border="1" cellspacing="0" cellpadding="10">
        <tr>
            <th>身份证号码</th>
            <th>你的名字</th>
            <th><a href="insert">增加</a></th>
            <%--<th><input type="button" value="添加" onclick="add()"></th>--%>
            <th><a href="look">查询</a></th>
        </tr>
        <%--迭代标签，var="变量名" items="要迭代的list，要被循环的信息"
        ${requestScope.studentAll}是在request范围内查找studentAll。--%>
        <%--${requestScope.studentAll} 等价于 request.getAttribute("studentAll")--%>
        <%--这个绿色的student是数据表吧,哪里有设置过???--%>
        <c:forEach var="student" items="${requestScope.studentAll}">
            <tr>
                <td>${student.id}</td>
                <td>${student.user_name}</td>
                <td><a href="/ssm_project/update?id=${student.id}">修改</a></td>
                    <%--<td><a href="/delete?id=${student.id}">删除</a></td>--%>
                <td><input type="button" value="删除" onclick="del (${student.id})">
                <td>
            </tr>
        </c:forEach>
    </table>
</form>
</body>
</html>