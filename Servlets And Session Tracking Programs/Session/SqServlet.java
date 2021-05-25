package com.yashi;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.tomcat.util.http.parser.Cookie;

public class SqServlet extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException{
		
		//SESSION
		HttpSession session = req.getSession();
        int k = (int) session.getAttribute("k");

		k=k*k;
		
		PrintWriter out = res.getWriter();
		out.println("First Multiply 2 numbers(1st Servlet) then Square Result(2nd Servlet) ===>"+ k);
	}
}
