<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 25.11.2021
  Time: 2:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <c:set var="kathedras" value="${kathedras}" scope="page"/>
    <title>Title</title>
</head>
<body>
    <h1>Добавление нового предмета</h1>
    <form action="/createSubj" method="post">
        <p>Кафедра</p>
        <p ><select id="kath" name="kath" required>
            <c:forEach items="${kathedras}" var="kathedra">
                <option value="${kathedra.getId()}"> ${kathedra.getName()}</option>
            </c:forEach>
        </select>
        </p>
        <p>Название</p>
        <input type="text" name="name" required>
        <p>Кол-во часов</p>
        <input type="number" name="hours" required>
        <br>
        <select name="is_exam" required>
            <option value="1">Экзамен</option>
            <option value="0">Зачет</option>
        </select>
        <p>Семестр</p>
        <input type="number" name="term" required>
        <br>
        <input type="submit" value="Добавить!">
    </form>
    <a href="/home">Назад</a>
</body>
</html>
