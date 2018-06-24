package test;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class connectToSQLServer {

	static String url, user, password;
	static String connectionUrl;
	static Connection con;
    static Statement stmt;
    static ResultSet rs;  
	
	static void initialize() {
		
		Properties pro = new Properties();
		try {
			pro.load(new FileInputStream("LogIn_Info.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		url = pro.getProperty("url");
		user = pro.getProperty("user");
		password = pro.getProperty("password");
		
		// connection string 
		connectionUrl = url + ";user=" + user + ";password=" + password;
		
		// Assign the JDBC objects
		con = null; stmt = null; rs = null;
		
		// Establish the connection
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			con = DriverManager.getConnection(connectionUrl);
		} catch (Exception e) {
			e.printStackTrace();
		}  
	}
	
	void BookList() {
		// In ra danh sách những cuốn sách có trong thư viện
		try {
			String SQL = "SELECT MA_SACH, TEN_SACH FROM SACH";
	        stmt = con.createStatement();
	        rs = stmt.executeQuery(SQL);
	        while (rs.next()) {
	            System.out.println(rs.getString(1) + " | " + rs.getString(2));
	         }

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		connectToSQLServer exec = new connectToSQLServer();
		initialize();
		exec.BookList();
        // Iterate through the data in the result set and display it.  
        
		/*try {  
	         // Establish the connection.  
	         /*Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  
	         con = DriverManager.getConnection(connectionUrl);

	         // Create and execute an SQL statement that returns some data.  
	         String SQL = "SELECT * FROM ThongTin";  
	         stmt = con.createStatement();  
	         rs = stmt.executeQuery(SQL);  

	         // Iterate through the data in the result set and display it.  
	         while (rs.next()) {  
	            System.out.println(rs.getString(1) + " " + rs.getString(2));  
	         }  
	      }

	      // Handle any errors that may have occurred.  
	      catch (Exception e) {  
	         e.printStackTrace();  
	      }  
	      finally {  
	         if (rs != null) try { rs.close(); } catch(Exception e) {}
	         if (stmt != null) try { stmt.close(); } catch(Exception e) {} 
	         if (con != null) try { con.close(); } catch(Exception e) {}
	      }*/
	}

}
