<%@page import="controller.statemanagement.SessionManage"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="controller.dao.DatabaseConnectivity"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%! SessionManage mySession = new SessionManage(); %>
<%
//setting absolute path
String mainPath = request.getContextPath();
// invoking session username
String user = (String) session.getAttribute("user");

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
	.product-container {
  margin-left:3cm;
  flex-direction: column;
  align-items: center;
  justify-content: center;
  padding: 20px;
  border: 1px solid #ccc;
  border-radius: 5px;
  width:75%;
  margin-top:1cm;
}

#img {
  width: 5cm;
  height: 5cm;
  object-fit: contain;
}

.product-details {
  text-align: center;
}

.product-name {
  font-size: 24px;
  font-weight: bold;
  margin-bottom: 10px;
}

.product-category,
.product-brand {
  font-size: 16px;
  font-weight: bold;
  margin-bottom: 10px;
}

.product-price {
  font-size: 20px;
  font-weight: bold;
}
.add-to-cart {
		
  background-color: #007bff;
  border: none;
  color: #fff;
  padding: 12px 24px;
  font-size: 16px;
  border-radius: 5px;
  cursor: pointer;
  
 
  
}

.add-to-cart:hover {
  background-color: #0069d9;
}
</style>
<body>

<button class="add-to-cart" style="margin-top:15px;"><a href="product.jsp">  Back </a></button>
<button class="add-to-cart" style="margin-top:15px;"><a href="View_order.jsp">  View Order </a></button>


<div id='View' >
<%
	Connection con = DatabaseConnectivity.getDatabaseConeection();
	PreparedStatement st = con.prepareStatement("SELECT p_id,brand, name, price, category, image FROM cart where username=?");
	st.setString(1, user);
	ResultSet result = st.executeQuery();
	

	String imagePath =  "../uploads/productImage/";
	
%>
	
	
	<%
	while (result.next()) {
		String name = result.getString("name");
		String price = result.getString("price");
		String category = result.getString("category");
		String brand = result.getString("brand");
		String imageName = result.getString("image");
		String id = result.getString("p_id");
		%>
		
		
	
	
<div class="product-container">
<div style="display:flex;">
<div style="margin-left:1cm; float:left;">
<img src="<%= imagePath + imageName %>"alt="Product Image" id='img'>
</div>
<div style="margin-left:5cm;">
<h2 class="product-name">Product Name: <%= name %></h2>
<p class="product-category">Category: <%= category %> </p>
<p class="product-brand"> Brand: <%= brand %></p>
<p class="product-price"> Price: <%= price %></p>


<form method="post" action="../BuyNow">
<input type="hidden" name="name" value="<%= name %>">
<input type="hidden" name="category" value="<%= category %>">
<input type="hidden" name="brand" value="<%= brand %>">
<input type="hidden" name="price" value="<%= price %>">
<input type="hidden" name="id" value="<%= id %>">
<input type="hidden" name="image" value="<%= imageName %>">
 
 <input type="hidden" name="username" value="<%= user %>">
 <button type="submit" class="add-to-cart">Buy Now</button>
</form>

<form method="post" action="../DeleteFromCart">
<input type="hidden" name="name" value="<%= name %>">
<input type="hidden" name="category" value="<%= category %>">
<input type="hidden" name="brand" value="<%= brand %>">
<input type="hidden" name="price" value="<%= price %>">
<input type="hidden" name="id" value="<%= id %>">
<input type="hidden" name="username" value="<%= user %>">
 <input type="hidden" name="image" value="<%= imageName %>">
<button type="submit" class="add-to-cart" style="margin-top:15px;">Delete From <br> Cart</button>
</form>
</div>


</div>
</div>

<% 	}
	%>

</div>
</body>
</html>