package com.cpgm.servletservices;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cpgm.dao_services.UserDAO;
import com.cpgm.userpojoservices.User;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet(description = "This is the Login Servlet", urlPatterns = { "/LoginServlet" })
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private boolean status = false;
       
  
    public LoginServlet() {
        super();
      
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out =  response.getWriter();
		String mobileNumber= request.getParameter("mobilenum");
		String password  = request.getParameter("password");
		User user1 = new User(mobileNumber,password);
				
		UserDAO userdao = new UserDAO();
		try {
			System.out.println(user1.getUserMobile());
			status = userdao.validate(user1.getUserMobile(),user1.getPassword());
			if(status = true)
				response.sendRedirect("successLogin.html");
			else
				out.print("Login failed....\nTry Again..");
		} 
		catch (ClassNotFoundException | SQLException e) {
		
			e.printStackTrace();
		}
		
	}
	
}
