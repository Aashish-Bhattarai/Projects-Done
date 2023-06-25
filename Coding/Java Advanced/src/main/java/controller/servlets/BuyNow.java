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
 * Servlet implementation class BuyNow
 */
@WebServlet("/BuyNow")
public class BuyNow extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BuyNow() {
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
	        String brand = request.getParameter("brand");
	        String image = request.getParameter("image");
	        double price = Double.parseDouble(request.getParameter("price"));
	        int p_id = Integer.parseInt(request.getParameter("id"));
	        String uname = request.getParameter("username");
	        
	        Connection conn = null;
	        PreparedStatement pstmt = null;
	        try {
	            conn = DatabaseConnectivity.getDatabaseConeection();
	            String query = "INSERT INTO orders (p_id, name, category, brand, price, image,username) VALUES (?, ?, ?, ?, ?, ?,?)";
	            pstmt = conn.prepareStatement(query);
	            pstmt.setInt(1, p_id);
	            pstmt.setString(2, name);
	            pstmt.setString(3, category);
	            pstmt.setString(4, brand);
	            pstmt.setDouble(5, price); 
	            pstmt.setString(6, image);
	            pstmt.setString(7, uname);

	            int row = pstmt.executeUpdate();

	            if (row > 0) {
	                response.sendRedirect("View/Cart.jsp");
	            } else {
	                System.out.println("Data is not inserted");
	            }

	        } catch (SQLException e) {
	            e.printStackTrace();
	        } 
	    }
}
