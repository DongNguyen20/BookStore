
package Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author admin
 */
public class ConnectSQL {
    public ConnectSQL(){}
    public static Connection  getConnection()throws ClassNotFoundException{
     
        Connection conn = null; 
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String connectionURL = "jdbc:sqlserver://localhost:1433;databaseName=QLNS; user=sa;password=123456";
            conn = DriverManager.getConnection(connectionURL);
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,"Kết nối không thành công!");
        }
        return conn;
    }
  
}
