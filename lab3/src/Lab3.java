
import javax.swing.JOptionPane;
import java.sql.*;
import java.util.Scanner;

public class Lab3 {

    public static void main(String[] args) {
        String DBName = JOptionPane.showInputDialog("Enter The Name Of Database You want to Create:");

        try {
            Connection conn = DriverManager.getConnection("Jdbc:mysql://localhost/", "root", "");
            // Database creation query
            String query = "CREATE DATABASE " + DBName;
            PreparedStatement pst = conn.prepareStatement(query);
            pst.executeUpdate();
            System.out.println("Database created successfully!");

            // Table creation query
            Connection con = DriverManager.getConnection("Jdbc:mysql://localhost/" + DBName, "root", "");

            String tquery = "CREATE TABLE employee( RollNo INT PRIMARY KEY, Firstname VARCHAR(50), Lastname VARCHAR(50), Address VARCHAR(100), Email VARCHAR(100) UNIQUE, DateOfBirth DATE)";
            PreparedStatement pst1 = con.prepareStatement(tquery);
            pst1.executeUpdate();
            System.out.println("Table created successfully!");
            
            
                //data insertion using joption pane 
//               String iquery = "INSERT INTO employee (RollNo, Firstname, Lastname, Address, Email, DateOfBirth) VALUES (?, ?, ?, ?, ?, ?)";
//            PreparedStatement pst2 = con.prepareStatement(iquery);
//
//            int continueInput;
//            do {
//                String rollNoStr = JOptionPane.showInputDialog("Enter RollNo:");
//                int rollNo = Integer.parseInt(rollNoStr);
//
//                String firstname = JOptionPane.showInputDialog("Enter Firstname:");
//                String lastname = JOptionPane.showInputDialog("Enter Lastname:");
//                String address = JOptionPane.showInputDialog("Enter Address:");
//                String email = JOptionPane.showInputDialog("Enter Email:");
//                String dob = JOptionPane.showInputDialog("Enter DateOfBirth (yyyy-mm-dd):");
//
//               
//                pst2.setInt(1, rollNo);
//                pst2.setString(2, firstname);
//                pst2.setString(3, lastname);
//                pst2.setString(4, address);
//                pst2.setString(5, email);
//                pst2.setDate(6, java.sql.Date.valueOf(dob)); // Converting string date to java.sql.Date
//
//                pst2.executeUpdate();
//                
//                continueInput = JOptionPane.showConfirmDialog(null, "Do you want to insert more data?", "Select an Option", JOptionPane.YES_NO_OPTION);
//
//            } while (continueInput == JOptionPane.YES_OPTION);
//
//            System.out.println("Data inserted successfully!");


            // Data insertion
            String iquery = "INSERT INTO employee (RollNo, Firstname, Lastname, Address, Email, DateOfBirth) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement pst2 = con.prepareStatement(iquery);
            Scanner sc = new Scanner(System.in);

            String continueInput;
            do {
                System.out.print("Enter RollNo: ");
                int rollNo = sc.nextInt();
                sc.nextLine(); // Consume newline

                System.out.print("Enter Firstname: ");
                String firstname = sc.nextLine();

                System.out.print("Enter Lastname: ");
                String lastname = sc.nextLine();

                System.out.print("Enter Address: ");
                String address = sc.nextLine();

                System.out.print("Enter Email: ");
                String email = sc.nextLine();

                System.out.print("Enter DateOfBirth (yyyy-mm-dd): ");
                String dob = sc.nextLine();

                pst2.setInt(1, rollNo);
                pst2.setString(2, firstname);
                pst2.setString(3, lastname);
                pst2.setString(4, address);
                pst2.setString(5, email);
                //Note : it is must to convert the value of dob as the value given by user is string and we have defined the type of Dob as date so we can store only date format value .
                pst2.setDate(6, java.sql.Date.valueOf(dob));

                pst2.executeUpdate();

                System.out.print("Want to insert more data? (y/n): ");
                continueInput = sc.nextLine();
            } while (continueInput.equalsIgnoreCase("y"));

            System.out.println("Data inserted successfully!");
            
            

            // Data selection query
            String squery = "SELECT * FROM employee WHERE Address = ?";
            PreparedStatement pst3 = con.prepareStatement(squery);
            pst3.setString(1, "Kathmandu");

            ResultSet rs = pst3.executeQuery();
            while (rs.next()) {
                System.out.println("RollNo: " + rs.getInt("RollNo"));
                System.out.println("Firstname: " + rs.getString("Firstname"));
                System.out.println("Lastname: " + rs.getString("Lastname"));
                System.out.println("Address: " + rs.getString("Address"));
                System.out.println("Email: " + rs.getString("Email"));
                System.out.println("DateOfBirth: " + rs.getDate("DateOfBirth"));
            }
            System.out.println("End of data.");

            
            
            //update query
            String uquery = "SELECT RollNo FROM employee ORDER BY RollNo LIMIT 4, 1";
            PreparedStatement pst4 = con.prepareStatement(uquery);
            ResultSet rs1 = pst4.executeQuery();
            if (rs1.next()) {
                int rollNo = rs1.getInt("RollNo");
                System.out.println("rollno is " + rollNo);
                String updatequery = "UPDATE employee SET Firstname = 'Ram', Lastname = 'Sharma' WHERE RollNo = ?";
                PreparedStatement pstmt = con.prepareStatement(updatequery);
                pstmt.setInt(1, rollNo);
                pstmt.executeUpdate();

                System.out.println("Record updated successfully!");

            } else {
                System.out.println("5th record does not exist.");
            }
            
            

            // Deletion query
            String dquery = "SELECT RollNo FROM employee ORDER BY RollNo DESC LIMIT 1";
            PreparedStatement pst5 = con.prepareStatement(dquery);
            ResultSet rs2 = pst5.executeQuery();

            if (rs2.next()) {
                int rollNo = rs2.getInt("RollNo");

                String deletequery = "DELETE FROM employee WHERE RollNo = ?";
                PreparedStatement pstmt = con.prepareStatement(deletequery);
                pstmt.setInt(1, rollNo);
                pstmt.executeUpdate();

                System.out.println("Last record deleted successfully!");
            } else {
                System.out.println("No records to delete.");
            }
        } catch (Exception e) {
            System.out.println("SQL Error: " + e.getMessage());

        }
    }
}
