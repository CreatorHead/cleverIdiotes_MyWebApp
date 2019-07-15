package com.dev.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dev.beans.Dog;
import com.dev.beans.User;
import com.dev.services.UserServices;
import com.dev.services.UserServicesImpl;

@WebServlet("/attrServ1")
public class AttrServ1 extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		UserServices services = new UserServicesImpl();
		User user = services.login(1, "root");
		RequestDispatcher dispatcher = req.getRequestDispatcher("/UserPage.jsp");
		Dog dog = new Dog();
		dog.setName("Pinky");
		dog.setBreed("GS");
		dog.setColor("Black");
		user.setDog(dog);
		req.setAttribute("user", user);
		dispatcher.forward(req, resp);
	}
}












