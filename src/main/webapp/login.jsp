<%--
  Created by IntelliJ IDEA.
  User: lonniearellano
  Date: 3/9/23
  Time: 3:05 PM
  To change this template use File | Settings | File Templates.
--%>


<%
    String username = request.getParameter("username");

    String password = request.getParameter("password");

    String method = request.getMethod();


    if(method.equals("POST")){
        if (username.equals("admin") && password.equals("password")){
            response.sendRedirect("/profile.jsp");
        }
    }

%>


<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form action="/login.jsp" method="post">
    <label>
        <input type="text" name="username" placeholder="username">
    </label>

    <label>
        <input type="password" name="password" placeholder="password">
    </label>
    <button>Login</button>
</form>


</body>
</html>
