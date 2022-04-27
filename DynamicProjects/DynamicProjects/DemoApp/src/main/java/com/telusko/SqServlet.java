package com.telusko;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//@WebServlet("/sq")
public class SqServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		//getParameter- from the url
		//getAttribute- from another servlet
		
		//changing from string to integer
//		int k = Integer.parseInt(req.getParameter("k"));
		
//		HttpSession s = req.getSession();
//		//changing from object to integer
//		int k = (int) s.getAttribute("k");
		
		PrintWriter out = res.getWriter();
		out.println("Hello from Sq");
		
		int k = 0;
		Cookie ck[] = req.getCookies();
		for(Cookie c:ck) {
			if(c.getName().equals("k")) {
				k = Integer.parseInt(c.getValue());
				out.println("Sum is: "+k);
				
		//res.sendRedirect("myservlet");
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
			}
		}
		
		
		
		
		
	}
}
