<%--
  Created by IntelliJ IDEA.
  User: imranahmed
  Date: 12/10/13
  Time: 11:21 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Registration Successful</title>
</head>
<body>

Registration Successful
<form action="/process" method="post">
    <input type="hidden" name="pagenameSuccess" value="success"/>
    <a href="/WEB-INF/register.jsp" target=" ">Another Registration</a>


</form>
<form action="/logOutCtrl">

    <input type="submit" value="logout"/>
</form>

</body>
</html>