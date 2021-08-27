package com.login.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.login.exception.BusinessException;
import com.login.model.User;
import com.login.service.UserService;
import com.login.service.impl.UserServiceImpl;

/**
 * Servlet implementation class LoginController
 */
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		User user=new User();
		user.setUsername(request.getParameter("username"));
		user.setPassword(request.getParameter("password"));
		
		UserService userService=new UserServiceImpl();
		RequestDispatcher rd=null;
		try {
			if(userService.isValidUserCredentials(user)) {
				rd=request.getRequestDispatcher("success");
				rd.forward(request, response);
			}
		} catch (BusinessException e) {
			PrintWriter out=response.getWriter();
			rd=request.getRequestDispatcher("login.html");
			rd.include(request, response);
			out.print("<span style='color:red;'>"+e.getMessage()+"</span>");
		}
	}

}
