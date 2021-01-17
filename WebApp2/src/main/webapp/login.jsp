<%@ page import="by.itClass.Constants" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Login page</title>
</head>
<body>
    <h2>Login form</h2>
    <c:if test="${not empty message}">
        <span style="color: #ff0000">${message}</span>
    </c:if>
    <form action="<c:url value="/login"/>" method="post">
        <input type="text" name="<%= Constants.LOGIN_LABEL%>"> <br>
        <input type="password" name="<%= Constants.PASSWORD_LABEL%>"> <br>
        <input type="submit" value="enter">
    </form>
</body>
</html>
