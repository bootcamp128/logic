package com.xsis.trainingweb.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xsis.trainingweb.dao.UserDao;
import com.xsis.trainingweb.entity.User;

@WebServlet("/userupdate")
public class UserUpdate extends HttpServlet {

	UserDao userDao = new UserDao();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int id = Integer.parseInt(req.getParameter("upid"));
		User user = null;
		try {
			user = userDao.getUserById(id);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		RequestDispatcher rd = req.getRequestDispatcher
						("/WEB-INF/userdetailupdate.jsp");
		req.setAttribute("user", user);
		rd.forward(req, resp);
		//jsp nya 
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id = req.getParameter("user-id");
		String name = req.getParameter("text-name");
		String email = req.getParameter("text-email");
		String password = req.getParameter("text-password");
		
		User user = new User();
		user.setId(Integer.parseInt(id));
		user.setName(name);
		user.setEmail(email);
		user.setPassword(password);
		userDao.update(user);
		
		resp.sendRedirect("home");
	}
}
