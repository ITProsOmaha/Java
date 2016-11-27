package com.itpros.banking;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {

		@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
				
			String accNo = req.getParameter ("accNo");
			String accName = req.getParameter("accName");
			
			resp.setContentType("text/html");
			PrintWriter out = resp.getWriter();
		       out.println("<html>");
		        out.println("<head>");
		        out.println("<title>My Account Number</title>");
		        out.println("</head>");
		        out.println("<body>");
		        out.println("<h3> My Acc is "+  accNo + "</h3>");
		        out.println("<h3> My Acc Name is "+  accName + "</h3>");
		        
			}


		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		}

		
		 
}

