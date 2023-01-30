import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup = 1,urlPatterns = "/p")
public class FavPersonServlet extends HttpServlet {
	public FavPersonServlet() {
		System.out.println(" fav person  constructor is called");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println(" do post method is running");
		String firstName=req.getParameter("firstName");
		String lastName=req.getParameter("lastName");
		String gender=req.getParameter("gender ");
		String reason=req.getParameter("reason");
		String address=req.getParameter("address");
	
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(gender);
		System.out.println(reason);
		System.out.println(address);
		//PrintWriter w=resp.getWriter();
		//w.print("successfully register");
		RequestDispatcher dis= req.getRequestDispatcher("display.jsp");
		// send data to jsp
		req.setAttribute("firstName",firstName);
		req.setAttribute("lastName", lastName);
		req.setAttribute("gender",gender);
		req.setAttribute("reason", reason);
		req.setAttribute("address",address);
		dis.forward(req, resp);
		
		
		
		
	}
}
