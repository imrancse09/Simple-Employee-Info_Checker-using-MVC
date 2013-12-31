package net.therap.controllers;

import net.therap.connection.DBManager;
import net.therap.model.EmployeeInfo;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Imran
 * Date: 12/17/13
 * Time: 12:47 AM
 * To change this template use File | Settings | File Templates.
 */
public class SearchController extends HttpServlet {

    final static String DATE_FORMAT = "dd-MMM-yyyy";

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String hiddenInputTypeFormName = request.getParameter("pagename");

        if(hiddenInputTypeFormName.equals("search")) {

            String inputDateInForm = request.getParameter("officeDate");
            String dateInString = inputDateInForm;

            try {

                String name = (String) request.getSession().getAttribute("user");

                if( isDateValid(dateInString) ) {

                    List<EmployeeInfo> listOfEmployeeInfo = DBManager.retrieveEmployeeInfo(dateInString, name);

                    request.setAttribute("arrayList", listOfEmployeeInfo);

                    RequestDispatcher requestDispatcher = request.getRequestDispatcher("result.jsp");
                    requestDispatcher.forward(request, response);

                    } else {
                        response.sendRedirect("/error.jsp");
                    }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private static boolean isDateValid(String date) {

        try {

            DateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);
            dateFormat.setLenient(false);
            dateFormat.parse(date);
            return true;

        } catch (ParseException e) {
            return false;
        }

    }
}
