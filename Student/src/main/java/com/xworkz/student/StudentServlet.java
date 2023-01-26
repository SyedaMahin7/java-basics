package com.xworkz.student;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup = 1,urlPatterns = "/a")
public class StudentServlet  extends HttpServlet{
	public StudentServlet() {
		System.out.println(this.getClass().getSimpleName());
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println(" do gert method is called in student class");
		String motherName=req.getParameter("motherName");
		String fatherName=req.getParameter("fatherName");
		String schoolName=req.getParameter("schoolName");
		String collegeName=req.getParameter("collegeName");
		String branchName=req.getParameter("branchName");
		String univercityName=req.getParameter("univercityName");
		String address=req.getParameter("address");
		String yearOfPassing=req.getParameter("yearOfPassing");
	
		String sem1=req.getParameter("1sem marks");
		String sem2=req.getParameter("2sem marks");
	
		String sem3=req.getParameter("3sem marks");
		String sem4=req.getParameter("4sem marks");
	
		String sem5=req.getParameter("5sem marks");
		String sem6=req.getParameter("6sem marks");
		String sem7=req.getParameter("7sem marks");
		String sem8=req.getParameter("8sem marks");
		String CGPA=req.getParameter("CGPAcgpa");
		String SGPA=req.getParameter("SGPA");
		System.out.println(motherName);
		System.out.println(fatherName);
		System.out.println(schoolName);
		System.out.println(collegeName);
		System.out.println(branchName);
		System.out.println(univercityName);
		System.out.println(address);
		System.out.println(yearOfPassing);
		System.out.println(sem1);
		System.out.println(sem2);
		System.out.println(sem3);
		System.out.println(sem4);
		System.out.println(sem5);
		System.out.println(sem6);
		System.out.println(sem7);
		System.out.println(sem8);
		System.out.println(CGPA);
		System.out.println(SGPA);
		 PrintWriter writer=resp.getWriter();
		 writer.print("sucseesfullu register");
		 resp.setContentType("text/plain");
	
		
	}

}
