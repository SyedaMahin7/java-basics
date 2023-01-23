package com.xworkz.syeda;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup=3,urlPatterns="/m2")
public class ChocolateServlet extends HttpServlet  {
	public ChocolateServlet() {
		System.out.println(" chocolateServlet");
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println(" chocolate Servlet");
	}

}
