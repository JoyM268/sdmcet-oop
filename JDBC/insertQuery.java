//Program to insert values in database
import java.sql.*;

public class insertQuery {
    public static void main(String[] args) {
        final String url = "com.mysql.jdbc.Driver";
        final String dbURL = "jdbc:mysql://localhost/employeeDB";
        final String user = "root";
        final String password = "";
        try {
            Class.forName(url);

            Connection conn = DriverManager.getConnection(dbURL, user, password);

            Statement stmt = conn.createStatement();
            String sql = "insert into employee values(2,'xyz')";
            int res = stmt.executeUpdate(sql);
            if (res > 0) {
                System.out.println("Inserted");
            } else {
                System.out.println("Not inserted");
            }

            conn.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}