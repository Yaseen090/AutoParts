/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fusionatuoparts;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class DBConnector {

       
  
    public static Connection db() {
       
      
       Connection connection = null;
        try {
            // Register Derby JDBC driver
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            // Connect to the database
            String url = "jdbc:derby://localhost:1527/parts";
            String username = "root";
            String password = "FATIMAH*";
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to the database");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return connection;
}
}
        
    

         

