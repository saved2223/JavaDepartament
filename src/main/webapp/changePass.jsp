<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 25.11.2021
  Time: 1:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
  <h1>Изменение пароля</h1>
  <form action="/changePass" method="post">
      <p>Введите пароль</p><br>
      <input type="password" name="pass1" required> <br>
      <p>Введите пароль еще раз</p><br>
      <input type="password" name="pass2" required><br>
      <button type="submit" >Изменить</button>><br>
  </form>
  <a href="/home">Назад</a>
</body>
</html>
