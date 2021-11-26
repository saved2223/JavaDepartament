<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 22.11.2021
  Time: 21:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <c:set var="kathedras" value="${kathedras}" scope="page"/>
    <c:set var="departaments" value="${departaments}" scope="page"/>
    <c:set var="groups" value="${groups}" scope="page"/>
    <title>Добавление нового студента</title>

</head>
<body>
<h1>Зачисление студента</h1>
<form action="/createStudent" method="post">
    <p>Полное имя</p>
    <p> <input id="name" name="name"  type="text" required></p>
    <p>Дата рождения</p>
    <p> <input id="date" name="date" type="date" required></p>
    <p>Адрес</p>
    <p> <input id="adress" name="adress" type="text" required></p>
    <p>Факультет</p>
    <p ><select id="dep" name="dep" required>
        <c:forEach items="${departaments}" var="departament">
            <option value="${departament.getId()}" > ${departament.getName()}</option>
        </c:forEach>
    </select>
    </p>
    <p>Кафедра</p>
    <p ><select id="kath" name="kath" required>
        <c:forEach items="${kathedras}" var="kathedra">
            <option value="${kathedra.getId()}"> ${kathedra.getName()}</option>
        </c:forEach>
    </select>
    </p>
    <p>Семестр</p>
    <p> <input id="term" name="term" type="number" required></p>
    <p>Логин</p>
    <p> <input id="login" name="login" type="text" required></p>
    <p>Пароль</p>
    <p> <input id="password" name="password" type="text" required></p>
    <p>Группа</p>
    <p ><select id="group" name="group" required>
        <c:forEach items="${groups}" var="group">
            <option value="${group.getId()}"> ${group.getId()}</option>
        </c:forEach>
    </select>
    </p>
    <button type="submit">Добавить!</button>
</form>
    <a href="/home">Назад</a>
</body>
</html>
