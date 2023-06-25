package com.adminPanel;

import java.io.File; 
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import org.apache.catalina.connector.Response;

import controller.dao.DatabaseConnectivity;

@SuppressWarnings("unused")
@WebServlet("/adminPanel1")
public class adminPanel1 extends HttpServlet {
    private static final long serialVersionUID = 1L;
    PrintWriter consoleOutput = new PrintWriter(System.out);
    PreparedStatement pstmt =null;
    
	
	Connection con=null;
    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public adminPanel1() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // TODO Auto-generated method stub
        response.getWriter().append("Served at: ").append(request.getContextPath());
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String uname = request.getParameter("name");
        String ucategory = request.getParameter("category");
        String ubrand = request.getParameter("brand");
        String uquantity = request.getParameter("quantity");
        String uprice = request.getParameter("price");
        String uimageName = request.getParameter("image");

       
		

            try {

    			con=DatabaseConnectivity.getDatabaseConeection();
                String query = "INSERT INTO product (name,price,quantity,category,brand,image) VALUES ( ?,?,?,?,?,?)";
                
                pstmt = con.prepareStatement(query);
                pstmt.setString(1, uname);
                pstmt.setString(2, uprice);
                pstmt.setString(3, uquantity);
                pstmt.setString(4, ucategory);
                pstmt.setString(5, ubrand);
                pstmt.setString(6, uimageName);
                
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



 
