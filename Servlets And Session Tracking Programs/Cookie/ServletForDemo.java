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
	//COOKIE 
	//1 Client sends request to Server
	//2 Server sends response+cookies
	//3 Client sends request+cookies
	
	//Example by two servlets
	//res object coming from (ServletForDemo) will have cookie
	//send request to (SqServlet) you can use same cookie
	
	// Cookie class
	Cookie cookie= new Cookie("k", k+ ""); //Cookie(string,string)
	//adding cookie in the response send to the client from (ServletForDemo)
	res.addCookie(cookie);
	
	res.sendRedirect("sq");
   }
}
