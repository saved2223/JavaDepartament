<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 24.11.2021
  Time: 16:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<c:set var="studs" value="${studs}" scope="page"/>
<html>
<head>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.0/jquery.min.js"></script>
    <title>Title</title>
</head>
<body>
    <h1>Выберите студента, которого хотите отчислить</h1>
    <table>
        <th>Имя</th>
        <th>Дата рождения</th>
        <th>Адрес</th>
        <th> </th>
        <c:forEach items="${studs}" var="stud">
            <tr>
                <td>${stud.getName()}</td>
                <td>${stud.getBirthDate()}</td>
                <td>${stud.getAdress()}</td>
                <td><button formmethod="post" onclick="doPost(${stud.getId()})" >Удалить</button></td>
            </tr>
        </c:forEach>
    </table>
    <a href="/home">Назад</a>
    <script>
        function doPost(id){
            $.post("/deleteStud", {id: id})
        }
    </script>

</body>
</html>
