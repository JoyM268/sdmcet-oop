/* Write a java program to implement the following scenario:
Consider the following table available in the MySQL instance of BookDB
+-------------------------+
|          BookInfo       |  
+-----------+-------------+
| ISBN      | int         |
| Title     | varchar(40) |
| Author    | varchar(40) |
| Publisher | varchar(30) |
| Price     | real        |
+-----------+-------------+
Write a Java program that displays contents of the above-mentioned table on the console. */
import java.sql.*;

class Q3_a {
	public static void main(String[] args) {
		final String driver = "com.mysql.jdbc.Driver";
		final String url = "jdbc:mysql://localhost:3306/BookDB";
		final String userName = "root";
		final String password = "";
		
		try {
			Class.forName(driver);
			Connection conn = DriverManager.getConnection(url, userName, password);
			if(conn == null) {
				System.out.println("Connection could not be established");
			}
			
			Statement stmt = conn.createStatement();
			
			String sql = "SELECT * FROM BookInfo";
			ResultSet rs = stmt.executeQuery(sql);
			System.out.println("The contents of the table are:");
			while(rs.next()) {
				//System.out.println(rs.getInt("ISBN") + " " + rs.getString("Title") + " " + rs.getString("Author") + " " + rs.getString("Publisher") + rs.getFloat("Price"));
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4) + " " + rs.getFloat(5));
			}
			conn.close();
			stmt.close();
			rs.close();
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}