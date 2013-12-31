package net.therap.connection;

import net.therap.model.EmployeeInfo;
import net.therap.model.TeamLeadersInfo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * TeamLeadersInfo: imranahmed
 * Date: 12/12/13
 * Time: 9:55 AM
 * To change this template use File | Settings | File Templates.
 */
public class DBManager {

    private static Connection connection = null;
    static PreparedStatement preparedStatement = null;

    public static void insertEmployeeInfoInDatabase(EmployeeInfo set) throws Exception {

        String sql = "INSERT INTO employee_work_info (empName, workLocation, teamLeader, date) VALUES (?, ?, ?, ?)";

        connection = ConnectionManager.getConnection();
        if(connection !=null){

            try {
                preparedStatement = connection.prepareStatement(sql);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if(preparedStatement !=null){
            try {
                preparedStatement.setString(1, set.geteName());
                preparedStatement.setString(2, set.getWorkLocation());
                preparedStatement.setString(3, set.getTeamLeader());
                preparedStatement.setString(4, set.getDate());
                preparedStatement.executeUpdate();
                ConnectionManager.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

     public  static List<EmployeeInfo> retrieveEmployeeInfo(String date, String name) throws Exception {

         String query = "SELECT * FROM employee_work_info WHERE date=? AND teamLeader =?";

         System.out.println("query:"+query);

         connection = ConnectionManager.getConnection();

         preparedStatement = connection.prepareStatement(query);
         preparedStatement.setString(1, date);
         preparedStatement.setString(2, name);

         ResultSet resultSet = preparedStatement.executeQuery();

         List<EmployeeInfo> employeeInfoArrayList = new ArrayList<EmployeeInfo>();

         while(resultSet.next()){

             EmployeeInfo employeeInfo = new EmployeeInfo();
             employeeInfo.setWorkLocation(resultSet.getString(3));
             employeeInfo.seteName(resultSet.getString(2));
             employeeInfo.setTeamLeader(resultSet.getString(4));
             employeeInfoArrayList.add(employeeInfo);

         }

         System.out.println(employeeInfoArrayList.toString());
         ConnectionManager.close();
         return  employeeInfoArrayList;

     }

     public  static boolean authenticateUserNameAndPassword(String uName, String uPassword) throws Exception {

         String query = "SELECT userName, password FROM user WHERE userName = ? AND password = ?";

         connection = ConnectionManager.getConnection();

         preparedStatement = connection.prepareStatement(query);
         preparedStatement.setString(1, uName);
         preparedStatement.setString(2, uPassword);

         ResultSet resultSet = preparedStatement.executeQuery();

         if(resultSet.next()) {

             TeamLeadersInfo teamLeadersInfo = new TeamLeadersInfo();
             teamLeadersInfo.setUsername(resultSet.getString(1));

             System.out.println(resultSet.getString(1));

             return true;

         }

         else return false;

         }
}
