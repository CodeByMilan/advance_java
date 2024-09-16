
import java.sql.*;
import javax.sql.rowset.*;

/**
 *
 * @author Milan
 */
public class Question3 {

    public static void main(String[] args) {
        try {
            JdbcRowSet rowset = RowSetProvider.newFactory().createJdbcRowSet();
            rowset.setUrl("Jdbc:mysql://localhost/bca");
            rowset.setUsername("root");
            rowset.setPassword("");
            rowset.setCommand("Select * from student");
            
            rowset.execute();
            while (rowset.next()) {
                System.out.println("Name:" + rowset.getString("name") + "  phone number:" + rowset.getString("phone number"));
            }

        } catch (SQLException e) {
            System.out.println("error:" + e.getMessage());
        }
    }
}