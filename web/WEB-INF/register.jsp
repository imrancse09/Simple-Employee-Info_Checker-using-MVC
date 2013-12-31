<%--
  Created by IntelliJ IDEA.
  User: Imran
  Date: 12/11/13
  Time: 3:57 PM
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title></title>
</head>
<body>
<form action="/processRegistration" method="post">
    <input type="hidden" name="pagename" value="register"/>
    Enter Employee Name : <input type="text" name="name">     <BR>
    Enter Work Location : &nbsp;&nbsp;<input type="text" name="location"> <BR>
    Enter Team Leader   : &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="leader">   <BR>
    Enter Date          : &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="date">     <BR>
    <input type="submit" value="Register" />
</form>
</body>
</html>


