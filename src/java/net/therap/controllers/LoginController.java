package net.therap.controllers;

//import com.mysql.jdbc.Connection.ConnectionManager;
//import java.sql.Connection.DBManager;
import net.therap.connection.DBManager;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: imranahmed
 * Date: 12/10/13
 * Time: 11:22 AM
 * To change this template use File | Settings | File Templates.
 */
public class LoginController extends HttpServlet{

//    @Resource(name = "jdbc/TestDB")
//    private DataSource dataSource;
//
//    private static final long serialVersionUID = 1L;
//    EmployeeInfo employeeInfo;
//
//    public LoginController() {
//        super();
//    }

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response) throws ServletException, IOException {

        String hiddenInputTypeFormName = request.getParameter("pagename");

        if(hiddenInputTypeFormName.equals("login")){

            String inputUserName = request.getParameter("txtUsername");
            String inputPassword = request.getParameter("txtPassword");

            if( (inputUserName.equals("admin")) && (inputPassword.equals("admin")) ) {

                HttpSession session = request.getSession(true);

                    if(request.getSession(false)!=null){

                        request.getSession().setAttribute("user", "user");
                        response.sendRedirect("regiCtrl");

                }
            }

            else try {

                 if(DBManager.authenticateUserNameAndPassword(inputUserName, inputPassword)) {

                 HttpSession session = request.getSession(true);

                    if(request.getSession(false)!=null) {

                        request.getSession().setAttribute("user", inputUserName);
                        response.sendRedirect("inputSearchCtrl");

                    } else {
                      response.sendRedirect("/login.jsp");
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}




