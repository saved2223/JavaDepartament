<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 17.11.2021
  Time: 1:00
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <c:set var="user" value="${user}" scope="page"/>
    <title></title>
</head>
<body>
    <h1> Личный кабинет преподавателя</h1>
    <div>Информация о пользователе:</div>
    <div>Имя: ${user.getName()}</div>
    <div>Дата рождения: ${user.getBirthDate()}</div>
    <div>Адрес: ${user.getAdress()}</div>
    <div>Должность: ${user.getTitle()}</div>
    <div>Зарплата: ${user.getCalary()}</div>
    <a href="/subjects">Показать Ваши предметы </a>
    <br>
    <c:if test="${user.getPosition() == 'admin'}">
        <a href="/createStudent">Добавить студента</a>
        <br>
        <a href="/deleteStud">Удалить студента</a>
    </c:if>
    <br>
    <a href="/createSubj">Добавить предмет</a>
    <br>
    <a href="/checkPass"> Изменить пароль</a>
    <br>
    <a href="/logout"> Выйти </a>
</body>
</html>
