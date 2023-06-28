package com.cdac.sevlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisterNewServlet
 */
@WebServlet("/registernew.cdac")
public class RegisterNewServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("nm");
		String email = request.getParameter("em");
		String password = request.getParameter("pw");
		
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "root", "cdac");
			
			String sql="insert into customer(name,email,password) values(?,?,?)";
			PreparedStatement st = conn.prepareStatement(sql);
			
			st.setString(1, name);
			st.setString(2, email);
			st.setString(3, password);
			st.executeUpdate();
			
			
		}
		catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {conn.close();} catch(Exception e) {}
		}
		PrintWriter out = response.getWriter();
			out.write("<html><body>");
			out.write("<h1>Thank you for registering with us!</h1>");
			out.write("</body></html>");
	}

}
