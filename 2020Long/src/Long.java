/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.*;
/**
 *
 * @author Milan
 */
public class Long {
    public static void main (String [] args){
        try{
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/college","root","");
            String query = "SELECT * FROM students where division =? and Major =?";
            PreparedStatement  pst = conn.prepareStatement(query);
            pst.setString(1,"distinction");
            pst.setString(2,"Data Science");
            ResultSet rs = pst.executeQuery();
            while (rs.next()){
                String Name = rs.getString("name");
                String Level = rs.getString("level");
                String division = rs.getString("division");
                String Major = rs.getString("major");
                int rollno =rs.getInt("rollno");
                
                System.out.println("rollno:"+rollno+"Name:"+Name+"Level:"+Level+"division"+division+"major"+Major);
               
            }
            
        }
        catch(Exception e){
          e.printStackTrace();
        }
        
    }
    
}
