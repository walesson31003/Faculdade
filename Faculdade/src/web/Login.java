package web;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


	@WebServlet("/login")
	public class Login extends HttpServlet {
		private static final long serialVersionUID = 1L;
		

	
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			response.setContentType("text/html");
			PrintWriter out=response.getWriter();
			
			String name = request.getParameter("username");
			String pass = request.getParameter("password");
			
			if( pass.equals("admin") && name.equals("admin")) {
				RequestDispatcher rd=request.getRequestDispatcher("Index.html");
				rd.forward(request, response);
				//or response.sendRedirect("Index.html");
			
			}else {
				
				response.getWriter().println("Desculpe, senha ou nome incorreto!");
				
				RequestDispatcher rd=request.getRequestDispatcher("Indexx.jsp");
				rd.include(request, response);
			}
			
			
		}

	}