package com.xworkz.Travel;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1,urlPatterns ="/e")
public class TravelServlet extends HttpServlet {
	public TravelServlet() {
		System.out.println("ctrated"+this.getClass().getSimpleName());
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println(" do get method is called ..");
		PrintWriter w =resp.getWriter();
		w.print(" successfully rgister");
		resp.setContentType("text/plain");
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println(" do post method is called");
	}
	
}
