//Program to demonstrate establishment of connection and printing of data in the database
import java.sql.*;
class connectionDB {
	public static void main(String[] args) {
		final String driver = "com.mysql.jdbc.Driver";
		final String url = "jdbc:mysql://localhost:3306/2SD22CS038";
		final String user = "root";
		final String pwd = "";
	
		try {
			//Step 1
			Class.forName(driver);
			
			//Step 2
			Connection conn = DriverManager.getConnection(url, user, pwd);
			if(conn == null) {
				System.out.println("Connection Failed!!");
			}else {
				System.out.println("Established....");
			}
			
			//Step 3
			Statement stmt = conn.createStatement();
			
			String sql = "select * from student";
			
			//Step 4
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getDouble(3) + " " + rs.getInt(4));
			}

		}catch(Exception e) {
			e.printStackTrace();
		}	
	}
}