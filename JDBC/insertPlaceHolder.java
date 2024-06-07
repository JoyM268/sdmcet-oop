//Program to insert placeholder using prepareStatement() method
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class insertPlaceHolder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final String url = "com.mysql.jdbc.Driver";
        final String dbURL = "jdbc:mysql://localhost/employeeDB";
        final String user = "root";
        final String password = "";
        try {
            Class.forName(url);

            Connection conn = DriverManager.getConnection(dbURL, user, password);

            PreparedStatement stmt = conn.prepareStatement("insert into employee values(?,?)");
            System.out.println("Enter id and name");
            int id = sc.nextInt();
            String name = sc.next();
            stmt.setInt(1, id);
            stmt.setString(2, name);

            int res = stmt.executeUpdate();
            if (res > 0) {
                System.out.println("Inserted...");
            } else {
                System.out.println("Not inserted");
            }

            conn.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}