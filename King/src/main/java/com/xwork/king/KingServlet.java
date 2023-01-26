package com.xwork.king;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup = 1,urlPatterns = "/k")
public class KingServlet extends HttpServlet {
	public KingServlet() {
		System.out.println(this.getClass().getSimpleName());
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println(" do get method is called in king class");
		String name=req.getParameter("name");
	String region=	req.getParameter("region");
	String queens=	req.getParameter("noOfQueens");
		String dob=req.getParameter("DOB");
	String dod=	req.getParameter("DOD");
		System.out.println(name);
		System.out.println(region);
		System.out.println(queens);
		System.out.println(dob);
		System.out.println(dod);
		PrintWriter writer =resp.getWriter();
		writer.print("success fully register");
		resp.setContentType("text/plain");
		
	}

}
