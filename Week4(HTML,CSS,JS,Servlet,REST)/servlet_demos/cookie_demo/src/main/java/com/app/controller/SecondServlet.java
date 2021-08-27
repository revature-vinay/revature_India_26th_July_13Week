package com.app.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SecondServlet
 */
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SecondServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Cookie c1=new Cookie("Graduation", request.getParameter("graduation"));
		Cookie c2=new Cookie("YearOfPassing", request.getParameter("yop"));
		Cookie c3=new Cookie("University", request.getParameter("university"));
		
		
		
		response.addCookie(c1);
		response.addCookie(c2);
		response.addCookie(c3);
		
		response.sendRedirect("three.html");
	}

}
