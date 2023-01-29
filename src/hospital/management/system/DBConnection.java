/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital.management.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author USER
 */
public class DBConnection {
    
    public static String url = "jdbc:mysql://localhost:3306/hospitalms";
    public static String user = "root";
    public static String password = "root";
    
    public static Connection connectdb(){
        
        Connection con;
        try {
           // Class.forName("com.mysql.cj.jdbc.driver"); 
            con = DriverManager.getConnection(url, user, password);
            
            System.out.println("Connection Created Sucessfullly !!"+con);
            return con;
            
        }catch(SQLException  e){
            System.out.println("Error");
            return null;
        }
     
    }
}
