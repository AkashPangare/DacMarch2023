package com.cdac.servlet;

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
 * Servlet implementation class UpdateServlet
 */
@WebServlet("/update.cdac")
public class UpdateServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//reading data sent by the client
		String name = request.getParameter("nm");
		String email = request.getParameter("em");
		String password = request.getParameter("pw");
		String id = request.getParameter("num");

		
		//jdbc code to store the data in the db
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); //loading the jdbc driver (type 4)
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "root", "cdac"); //url, username & password
			String sql="update customer set name=? , email=? , password=? where id=? ";
			PreparedStatement st=conn.prepareStatement(sql);
			st.setString(1, name);
			st.setString(2,email);
			st.setString(3,password);
			st.setString(4,id);
			st.executeUpdate(); //DML


		}
		catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		finally {
			try { conn.close(); } catch(Exception e) { }
		}
		
		PrintWriter out = response.getWriter();
		out.write("<html><body>");
		out.write("<h1>Update successfull</h1>");
		out.write("</body></html>");
	}

}
		

