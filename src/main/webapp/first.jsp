<%--
  Created by IntelliJ IDEA.
  User: lonniearellano
  Date: 3/9/23
  Time: 1:39 PM
  To change this template use File | Settings | File Templates.
--%>


<%
String input = request.getParameter("thisInput");
request.setAttribute("message",input);
%>


<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
    <head>
        <title>Title</title>
    </head>
    <body>

        <form action="/first.jsp" method="post">
            <input type="text" name="thisInput">
            <button>SELECT ME</button>
        </form>

        <h1>THIS IS ME: ${message} </h1>

    </body>
</html>
