<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 22.11.2021
  Time: 20:55
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <c:set var="subjects" value="${subjects}" scope="page"/>
    <title>Title</title>
</head>
<body>
    <h1>Ваши предметы</h1>
    <table>
        <th>Название</th>
        <th>Количество часов</th>
        <th>Экзамен</th>
        <th>Семестр</th>
    <c:forEach items="${subjects}" var="subject">
        <tr>
            <td>${subject.getName()}</td>
            <td>${subject.getHours()}</td>
            <td>${subject.getIsExam()}</td>
            <td>${subject.getTerm()}</td>
        </tr>
    </c:forEach>
    </table>
    <a href="/home">Назад</a>
</body>
</html>
