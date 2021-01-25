
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
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("Select * from users");
            while(rs.next()){
                //System.out.println(rs.getString(1));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return con;
    }
}



