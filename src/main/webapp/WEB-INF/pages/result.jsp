<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false" %>

<a href="http://localhost:8080/ssm_project/table">返回</a>
<%--这里的判断不起作用，那句话无论怎样都会输出，最后要把==改为=却发现什么都输出不了了，为什么啊？？？--%>
<c:if test="${studnet=null}">
    你傻呀，不会看看号码再查啊？！
</c:if>

<hr>

<c:if test="${student!=null}">
    <form action="${pageContext.request.contextPath}/return" method="post">
        <table border="1" cellspacing="0" cellpadding="10">
        <tr>
            <th>身份证号码</th>
            <th>你的名字</th>
        </tr>
        <tr>
            <td>${student.id}</td>
            <td>${student.user_name}</td>
        </tr>
    </table>
    </form>
</c:if>


