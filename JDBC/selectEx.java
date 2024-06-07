//Program to demonstrate printing of values from the database
import java.sql.*;

class selectEx {
    public static void main(String args[]) {
        final String url = "jdbc:mysql://localhost:3306/logindb";
        final String user = "root";
        final String pwd = "";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, pwd);
            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery("select * from person");
            while (rs.next())
                System.out.println(rs.getString(1) + "  " + rs.getString(2));

            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}