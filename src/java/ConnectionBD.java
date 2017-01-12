
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Damian
 */
public class ConnectionBD {

    public static Connection getConnection() throws ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");

        Connection con = null;
        System.out.println("Połączenie !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!1");
        String url = "jdbc:mysql://localhost:3306/kino";
        String user = "root";
        String password = "";
        try {
            con = DriverManager.getConnection(url, user, password);
            System.out.println("Połączenie z bazą danych zostało zrealizowane");
        } catch (SQLException ex) {
            System.out.println("ERROR błąd połącznienia - " + ex.getMessage());
        }

        return null;
    }

    public static void close(Connection con) {
        try {
            con.close();
        } catch (Exception ex) {
        }

    }
}
