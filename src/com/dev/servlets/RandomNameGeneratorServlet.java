package com.dev.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dev.services.UserServices;
import com.dev.services.UserServicesImpl;

public class RandomNameGeneratorServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		UserServices services = new UserServicesImpl();
		try {
			out.println("<h1>The Random Name is: " + services.getRandomName() + "</h1>");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
