<%@ page import="java.util.List" %>
<%@ page import="java.util.Arrays" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> <!-- c(core) -->
<html>
<head>
    <title>JSTL page</title>
</head>
<body>
    <h1>
        <c:out value="Hello from JSTL"/>
    </h1>

    <c:set var="item" value="IT CLASS" scope="page"/>

    <p>item: ${item}</p>

    <c:if test="${not empty item}">
        <p>item is not empty</p>
    </c:if>

    <c:remove var="item" scope="page"/>

    <c:if test="${empty item}">
        <p>item is empty</p>
    </c:if>

    <c:choose>
        <c:when test="${not empty item}">
            <p>choose: item is not empty</p>
        </c:when>
        <c:otherwise>
            <p>choose: item is empty</p>
        </c:otherwise>
    </c:choose>

    <%
        List<String> list = Arrays.asList("Java", "PHP", "C++");
        request.setAttribute("list", list);
    %>

    <p>list:</p>
    <ul>
        <c:forEach var="obj" items="${list}">
            <li>${obj}</li>
        </c:forEach>
    </ul>

    <c:url var="tut.by" value="https://www.tut.by/">
        <c:param name="param1" value="IT CLASS"/>
    </c:url>

    <a href="${tut.by}">TUT.BY</a>
<%--    <c:redirect url="${tut.by}"/>--%>

    <c:import url="main.jsp"/>
</body>
</html>
