package com.dev.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.jws.soap.InitParam;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.SingleThreadModel;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet( urlPatterns = "/serv3",
		initParams = @WebInitParam(name="msg",value="The more you learn, the more you earn"))
public class Serv3 extends HttpServlet {
	
	@Override
	protected  void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		out.println("Hello World");
		ServletContext ctx = getServletContext();
		String email = ctx.getInitParameter("email");
		out.println(email);
		
		ServletConfig config = getServletConfig();
		String msg = config.getInitParameter("msg");
		out.println(msg);

	}
	
}
