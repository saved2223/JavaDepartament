<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 25.11.2021
  Time: 0:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form method="post">
        <p>Введите старый пароль</p>
        <input id="oldPassword" name="oldPassword" type="password" required>
        <button type="submit" >Отправить </button>
    </form>
    <a href="/home">Назад</a>
    <script>
        function doPost(oldpass){
            $.post("/checkPass", {oldPassword: oldpass})
        }
    </script>
</body>
</html>
