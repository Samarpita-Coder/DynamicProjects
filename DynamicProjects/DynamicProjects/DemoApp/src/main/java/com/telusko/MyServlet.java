package com.telusko;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("myservlet")
public class MyServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		PrintWriter out = res.getWriter();
		out.print("Hi ");
		
		ServletContext ctx = getServletContext();
		String str = ctx.getInitParameter("name");
		out.print(str);
		
		out.print("Hi ");
		ServletConfig cg = getServletConfig();
		String str2 = cg.getInitParameter("name");
		out.print(str2);
	}
	
}
