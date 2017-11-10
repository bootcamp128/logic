package com.xsis.traningweb.dbutils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class DbConnection {
	
	//connection
	public static Connection getMySqlConnection(){
		Connection connect = null;
		String dbName = "bootcamp128";
		String dbPassword = "";
		String dbUsername = "root";
		String dbUrl = "jdbc:mysql://localhost:3306/"+dbName;
		
		try{
			Class.forName("com.mysql.jdbc.Driver");  
			connect = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return connect;
	}
	
	//execute sql
	public static PreparedStatement sqlExecute(Connection connect, String sql){
		PreparedStatement ps = null;
		try{
			ps = connect.prepareStatement(sql);
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return ps;
	}

}
