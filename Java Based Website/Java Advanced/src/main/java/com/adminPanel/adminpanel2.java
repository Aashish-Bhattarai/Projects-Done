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
 * Servlet implementation class adminpanel2
 */
@WebServlet("/adminpanel2")
public class adminpanel2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	PrintWriter consoleOutput = new PrintWriter(System.out);
    PreparedStatement pstmt =null;
    
	
	Connection con=null;
    
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public adminpanel2() {
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
		String id = request.getParameter("prod_id");
		 try {
//         	
 			con=DatabaseConnectivity.getDatabaseConeection();
             String query ="DELETE FROM product WHERE p_id = ?";
             
             pstmt = con.prepareStatement(query);
             pstmt.setString(1, id);
             
             
             int row=pstmt.executeUpdate();
             if(row>0)
             {
             	response.sendRedirect("adminpanel.jsp");
             }else {
             	consoleOutput.println("<B>Check id again");
             }
            
         }
         
 catch ( SQLException e) {
 			e.printStackTrace();
 		}
 }

	}


