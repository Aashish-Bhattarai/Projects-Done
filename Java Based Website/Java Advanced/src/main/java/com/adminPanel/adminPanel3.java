package com.adminPanel;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.dao.DatabaseConnectivity;

/**
 * Servlet implementation class adminPanel3
 */
@WebServlet("/adminPanel3")
public class adminPanel3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	PrintWriter consoleOutput = new PrintWriter(System.out);
    PreparedStatement pstmt =null;
    
	
	Connection con=null;	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public adminPanel3() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String uname = request.getParameter("name");
	        String ucategory = request.getParameter("category");
	        String ubrand = request.getParameter("brand");
	        String uquantity = request.getParameter("quantity");
	        String uprice = request.getParameter("price");
	        String uimageName = request.getParameter("image");
	        String uid = request.getParameter("id");

	       
			

	            try {
           	
	    			con=DatabaseConnectivity.getDatabaseConeection();
	    			String sql = "UPDATE product SET name=?, price=?, quantity=?, category=?, brand=?, image=? WHERE p_id=?";
	                pstmt = con.prepareStatement(sql);
	                pstmt.setString(1, uname);
	                pstmt.setString(2, uprice);
	                pstmt.setString(3, uquantity);
	                pstmt.setString(4, ucategory);
	                pstmt.setString(5, ubrand);
	                pstmt.setString(6, uimageName);
	                pstmt.setString(7, uid);
	                
	                int row=pstmt.executeUpdate();
	                if(row>0)
	                {
	                	response.sendRedirect("adminpanel.jsp");
	                }else {
	                	consoleOutput.println("<B>Data is not inserted");
	                }
	               
	            }
	            
	    catch ( SQLException e) {
	    			e.printStackTrace();
	    		}
	    }
	   
}
