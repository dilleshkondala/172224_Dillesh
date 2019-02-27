package com.cpgm.servletservices;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cpgm.dao_services.UserDAO;
import com.cpgm.dao_services.ValidateUserDAO;
import com.cpgm.userpojoservices.User;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet(description = "This is Login Servlet", urlPatterns = { "/UserRegisterServlet" })
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public UserServlet() {
        super();
       
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		String firstName = request.getParameter("firstname");
		String lastName	 = request.getParameter("lastname");
		String email 	 = request.getParameter("email");
		String mobileNumber= request.getParameter("mobilenum");
		String password  = request.getParameter("password");
		
		UserDAO userdao = new UserDAO();
		ValidateUserDAO validateUser = new ValidateUserDAO();
		try{
			User user = new User(firstName,lastName,email,mobileNumber,password);
			userdao.insert(user);
			validateUser.validate(user.getUserMobile(),user.getPassword());
		}
		catch(Exception e)
		{
			 e.printStackTrace();
		}
		
		response.sendRedirect("successRegister.html");
		
	}
		
}