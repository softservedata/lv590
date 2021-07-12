package com.softserve.edu.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ApplDB {
	private static Connection con = null;
	private static String username = "devops";
	private static String password = "DevOps_553";
	//private static String URL = "jdbc:mysql://192.168.153.134:3306/lv590";
	private static String URL = "jdbc:mysql://192.168.153.134:3306/teach";

	public static void main(String[] args) throws SQLException {
		System.out.println("Start...");
		DriverManager.registerDriver(new com.mysql.jdbc.Driver());
		con = DriverManager.getConnection(URL, username, password);
		if (con != null) {
			System.out.println("Connection Successful! \n");
		} else {
			System.out.println("Connection ERROR \n");
			System.exit(1);
		}
		Statement st = con.createStatement();
		/*-
		st.execute("CREATE DATABASE lv590;");
		String query = "CREATE TABLE temp "
			+ "( id int unsigned not null auto_increment primary key, "
			+ "name varchar(20), "
			+ "login varchar(20), "
			+ "password varchar(30), "
			+ "age int );";
		//
		String query = "INSERT INTO temp (name,login,password,age) VALUES ('Ivan','iva','qwerty',21);";
		String query = "INSERT INTO temp (name,login,password,age) VALUES ('Petro','pet','123456',22);";
		*/
		// st.execute(query);
		//
		//ResultSet rs = st.executeQuery("select * from temp;");
		ResultSet rs = st.executeQuery("select * from users;");
		int columnCount = rs.getMetaData().getColumnCount();
		// Resultset.getMetaData () get the information
		for (int i = 1; i <= columnCount; i++) {
			System.out.print(rs.getMetaData().getColumnName(i) + "\t");
		}
		System.out.println();
		// output file
		while (rs.next()) {
			for (int i = 1; i <= columnCount; i++) {
				System.out.print(rs.getString(i) + "\t");
			}
			System.out.println();
		}
		System.out.println("before close");
		if (rs != null) {
			rs.close();
		}
		if (st != null) {
			st.close();
		}
		if (con != null) {
			con.close();
		}
		System.out.println("DONE");
	}
}
