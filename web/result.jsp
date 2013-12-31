<%@ page import="java.util.ArrayList" %>
<%@ page import="net.therap.model.EmployeeInfo" %>
<%--
  Created by IntelliJ IDEA.
  TeamLeadersInfo: Imran
  Date: 12/15/13
  Time: 5:07 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Searched Result</title>
</head>
<body>
<table border="1" width="300" bgcolor="#CDFFFF">
    <tr>
        <th>Employee Name</th>
        <th>Work Location</th>
        <th>Team Leader</th>
    </tr>
    <%
        ArrayList arrayList =(ArrayList)request.getAttribute("arrayList");
        for (int i=0;i<arrayList.size();i++){
            EmployeeInfo employeeInfo = (EmployeeInfo) arrayList.get(i);
    %>
    <tr>
        <td> <%= employeeInfo.geteName()%></td>
        <td> <%= employeeInfo.getWorkLocation()%></td>
        <td> <%= employeeInfo.getTeamLeader()%></td>
    </tr>
    <%
        }
    %>




</table>
<form action="search.jsp" width="300"  >
    <br>

    <input type="submit" value="Search With Another Date"/>

</form>
<form action="/logOutCtrl">

    <input type="submit" value="logout"/>
</form>
</body>
</html>