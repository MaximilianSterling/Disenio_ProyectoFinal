/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConexionMySQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author cocob
 */
public class conexionMySQL {
    private static Connection connection;

    public static Connection getConnection() throws SQLException {
        if (connection == null) {
            String url = "jdbc:mysql://localhost:3306/eventos_potros";
            String user = "root";
            String password = "*****";
            connection = DriverManager.getConnection(url, user, password);
        }
        return connection;
    }

    public static void closeConnection() throws SQLException {
        if (connection != null) {
            connection.close();
        }
    }
}
