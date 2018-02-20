<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>

<form id="stuForm" action="${pageContext.request.contextPath}/edit" method="post">


    <input type="hidden" name="id" value="${student.id}"/>


    修改信息
    <table width="25%" border=1>
        <tr>
            <td>你的名字</td>
            <td><input type="text" name="user_name" value="${student.user_name}"/></td>
        </tr>
        <tr>
            <td colspan="" align="center">
                <input type="submit" value="点我提交"/>
            </td>
        </tr>
    </table>

</form>