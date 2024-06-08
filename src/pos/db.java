/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos;
import java.sql.*;
import java.sql.Connection;
/**
 *
 * @author User
 */
public class db {
    public static Connection mycon()
    {
        Connection con= null;
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3310/pos","root","123");
            return con;
        }
        catch(ClassNotFoundException|SQLException e)
            
        {
             e.printStackTrace();
             return null;
        }
    }
}
