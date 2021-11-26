<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 15.11.2021
  Time: 14:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.0/jquery.min.js"></script>
</head>
<body onload>


    <form  method="post">
        <p><b>Вы преподаватель или студент?</b></p>
        <p><input type="radio" name="opt" value="1" checked> Преподаватель <Br>
           <input type="radio" name="opt" value="2"> Студент <Br>
        </p>
        <p id="loginLabel">Login:</p>
        <input type="text" name="login" id="login" placeholder="login" required/><br>
        <p id="passwordLabel">Password: </p>
        <input type="password" name="password" id="password" placeholder="password" required/><br>
        <input id="loginButton" type="submit" value="Login!">
    </form>
    <script>
    </script>
</body>
</html>
