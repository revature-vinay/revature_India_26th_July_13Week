package com.app.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SummaryServlet
 */
public class SummaryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SummaryServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		out.print("<table border='1px'>");
		
		Cookie cookies[]=request.getCookies();
		for(Cookie cookie:cookies) {
			out.print("<tr>");
			out.print("<th>"+cookie.getName()+"</th>");
			out.print("<td>"+cookie.getValue()+"</td>");
			out.print("</tr>");
		}
		out.print("<tr>");
		out.print("<th>Certification</th>");
		out.print("<td>"+request.getParameter("certification")+"</td>");
		out.print("</tr>");
		out.print("<tr>");
		out.print("<th>Provider</th>");
		out.print("<td>"+request.getParameter("provider")+"</td>");
		out.print("</tr>");
		out.print("<tr>");
		out.print("<th>Validity</th>");
		out.print("<td>"+request.getParameter("validity")+"</td>");
		out.print("</tr>");
		out.print("<tr>");
		out.print("<th>Version Number</th>");
		out.print("<td>"+request.getParameter("version")+"</td>");
		out.print("</tr>");
		out.print("</table>");
	}

}
