package com.cdac.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DeleteServlet
 */
@WebServlet("/delete.cdac")
public class DeleteServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("custid"));
		PrintWriter out = response.getWriter();
			Connection conn = null;
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "root", "cdac"); //url, username & password
				String sql = "delete from customer where id =?";
				PreparedStatement st = conn.prepareStatement(sql);
				st.setInt(1, id);
				st.executeUpdate();
				
				//ResultSet rs = st.executeQuery(); //output of the select query will be stored in resultset object
				
				
			}
			catch(ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
			finally {
				try { conn.close(); } catch(Exception e) { }
			}
			
			out.write("<html><body>");
			out.write("<h1>Selected item deleted</h1>");
			out.write("</body></html>");
	}
}
