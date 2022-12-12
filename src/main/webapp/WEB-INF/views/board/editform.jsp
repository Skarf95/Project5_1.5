<%--
  Created by IntelliJ IDEA.
  User: euninjun
  Date: 2022/12/05
  Time: 11:21 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Edit Form</title>
</head>

<body>

<h1>Edit Form</h1>
<form:form modelAttribute="boardVO" method="POST" action = "../editok">
    <form:hidden path="seq"/>
    <table id = "edit">
        <tr><td>Category:</td><td><form:input path = "category" /></td></tr>
        <tr><td>Title:</td><td><form:input path = "title" /></td></tr>
        <tr><td>Writer:</td><td><form:input path = "writer"/></td></tr>
        <tr><td>Content:</td>
            <td><form:textarea cols="50" rows="5" path="content"/></td>
        </tr>

    </table>
    <input type = "submit" value = "Edit"/>
    <input type="button" value="Cancel" onclick="history.back()"/>
</form:form>
</body>

</html>