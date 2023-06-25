package controller.servlets;

import java.io.IOException;
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
 * Servlet implementation class UpdateProfile
 */
@WebServlet("/UpdateProfile")
public class UpdateProfile extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateProfile() {
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
	        String contact = request.getParameter("contact");
	        String username = request.getParameter("username");
	        PreparedStatement pstmt =null;
	    	Connection con=null;
	       
			

	            try {
	    			con=DatabaseConnectivity.getDatabaseConeection();
	                String query = "UPDATE register SET name=?, contact_number=? WHERE username=?";
	                
	                pstmt = con.prepareStatement(query);
	                pstmt.setString(1, uname);
	                pstmt.setString(2, contact);
	                pstmt.setString(3, username);
	                
	                
	                int row=pstmt.executeUpdate();
	                if(row>0)
	                {
	                	response.sendRedirect("UserProfile.jsp");
	                }else {
	                	System.out.println("Data is not inserted");
	                }
	               
	            }
	            
	    catch ( SQLException e) {
	    			e.printStackTrace();
	    		}
	    }
	   
	      
	    
	    
	}

