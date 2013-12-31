<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%--
  Created by IntelliJ IDEA.
  User: Imran
  Date: 12/13/13
  Time: 8:30 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Login Page</title>
</head>
<body>
<form name="login" method="post" action="/process">
    <input type="hidden" name="pagename" value="login"/>
    Enter username : <input type="text" name="txtUsername"> <BR>
    Enter password : <input type="password" name="txtPassword"> <BR>
    <input type="submit" />
</form>
</body>
</html>