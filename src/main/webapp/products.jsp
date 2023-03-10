<%@ page import="model.Product" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.Arrays" %><%--
  Created by IntelliJ IDEA.
  User: lonniearellano
  Date: 3/10/23
  Time: 10:51 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    Product p1 = new Product("cheese",400);
    Product p2 = new Product("lettuce",200);
    Product p3 = new Product("bread",300);

    List<Product> foods = new ArrayList<>(Arrays.asList(
            p1,
            p2,
            p3
    ));

    request.setAttribute("foodz",foods);
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <div>

        <c:forEach items= "${foodz}" var='food'>
            <h2>${food.name}${food.costInCents}</h2>
        </c:forEach>

    </div>
</body>
</html>
