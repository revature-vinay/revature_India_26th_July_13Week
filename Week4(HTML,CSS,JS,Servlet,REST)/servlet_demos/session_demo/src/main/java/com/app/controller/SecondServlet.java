package com.app.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.app.model.User;

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
		
		HttpSession session=request.getSession(false); //this false attriibute will not create a new session it will infact look for exisiting session, if there is no exisiting session it will return null
		
		if(session==null) {
			response.setContentType("text/html");
			PrintWriter pw=response.getWriter();
			pw.print("<center><h2>Please visit our first page</h2></center>");
		}else {
			User user=(User) session.getAttribute("vinay");
			user.setGradutation(request.getParameter("graduation"));
			user.setYop(Integer.parseInt(request.getParameter("yop")));
			user.setUniversity(request.getParameter("university"));
			
			session.setAttribute("vinay", user);//setAttribute(key,value)
			response.sendRedirect("three.html");
		}
		
		
		
		
	}

}
