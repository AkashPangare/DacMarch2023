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
 * Servlet implementation class FetchNewServlet
 */
@WebServlet("/fetchall.cdac")
public class FetchNewServlet extends HttpServlet {
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "root", "cdac");
			
			String sql="select id,name,email from customer";
			PreparedStatement st = conn.prepareStatement(sql);
			ResultSet rs = st.executeQuery();
			
			out.write("<html>");
			out.write("<body>");
			out.write("<table border='1'>");
			
			out.write("<tr>");
			out.write("<th>" +"Id"+ "</td>");
			out.write("<th>" +"Name"+ "</td>");
			out.write("<th>" +"Email"+ "</td>");
			out.write("<tr>");
			
			while(rs.next()) {
				int id =rs.getInt("id");
				String name = rs.getString("name");
				String email = rs.getString("email");
				System.out.println(id);
				System.out.println(name);
				System.out.println(email);
				System.out.println("---------");
				
				
				
				out.write("<tr>");
				out.write("<td>" + id + "</td>");
				out.write("<td>" + name + "</td>");
				out.write("<td>" + email + "</td>");
				out.write("<tr>");
			}
			out.write("</table></body></html>");
			
		}
		catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {conn.close();} catch(Exception e) {}
	}

}
}
