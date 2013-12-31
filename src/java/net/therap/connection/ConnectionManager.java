package net.therap.connection;

import javax.naming.InitialContext;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created with IntelliJ IDEA.
 * TeamLeadersInfo: imranahmed
 * Date: 12/12/13
 * Time: 9:55 AM
 * To change this template use File | Settings | File Templates.
 */
public class ConnectionManager {

    private static Connection connection;

    public static Connection getConnection() throws Exception {

        if (connection == null) {

            InitialContext initialContext = new InitialContext();

            DataSource dataSource = (DataSource) initialContext.lookup("java:/comp/env/jdbc/TestDB");
            connection = dataSource.getConnection();

            return connection;
        }

        return connection;
    }

    public static void close() {
        try {
            if (connection != null) {
                connection.close();

                connection = null;
            }

            System.out.println("Connection Terminated");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
