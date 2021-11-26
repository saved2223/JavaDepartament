<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 25.11.2021
  Time: 1:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="backPage" value="${backPage}" scope="page"/>
<c:set var="message" value="${message}" scope="page"/>
<html>
<head>
    <title>Error</title>
</head>
<body>
    <h1>${message}</h1>
    <a href="${backPage}">Назад</a>
</body>
</html>
