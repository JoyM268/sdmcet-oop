/* Write a Java program to implement the following scenario: 
Consider the following table available in the MySQL instance of StudentDB:

+-------------------------+
|       StudentInfo       |  
+-----------+-------------+
| RollNo    | int         |
| Name      | varchar(20) |
| USN       | varchar(10) |
| Division  | varchar(1)  |
+-----------+-------------+

Write a Java program that displays contents of the above-mentioned table on the console. */
import java.sql.*;

class Q7 {
	public static void main(String[] args) {
		final String driver = "com.mysql.jdbc.Driver";
		final String url = "jdbc:mysql://localhost:3306/StudentDB";
		final String userName = "root";
		final String password = "";
		
		try {
			Class.forName(driver);
			Connection conn = DriverManager.getConnection(url, userName, password);
			if(conn == null) {
				System.out.println("Connection could not be established");
			}
			
			Statement stmt = conn.createStatement();
			
			String sql = "SELECT * FROM StudentInfo";
			ResultSet rs = stmt.executeQuery(sql);
			System.out.println("The contents of the table are:");
			while(rs.next()) {
				//System.out.println(rs.getInt("RollNo") + " " + rs.getString("Name") + " " + rs.getString("USN") + " " + rs.getString("Division"));
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4));
			}
			conn.close();
			stmt.close();
			rs.close();
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}