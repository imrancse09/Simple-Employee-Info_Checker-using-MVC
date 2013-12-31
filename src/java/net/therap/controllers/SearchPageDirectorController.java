package net.therap.controllers;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: imranahmed
 * Date: 12/19/13
 * Time: 3:42 PM
 * To change this template use File | Settings | File Templates.
 */
public class SearchPageDirectorController extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/search.jsp").forward(request, response);
    }
}
