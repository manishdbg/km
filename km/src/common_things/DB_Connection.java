package common_things;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB_Connection {


	public static void main(String[] args) {
		DB_Connection ob_DB_Connection=new DB_Connection();
		
		System.out.println(ob_DB_Connection.getConnection());
	}
	
	
		public Connection getConnection(){
			Connection connection=null;
			System.out.println("Connection called");
			try {
				Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
				connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databasename=KMDB;user=manish;password=Sunnu@2016"	);
		 	} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return connection;
		}
}
