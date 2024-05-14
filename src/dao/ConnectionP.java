/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author MARIEM
 */
public class ConnectionP {
    public static Connection getCon(){
       try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // Utilisation de la nouvelle classe du pilote JDBC MySQL
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmacy?useSSL=false","root","");
            return con;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
        
    }
    
}
