<%@  page contentType="text/html;charset=UTF-8" %>
<%@  taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<form id="stuForm" action="${pageContext.request.contextPath}/shut" method="delete">

    <input type="hidden" name="id" value="${student.id}"/>

    <input type="hidden" name="_method" value="DELETE">
    吼吼吼！
    <td colspan="" align="center">
        <input type="submit" value="删我！"/></td>
</form>