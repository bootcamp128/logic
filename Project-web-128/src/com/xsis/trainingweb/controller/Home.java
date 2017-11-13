package com.xsis.trainingweb.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xsis.trainingweb.dao.UserDao;
import com.xsis.trainingweb.entity.User;

public class Home extends HttpServlet{
	
	UserDao userDao = new UserDao();

	//1. GET
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try{
			//mendapatkan data ID dari URL
			if(req.getParameter("user_id") != null){
				int id = Integer.parseInt(req.getParameter("user_id"));
				User user = new User();
				user.setId(id);
				//delete user by id
				userDao.delete(user);
			}
			
			List<User> users = userDao.getAllUser();
			req.setAttribute("users", users);
			RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/home.jsp");
			rd.forward(req, resp);

		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//server console -> developer
		/*System.out.println("name: "+ req.getParameter("text-name") );
		System.out.println("email : "+ req.getParameter("text-email"));*/
		
		//show to browser
		/*try{
			PrintWriter out = resp.getWriter();
			out.println("name : "+ req.getParameter("text-name"));
			out.println("email : "+ req.getParameter("text-email"));
			
		}catch(Exception e){
			e.printStackTrace();
		}*/
		
		String name = req.getParameter("text-name");
		String email = req.getParameter("text-email");
		String password = req.getParameter("text-password");
		
		User user = new User();
		user.setName(name);
		user.setEmail(email);
		user.setPassword(password);
		try {
			userDao.save(user);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		resp.sendRedirect("home");
	}
	
	public String myWord(){
		return "java servlet..!";
	}
	
	public static void main(String args[]){
		System.out.println("hallo main, text : "+ new Home().myWord());
	}
}
