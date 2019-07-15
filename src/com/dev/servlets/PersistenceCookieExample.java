package com.dev.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/persistedCookie")
public class PersistenceCookieExample extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Cookie c = new Cookie("msg","Sunday_is_like_Monday");
		c.setMaxAge(24*7*60*60);
		resp.addCookie(c);
		resp.getWriter().println("Cookies are sent and they are persistence");

	}
}
