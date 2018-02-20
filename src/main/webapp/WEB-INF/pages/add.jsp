<%@  page contentType="text/html;charset=UTF-8" %>
<%@  taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>增加</title>
    <%--这个ajax方法布尔返回值失败，暂时不知道为什么--%>
    <%--<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-1.9.1.min.js"></script>
    <script type="text/javascript">
        function add() {
            alert($("#stuForm").serialize());

            $.ajax({
                url: "<%=request.getContextPath()%>/a",
                type: "put",
                data: $("#stuForm").serialize(),
                dataType: "text",
                success: function (obj) {
                    if (obj) {
                        alert("增加成功");
                        &lt;%&ndash;window.location.href = "<%=request.getContextPath()%>/table";&ndash;%&gt;
                    }
                    else {
                        alert("增加失败");
                    }

                }
            })
        }
    </script>--%>
</head>

<body>
<%--通过方法post把值传给action页面--%>
<form id="stuForm" action="${pageContext.request.contextPath}/add" method="post">
    <input type="hidden" name="_method" value="PUT">
    这里不知道写什么，随便看吧
    <table width="25%" border=1>
        <tr>
            <td>身份证号码</td>
            <td><input type="text" name="id"/></td>
        </tr>
        <tr>
            <td>你的名字</td>
            <td><input type="text" name="user_name"/></td>
        </tr>
        <tr>
            <td colspan="" align="center">
                <input type="submit" value="点我提交"/></td>
            <%--<input type="button" value="新增" onclick="add()" >--%>
        </tr>
    </table>
</form>
</body>
</html>