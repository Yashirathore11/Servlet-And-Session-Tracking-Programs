package com.yashi;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.*;
public class ServletForDemo extends HttpServlet
{   public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{
	PrintWriter out = res.getWriter();
	//ServletContext
	out.print("Hola ");
	ServletContext ctx = getServletContext();     
	String str = ctx.getInitParameter("Name");
	out.print(str);
}
	
}
