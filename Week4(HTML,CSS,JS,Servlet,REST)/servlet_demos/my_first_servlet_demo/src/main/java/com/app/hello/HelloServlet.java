package com.app.hello;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public HelloServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
//	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		response.setContentType("text/html");
//		PrintWriter out=response.getWriter();
//		out.print("<h1>Welcome to service() method of Servlet</h1>");
//	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.print("<h1>Welcome to doGet() method of Servlet</h1>");
		out.print("<h2>Hellloooooo "+request.getParameter("fname")+"</h2>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.print("<h1>Welcome to doPost() method of Servlet</h1>");
		out.print("<h2>Hellloooooo "+request.getParameter("fname")+"</h2>");
		out.print("<h2>Age : "+request.getParameter("age")+"</h2>");
		out.print("<h2>Gender : "+request.getParameter("gender")+"</h2>");
		out.print("<h2>Country : "+request.getParameter("country")+"</h2>");
		out.print("<h2>Hobbies : "+Arrays.toString(request.getParameterValues("hobby"))+"</h2>");
	}

}
