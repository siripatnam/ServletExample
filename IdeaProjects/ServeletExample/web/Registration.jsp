<%--
  Created by IntelliJ IDEA.
  User: Siri Patnam
  Date: 8/12/2018
  Time: 2:29 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User Registration </title>
</head>
<body>
<h2>Complete the Form to Login</h2>
<form action="/registration">

    <label>First Name:</label>
    <input type="text" name = "fname" required>
    <br><br>
    <label>Last Name:</label>
    <input type="text" name = "lname" required>
    <br><br>
    <label>Gender:</label>
    <input type="text" name = "gender" required>
    <br><br>
    <label>E-mail:</label>
    <input type="email" name = "email" required>
    <br><br>
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
