//Java program to demonstrate inserting of values in database
import java.sql.*;

class updateDB {
    public static void main(String[] args) {
        final String driver = "com.mysql.jdbc.Driver";
        final String url = "jdbc:mysql://localhost:3306/2SD22CS038";
		final String user = "root";
		final String pwd = "";

        String usn = "2SD22CS000";
        String name = "abc";
        double cgpa = 9.9;
        int sem = 4;

        try {
            Class.forName(driver);

            Connection conn = DriverManager.getConnection(url, user, pwd);
            if(conn == null){
                System.out.println("Connection Failed...");
            }else{
                System.out.println("Connection Established.");
            }

            Statement stmt = conn.createStatement();
            String sql1 = "insert into student values('" + usn + "', '" + name + "', " + cgpa + ", " + sem + ")";
            int rows = stmt.executeUpdate(sql1);
            System.out.println(rows + " Rows were modified in database");

            String sql2 = "select * from student";
            ResultSet rs = stmt.executeQuery(sql2);
            while(rs.next()){
                System.out.println(rs.getString("usn") + " " + rs.getString("name") + " " + rs.getDouble("cgpa") + " " + rs.getInt("sem"));
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}