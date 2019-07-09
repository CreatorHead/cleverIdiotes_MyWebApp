package com.dev.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dev.services.UserServices;
import com.dev.services.UserServicesImpl;

@WebServlet("/loginServ")
public class LoginServ extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String uid = req.getParameter("user_id");
		String password = req.getParameter("passwd");
		System.out.println(uid);
		System.out.println(password);
		UserServices services = new UserServicesImpl();
		services.login(Integer.parseInt(uid), password);
		
	}
}
