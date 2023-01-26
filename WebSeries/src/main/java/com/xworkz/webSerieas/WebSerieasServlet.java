package com.xworkz.webSerieas;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup = 1,urlPatterns = "/web")
public class WebSerieasServlet extends HttpServlet {
	public WebSerieasServlet() {
		System.out.println(this.getClass().getSimpleName());
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println(" do get method is called");
	String name=	req.getParameter("name");
	String episode=	req.getParameter("episode");
	String ott=	req.getParameter("ott");
	String language=	req.getParameter("language");
	String budget=req.getParameter("budget");
	System.out.println(name);
	System.out.println(episode);
	System.out.println(ott);
	System.out.println(language);
	System.out.println(budget);
	PrintWriter writer=resp.getWriter();
	writer.print("<html>");
	writer.print("<body>");
	writer.print("<h1>");
	writer.println("<span style='color:red'>");
	writer.print(" sucess fully register");
	writer.print("</h1>");
	writer.print("</body>");
	resp.setContentType("text/html");
	
	
	}

}
