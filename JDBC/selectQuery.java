//Program to execute select query
import java.sql.*;

public class selectQuery {
    public static void main(String[] args) {
        final String url = "com.mysql.jdbc.Driver";
        final String dbURL = "jdbc:mysql://localhost/employeeDB";
        final String user = "root";
        final String password = "";
        try {
            Class.forName(url);

            Connection conn = DriverManager.getConnection(dbURL, user, password);

            Statement stmt = conn.createStatement();
            String sql = "select * from employee";

            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                System.out.println(rs.getInt(1) + "   " + rs.getString(2));
            }
            conn.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }

}