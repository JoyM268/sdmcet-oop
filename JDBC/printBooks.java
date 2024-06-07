//Program to demonstrate inserting, updating and selecting values in the database
import java.sql.*;

public class printBooks {
    public static void main(String[] args) {
        final String url = "com.mysql.jdbc.Driver";
        final String dbURL = "jdbc:mysql://localhost/bookDB";
        final String user = "root";
        final String password = "";
        try {
            Class.forName(url);

            Connection conn = DriverManager.getConnection(dbURL, user, password);

            Statement stmt = conn.createStatement();

            String sql = "insert into book values(2,'c',200)";
            String sql1 = "select title from book where id=1";

            String sql2 = "update book set id=3 where price=200";

            int res = stmt.executeUpdate(sql);
            int res1 = stmt.executeUpdate(sql2);
            if (res < 0 || res1 < 0) {
                System.out.println("Insertion cannot be done");
                System.exit(0);
            }

            ResultSet rs = stmt.executeQuery(sql1);

            while (rs.next()) {
                System.out.println(rs.getString(1));
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}