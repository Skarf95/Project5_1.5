<%--
  Created by IntelliJ IDEA.
  User: euninjun
  Date: 2022/12/11
  Time: 11:44 PM
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login</title>
    <style>
        img,label {display:inline-block;}
        label {width:130px}
        button{background-color:blue;color:white;font-size:15px}
    </style>
</head>
<body>
<div style='width:100%;text-align:center;padding-top:100px'>
    <img src='../img/snowman.jpg' height="250">
    <form method="post" action="loginOk">
        <div><label>User ID: </label> <input type='text' name='userid'/></div>
        <div><label>Password: </label> <input type='password' name='password'/></div>
        <button type='submit'>login</button>
    </form>
</div>
</body>
</html>

