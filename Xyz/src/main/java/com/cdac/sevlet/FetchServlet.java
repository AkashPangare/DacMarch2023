package com.cdac.sevlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InfoS
 */
@WebServlet("/fetchnew.cdac")
public class FetchServlet extends HttpServlet {
	
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	int id = Integer.parseInt(request.getParameter("custid"));
	PrintWriter out = response.getWriter();
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "root", "cdac"); //url, username & password
			String sql = "select name,email from customer where id=?";
			PreparedStatement st = conn.prepareStatement(sql);
			st.setInt(1, id);
			
			ResultSet rs = st.executeQuery(); //output of the select query will be stored in resultset object
			
			out.write("<html>");
			out.write("<body>");
			out.write("<table border='1'>");
			
			out.write("<tr>");
			out.write("<th>" +"Id"+ "</td>");
			out.write("<th>" +"Name"+ "</td>");
			out.write("<th>" +"Email"+ "</td>");
			out.write("<tr>");
			
			if(rs.next()) {
				String name = rs.getString("name");
				String email = rs.getString("email");
				System.out.println(name);
				System.out.println(email);
				//TODO: Instead of displaying on the console, display it using HTML
				out.write("<tr>");
				out.write("<td>" + id + "</td>");
				out.write("<td>" + name + "</td>");
				out.write("<td>" + email + "</td>");
				out.write("<tr>");
			}
			else {
				System.out.println("no record found!");
			}
			out.write("</table></body></html>");
		}
		catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		finally {
			try { conn.close(); } catch(Exception e) { }
		}

		
	}

}
