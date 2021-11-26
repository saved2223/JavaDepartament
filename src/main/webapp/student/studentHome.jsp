<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 17.11.2021
  Time: 1:01
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <c:set var="user" value="${user}" scope="page"/>
    <title>Title</title>
</head>
<body>
    <h1> Личный кабинет студента</h1>
    <div>Информация о пользователе:</div>
    <div>Имя: ${user.getName()}</div>
    <div>Дата рождения: ${user.getBirthDate()}</div>
    <div>Адрес: ${user.getAdress()}</div>
    <div>Группа: ${user.getGroupNum()}</div>

</body>
</html>
