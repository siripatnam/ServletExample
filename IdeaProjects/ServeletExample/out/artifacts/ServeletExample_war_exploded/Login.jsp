<%--
  Created by IntelliJ IDEA.
  User: Siri Patnam
  Date: 8/12/2018
  Time: 2:45 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login Page</title>
</head>
<body>

<h2>Enter username and password to Login</h2>

<form action = "/welcome" method="get">
    <label>UserName:</label>
    <input type="text" name = "uname" required>
    <br><br>
    <label>Password:</label>
    <input type="password" name = "password" required>
    <br><br>
    <input type="submit" value="submit">

</form>
</body>
</html>
