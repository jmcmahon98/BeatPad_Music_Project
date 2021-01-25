
/**
 *
 * @author dylon
 */

import java.sql.*;

public class MyConnection {

 public static Connection getConnection(){
     
        Connection con = null;        
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/beatpad", "root", "");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return con;
    }
}



