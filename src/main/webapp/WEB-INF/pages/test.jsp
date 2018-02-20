
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--这个taglib-json包是无法引入pom.xml的，必须通过jar包手动导入--%>
<%@ taglib prefix="json" uri="http://www.atg.com/taglibs/json" %>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
    <title>Title</title>
</head>
<body>

    <%--<json:property name="s" value="${AAA}" />--%>
    <json:object name="student">
        <json:property name="AAA" value="${AAA}"/>
    </json:object>

<%--<json:property name="AAA" value="${AAA}"/>--%>
</body>
</html>
<%--<json:object>
    <json:array name="studentAll" var="student" items="${requestScope.studentAll}">
        <json:object name="student">
            <json:property name="id" value="${student.id}"/>
            <json:property name="studnet_name" value="${student.user_name}"/>
        </json:object>
    </json:array>
</json:object>--%>


<%--
<html>
<body>
<h2>在 JavaScript 中创建 JSON 对象</h2>

<p>
    Name: <span id="jname"></span><br />
    Age: <span id="jage"></span><br />
    Address: <span id="jstreet"></span><br />
    Phone: <span id="jphone"></span><br />
</p>

<script type="text/javascript">
    var JSONObject= {
        "name":"Bill Gates",
        "street":"Fifth Avenue New York 666",
        "age":56,
        "phone":"555 1234567"};
    document.getElementById("jname").innerHTML=JSONObject.name
    document.getElementById("jage").innerHTML=JSONObject.age
    document.getElementById("jstreet").innerHTML=JSONObject.street
    document.getElementById("jphone").innerHTML=JSONObject.phone
</script>

</body>
</html>--%>
