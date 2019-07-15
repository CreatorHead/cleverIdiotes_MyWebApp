package com.dev.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dev.beans.User;
import com.dev.services.UserServices;
import com.dev.services.UserServicesImpl;

@WebServlet("/attrServ2")
public class AttrServ2 extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		User user = (User) req.getAttribute("user");
		PrintWriter out = resp.getWriter();
		out.println(user.getFirstName());
		out.println(user.getLastName());
	}
}












