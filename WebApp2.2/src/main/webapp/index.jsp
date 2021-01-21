<%@ page import="by.itclass.Constants" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>webapp2.2</title>
    <link rel="stylesheet" href="./css/main.css">
</head>
<body>
<div class="upper-bar">
    <c:if test="${not empty login}">
        <span>${firstName} ${lastName}</span>
        <a href="<c:url value="<%=Constants.INDEX_JSP%>"/> " class="upper-bar__link">logout</a>
    </c:if>
    <c:if test="${empty login}">
        <a href="<c:url value="<%=Constants.LOGIN_JSP%>"/>" class="upper-bar__link">login</a>
        <a href="<c:url value="<%=Constants.REGISTER_JSP%>"/>" class="upper-bar__link">register</a>
    </c:if>
</div>
<h1>welcome page</h1>
</body>
</html>
