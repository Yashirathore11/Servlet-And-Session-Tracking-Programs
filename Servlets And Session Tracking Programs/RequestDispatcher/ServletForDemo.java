package com.yashi;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.*;
public class ServletForDemo extends HttpServlet
{
	//Add Servlet
   public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException
   {
	int i = Integer.parseInt(req.getParameter("num1"));
	int j = Integer.parseInt(req.getParameter("num2"));
   
	int k = i * j;
	
	//passing and naming value k
	req.setAttribute("k", k);
	
	//To call servlet we have 2 options Req Dis and redirect
	//dispatching req to sq
	RequestDispatcher rd = req.getRequestDispatcher("sq");
	rd.forward(req, res);
   }
}
