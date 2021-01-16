<%@ page import="java.time.LocalDate" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JSP</title>
</head>
<body>
    <h3>Hello JSP</h3>
    <%
        // JAVA code
        LocalDate date = LocalDate.now();

    %>
    <p>5 + 3 = <%= 5+3%></p>

    <%!
        private String name;

        private int sum(int a, int b) {
            return a + b;
        }
    %>

    <%= sum(1,4)%>

</body>
</html>
