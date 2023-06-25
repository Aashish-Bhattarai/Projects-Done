package controller.servlets;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import controller.dbconnection.DbConnection;
import model.Customer;
import model.product_detail;
import resources.MyConstants;

/**
 * Servlet implementation class productRegister
 */
@WebServlet("/productRegister")
@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 2, // 2MB
maxFileSize = 1024 * 1024 * 10, // 10MB
maxRequestSize = 1024 * 1024 * 50)
public class productRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public productRegister() {
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
		String product_name = request.getParameter("pname");
		String cost = request.getParameter("cost");
		String brand = request.getParameter("brand");
		String description = request.getParameter("description");
		String  product_category = request.getParameter("category");
		String  cloth = request.getParameter("clothing");
		String  quantity = request.getParameter("quantity");
		Part imagePart = request.getPart("image1");	
		
		
		String savePath = request.getServletContext().getRealPath("/")+"uploads/product/";
	    String fileName = product_name+"_"+imagePart.getSubmittedFileName();
	    product_detail product = new product_detail(product_name, cost, brand, description, product_category, cloth, quantity, imagePart);
	    if(!fileName.isEmpty() && fileName != null) {
	    	Files.copy(imagePart.getInputStream(), Paths.get(savePath + fileName), StandardCopyOption.REPLACE_EXISTING);
	    }
		
		DbConnection con = new DbConnection();
		int result = con.insertProduct(MyConstants.INSERT_PRODUCT, product);
		if(result == 1) {
			request.setAttribute("registerMessage", "Successfully Registered");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}else if(result == -1) {
			request.setAttribute("registerMessage", "User Already Exists");
			request.getRequestDispatcher("/pages/view.jsp").forward(request, response);
		}else {
			request.getRequestDispatcher("/pages/view.jsp").forward(request, response);
		}
	}

}
