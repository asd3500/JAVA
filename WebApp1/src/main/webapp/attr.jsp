<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Attr</title>
</head>
<body>
    <p>int number: ${number}</p>
    <p>Integer obNumber: ${obNumber}</p>
    <p>String str: ${str}</p>
    <p>String user.login: ${user.login}</p> <%-- user.getLogin() --%>
    <p>User user: ${user}</p>

    <p>Count items: ${list.size()}</p>
    <p>List: </p>
    <ul>
        <c:forEach var="item" items="${list}">
            <li>${item}</li>
        </c:forEach>
    </ul>
    <p>String newAttr: ${newAttr}</p>
</body>
</html>
