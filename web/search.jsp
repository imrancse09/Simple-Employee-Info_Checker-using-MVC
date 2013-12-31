<%--
  Created by IntelliJ IDEA.
  User: Imran
  Date: 12/15/13
  Time: 3:22 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
</head>
<body>


<form method="post" name="search" action="/searchProcess">
    <input type="hidden" name="pagename" value="search"/>
    <table border="0" width="300"  bgcolor="#CDFFFF">
        <tr><td colspan=2 style="font-size:12pt;color:#0000FF;" align="center">
            <h3>Search Form</h3></td></tr>
        <tr><td ><b>Enter Date</b></td>
            <td>: <input type="text" name="officeDate" id="officeDate">
            </td></tr>

        <tr><td colspan=2 align="center">
            <input type="submit" name="submit" value="Search"></td></tr>
        Date Format "dd-MMM-yyyy"
    </table>


</form>
<form action="login.jsp">

    <input type="submit" value="logout"/>
</form>

</body>
</html>