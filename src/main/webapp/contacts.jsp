<%--
  Created by IntelliJ IDEA.
  User: lonniearellano
  Date: 3/15/23
  Time: 7:33 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <c:forEach items="${contacts}" var="contact">
        <h1>${contact.phone_number}</h1>
    </c:forEach>


</body>
</html>
