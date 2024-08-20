
import java.sql.*;
import java.util.Scanner;

/**
 *
 * @author Milan
 */
public class Question1 {
    /* Note:
    create database name bca and table name student and insert some data manually 
    */
public Question1(){
   // Scrollable Sensitive
     try {
            Connection conn = DriverManager.getConnection("Jdbc:mysql://localhost/bca", "root", "");
            String query = "Select * from student";
            //PreparedStatement pst = conn.prepareStatement(query,ResultSetTYPE,ResultSetCONCURRENCY);
            PreparedStatement pst = conn.prepareStatement(query, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = pst.executeQuery();
            
            Scanner sc = new Scanner(System.in);
            int row =-1;
            //as 0 is not consider as positive or negative so if we type 0 then the loop will end 
            while (row !=0){
                System.out.println("Enter a row to read:");
                row =sc.nextInt();
                if(rs.absolute(row)){
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

    public static void main(String[] args) {
        // Scrollable INSensitive
        try {
            Connection conn = DriverManager.getConnection("Jdbc:mysql://localhost/bca", "root", "");
            String query = "Select * from student";
            //PreparedStatement pst = conn.prepareStatement(query,ResultSetTYPE,ResultSetCONCURRENCY);
            PreparedStatement pst = conn.prepareStatement(query, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = pst.executeQuery();

            System.out.println("First Data is :");
            rs.first();//gives first row data
            System.out.println("Name:" + rs.getString("name") + "  phone number:" + rs.getString("phone number"));

            System.out.println("Relative data  is :");
            rs.relative(3);//gives relative 3 rd row data after first
            System.out.println("Name:" + rs.getString("name") + "  phone number:" + rs.getString("phone number"));

            System.out.println("previous Data is :");
            rs.previous();//gives previous data as the cursor is at 4th row it will be give 3rd row data
            System.out.println("Name:" + rs.getString("name") + "  phone number:" + rs.getString("phone number"));

            System.out.println("last Data is :");
            rs.last();//gives last row data
            System.out.println("Name:" + rs.getString("name") + "  phone number:" + rs.getString("phone number"));

            System.out.println("Relative Data is :");
            rs.relative(-2);//gives 2 rows before the last row data as the cursor is at last row 
            System.out.println("Name:" + rs.getString("name") + "  phone number:" + rs.getString("phone number"));
        
         System.out.println("Absolute Data is :");
            rs.absolute(-1);//gives last row data
            // asbolute gives the row data as indicated in bracket if +ve count start from first if -ve then count starts from last
            System.out.println("Name:"+rs.getString("name")+"  phone number:"+rs.getString("phone number"));
        
        } catch (Exception e) {
            System.out.println("Error" + e.getMessage());
        }
        new Question1();
    }
}

