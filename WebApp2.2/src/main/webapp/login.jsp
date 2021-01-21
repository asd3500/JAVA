<%@ page import="by.itclass.Constants" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>webapp2.2</title>
    <link rel="stylesheet" href="./css/main.css">
</head>
<body>
<div class="container flex-left">
    <form action="<c:url value="/login"/> " class="form hide-left" method="POST">
        <span class="form__title">Login form</span> <br>
        <label for="login" class="form__label">login</label> <br>
        <input type="text" name="<%=Constants.LOGIN_LABEL%>" id="login" class="form__input"> <br>
        <label for="password" class="form__label">password</label> <br>
        <input type="password" name="<%=Constants.PASSWORD_LABEL%>" id="password" class="form__input"> <br>
        <input type="submit"  class="form__submit" value="login">
        <c:if test="${not empty message}">
            <span class="alert">${message}</span> <br>
        </c:if>
    </form>
    <a href="<c:url value="<%=Constants.INDEX_JSP%>"/>" class="button-back hide-left">back</a>
</div>
<script src="./js/show.js"></script>
</body>
</html>
