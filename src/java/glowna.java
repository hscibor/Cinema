
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import pl.edu.wat.user.User;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Damian
 */
@ManagedBean(name = "helloWorld", eager = true)
@RequestScoped
public class glowna {

    public String getMessage() {

        return "Pierwsza strona!";
    }

    public List<User> getUser() throws SQLException, ClassNotFoundException {
        ResultSet rs = null;
        String name = null;
        Connection conn = null;
        Statement stmt = null;
        String sql;
        conn = ConnectionBD.getConnection();
                            
        //stmt = conn.createStatement();

        List<User> users = new ArrayList<User>();


        sql = "SELECT * FROM `users` ORDER BY `uid` ASC";
        rs = stmt.executeQuery(sql);
        System.out.println("4444444444444444444444444444444444444");

        while (rs.next()) {
            User user = new User();
            user.setMsg(rs.getInt("uid"));
            user.setPwd(rs.getString("password"));
            user.setUser(rs.getString("uname"));

            users.add(user);
            System.out.println("name  - " + name);

        }
        rs.close();
        stmt.close();
        ConnectionBD.close(conn);

        return users;
    }

}
