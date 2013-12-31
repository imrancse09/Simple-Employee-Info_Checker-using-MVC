package net.therap.controllers;

import net.therap.connection.ConnectionManager;
import net.therap.connection.DBManager;
import net.therap.model.EmployeeInfo;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

/**
 * Created with IntelliJ IDEA.
 * User: Imran
 * Date: 12/17/13
 * Time: 12:40 AM
 * To change this template use File | Settings | File Templates.
 */
public class RegistrationController extends HttpServlet {

    EmployeeInfo employeeInfo;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String hiddenInputTypeFormName = request.getParameter("pagename");

        if(hiddenInputTypeFormName.equals("register")) {

            String employeeName = request.getParameter("name");
            String employeeWorkLocation = request.getParameter("location");
            String teamLeader = request.getParameter("leader");
            String date = request.getParameter("date");

            employeeInfo = new EmployeeInfo();

            employeeInfo.seteName(employeeName);
            employeeInfo.setWorkLocation(employeeWorkLocation);
            employeeInfo.setTeamLeader(teamLeader);
            employeeInfo.setDate(date);

            try {
                ConnectionManager.getConnection();
            } catch (Exception e) {
                e.printStackTrace();
            }

            try {

                DBManager.insertEmployeeInfoInDatabase(employeeInfo);
                response.sendRedirect("/success.jsp");

            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
