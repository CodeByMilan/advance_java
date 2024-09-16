
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Milan
 */
public class Question2 {
   

    public static void main(String[] args) {
       try {
            Connection conn = DriverManager.getConnection("Jdbc:mysql://localhost/bca", "root", "");
            String query = "Select * from student";
            //PreparedStatement pst = conn.prepareStatement(query,ResultSetTYPE,ResultSetCONCURRENCY);
            PreparedStatement pst = conn.prepareStatement(query, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = pst.executeQuery();
              Scanner sc = new Scanner(System.in);
            int row =-1;
            //as 0 is not consider as positive or negative so if we type 0 then the loop will end 
            while (row !=0){
                System.out.println("Enter a row to update:");
                row =sc.nextInt();
                if(rs.absolute(row)){
                    rs.updateString("name", "Milan Acharya");
                    rs.updateRow();
                    System.out.println("Name:"+rs.getString("name")+"  phone number:"+rs.getString("phone number"));
                }
                else {
                    System.out.println("there is no data at row "+row);
                }
            }
        
        } catch (Exception e) {
            System.out.println("Error" + e.getMessage());
        }
    }

}

    

