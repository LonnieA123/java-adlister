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

    if(username != null && password != null ){
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
    <input type="text" name="username" placeholder="username">
    <input type="password" name="password" placeholder="password">
    <button>Login</button>
</form>


</body>
</html>
