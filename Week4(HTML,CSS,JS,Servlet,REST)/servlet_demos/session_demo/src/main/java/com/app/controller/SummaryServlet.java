package com.app.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.app.model.User;

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
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		HttpSession session = request.getSession(false); // this false attriibute will not create a new session it will
															// infact look for exisiting session, if there is no
															// exisiting session it will return null

		if (session == null) {
			out.print("<center><h2>Please visit our first page</h2></center>");
		} else {
			User user = (User) session.getAttribute("vinay");
			user.setCertification(request.getParameter("certification"));
			user.setProvider(request.getParameter("provider"));
			user.setValidity(Integer.parseInt(request.getParameter("validity")));
			user.setVersion(Integer.parseInt(request.getParameter("version")));

			session.setAttribute("vinay", user);// setAttribute(key,value)
			
			out.print("<h1>Hello .... "+user.getFname()+"Your details are below </h1>");
			out.print("<h3>"+user+"</h3>");
			out.print("<h3>Session was created at "+new Date(session.getCreationTime())+"</h3>");
			out.print("<h3>session id : "+session.getId()+"</h3>");
			//session.setMaxInactiveInterval(interval);
			session.invalidate(); //destroys the session
		}

		
	}

}
