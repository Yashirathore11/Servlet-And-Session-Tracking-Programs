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
	    int k = 0;
		//COOKIE
	    //client again send request to SqServlet (with cookie)
		//Now we have getCookies method which accepts all the cookies from client so we have to store it in an array
		
		javax.servlet.http.Cookie cookies[]=req.getCookies();
		
		//to get particular cookie which contains value we want
		
		for(javax.servlet.http.Cookie c: cookies)
		{
            //getName of cookie which has k
			if(c.getName().equals("k")) {
				k = Integer.parseInt(c.getValue());//since getValue returns string
			}
		}
		
		k=k*k;
		
		PrintWriter out = res.getWriter();
		out.println("First Multiply 2 numbers(1st Servlet) then Square Result(2nd Servlet) ===>"+ k);
	}
}
