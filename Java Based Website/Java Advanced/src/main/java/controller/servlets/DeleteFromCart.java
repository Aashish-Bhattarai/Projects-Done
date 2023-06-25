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
 * Servlet implementation class DeleteFromCart
 */
@WebServlet("/DeleteFromCart")
public class DeleteFromCart extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteFromCart() {
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
	        String name = request.getParameter("name");
	        String category = request.getParameter("category");
	        
	        String image = request.getParameter("image");
	       
	       
	        String uname = request.getParameter("username");
	        
	       
//	        PreparedStatement pstmt = null;
	        try {
	            Connection conn = DatabaseConnectivity.getDatabaseConeection();
	            String query = "Delete from cart WHERE  name = ? AND category = ?  AND image = ? AND username = ?";
	            PreparedStatement pstmt = conn.prepareStatement(query);
	            
	            pstmt.setString(1, name);
	            pstmt.setString(2, category);
	            pstmt.setString(3, image);
	            pstmt.setString(4, uname);

	            int row = pstmt.executeUpdate();

	            if (row > 0) {
	                response.sendRedirect("View/Cart.jsp");
	            } else {
	                System.out.println("Data is not deleted");
	                response.sendRedirect("View/Cart.jsp");
	            }

	        } catch (SQLException e) {
	            e.printStackTrace();
	        } 
	    }
}
