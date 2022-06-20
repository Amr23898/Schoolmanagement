/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolmanagement.controler;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ElAbd
 */
public class DBconection {

    private static Connection con;

    public static Connection getconnection() {
        if (con == null) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/mydatabase", "root", "");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(DBconection.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(DBconection.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return con;
    }

    public static void closeconnection() {
        if (con != null) {
            con = null;
        }
    }
   
}
