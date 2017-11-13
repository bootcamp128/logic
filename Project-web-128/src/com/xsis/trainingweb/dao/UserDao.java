package com.xsis.trainingweb.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.xsis.trainingweb.entity.User;
import com.xsis.traningweb.dbutils.DbConnection;

public class UserDao {

	Connection connect = DbConnection.getMySqlConnection();
	
	//save
	public void save(User user) throws SQLException{
	
		String sql = "insert into user (name, email, password) values (?, ?, ?)";
		
		PreparedStatement ps = DbConnection.sqlExecute(connect, sql); 
		ps.setString(1, user.getName());
		ps.setString(3, user.getPassword());
		ps.setString(2, user.getEmail());
	
		ps.executeUpdate();
	}
	
	//select
	public List<User> getAllUser() throws SQLException{
		List<User> users = new ArrayList<>();
		String sql = "select * from user";
		PreparedStatement ps = DbConnection.sqlExecute(connect, sql);
		
		//ResultSet Object hasil query sql di java 
		ResultSet rs = ps.executeQuery();
		while(rs.next()){
			User user = new User();
			user.setId(rs.getInt("id"));
			user.setEmail(rs.getString("email"));
			user.setPassword(rs.getString("password"));
			user.setName(rs.getString("name"));
			
			users.add(user);
		}
		
		return users;
	}

	public void delete(User user) {
		// TODO Auto-generated method stub
		String sql = "delete from user where id = ?";
		PreparedStatement ps = DbConnection.sqlExecute(connect, sql);
		try {
			ps.setInt(1, user.getId());
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public User getUserById(int id) throws SQLException {
		// TODO Auto-generated method stub
		List<User> users = new ArrayList<>();
		String sql = "select * from user where id = ?";
		PreparedStatement ps = DbConnection.sqlExecute(connect, sql);
		ps.setInt(1, id);
		//ResultSet Object hasil query sql di java 
		ResultSet rs = ps.executeQuery();
		while(rs.next()){
			User user = new User();
			user.setId(rs.getInt("id"));
			user.setEmail(rs.getString("email"));
			user.setPassword(rs.getString("password"));
			user.setName(rs.getString("name"));
			
			users.add(user);
		}
		return users.get(0);
	}

	public void update(User user) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				String sql = "update user set "
						+ "name = ?, "
						+ "email = ?, "
						+ "password= ? "
						+ "where id = ?";
				
				PreparedStatement ps = DbConnection.sqlExecute(connect, sql);
				try {
					ps.setString(1, user.getName());
					ps.setString(2, user.getEmail());
					ps.setString(3, user.getPassword());
					ps.setInt(4, user.getId());
					
					ps.executeUpdate();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	}
}
