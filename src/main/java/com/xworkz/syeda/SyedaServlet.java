package com.xworkz.syeda;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup=1,urlPatterns="/mywish")
public class SyedaServlet extends HttpServlet {
	public SyedaServlet() {
		System.out.println(" object is created");
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println(" do get methods");
	}

}
