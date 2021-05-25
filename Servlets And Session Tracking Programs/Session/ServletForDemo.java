package com.yashi;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.*;
public class ServletForDemo extends HttpServlet
{
	//MULTIPLY SERVLET
   public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException
   {
	int i = Integer.parseInt(req.getParameter("num1"));
	int j = Integer.parseInt(req.getParameter("num2"));
   
	int k = i * j;	
	
	//SESSION
	//session object created
	HttpSession session = req.getSession();
	session.setAttribute("k", k);
	
	res.sendRedirect("sq");
   }
}
