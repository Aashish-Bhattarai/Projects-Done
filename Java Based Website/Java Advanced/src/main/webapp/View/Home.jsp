<%@ page import="java.io.*" %>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="controller.dao.DatabaseConnectivity"%>
<%@page import="java.sql.Connection"%>
<%@page import="controller.statemanagement.SessionManage"%>
<%@page import="controller.dbconnection.DbConnection"%>
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
nav {
  display: flex;
  justify-content: space-between;
  align-items: center;
  background-color: #f5f5f5;
  padding: 10px;
}

nav ul {
  display: flex;
  list-style: none;
  margin: 0;
  padding: 0;
}

nav ul li {
  margin-right: 20px;
}

nav ul li:last-child {
  margin-right: 0;
}

.search-form {
  display: flex;
  align-items: center;
}

.search-form input[type="text"] {
  border: none;
  padding: 5px;
  font-size: 16px;
}

.search-form button[type="submit"] {
  background-color: #007bff;
  color: #fff;
  border: none;
  padding: 5px 10px;
  font-size: 16px;
  cursor: pointer;
}

.login-signup {
  display: flex;
  list-style: none;
  margin: 0;
  padding: 0;
}

.login-signup li {
  margin-left: 20px;
}

.login-signup li:first-child {
  margin-left: 0;
}
nav {
  background-color: #333;
  overflow: hidden;
}

nav ul {
  list-style-type: none;
  margin: 0;
  padding: 0;
}
nav li a {
  display: block;
  color: white;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
}

nav li a:hover {
  background-color: #111;
}
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


.product-brand {
  font-size: 20px;
  margin-bottom: 5px;
  font-weight: bold;
  margin-bottom: 10px;
}

.product-price {
  font-size: 20px;
  font-weight: bold;
}
* {
	margin: 0;
	padding: 0;
	box-sizing: border-box;
}

body {
	font-family: Arial, sans-serif;
}



.service {
  display: grid;
  grid-template-columns: 1fr 2fr;
  grid-gap: 1rem;
  align-items: center;
  margin-top:1cm;
}

.service img {
  max-width: 100%;
  height: auto;
}

.service-description h3 {
  margin-top: 0;
}

.service-description p {
  margin-bottom: 0;
}

</style>
<body>
<nav>
  <ul>
    <li><a href="Home.jsp">Home</a></li>
    <li><a href="product.jsp">Products</a></li>
    <li><a href="AboutUs.jsp">About Us</a></li>
  </ul>
  
  <form class="search-form"  method="get">
    <input type="text" name="search" id="search" placeholder="Search...">
    <button type="submit">Search</button>
  </form>
  
  <ul class="login-signup">
    <li><a href="../login.jsp">Login/Signup</a></li>
    
  </ul>
</nav>
<h2 style="text-align: center; border-bottom: 1px solid #000; line-height: 0.1em; margin: 10px 0 20px; margin-top:1cm;">
  <span style="background:#fff; padding:0 10px;">Our Services</span>
</h2>


<div id="showProd">

<%
 
	String search = request.getParameter("search");
	Connection con = DatabaseConnectivity.getDatabaseConeection();
	PreparedStatement st = con.prepareStatement("SELECT name, price, brand, image FROM product where category=?");
    st.setString(1, search);
	ResultSet result = st.executeQuery();
	
	String imagePath =  "../uploads/productImage/";
	%>

		<%
		while (result.next()) {
			String name = result.getString("name");
			String price = result.getString("price");
			String brand = result.getString("brand");
			String imageName = result.getString("image");
			
		%>
			
			
		
		
	<div class="product-container">
	<div style="display:flex;">
	<div style="margin-left:1cm; float:left;">
  <img src="<%= imagePath + imageName %>"alt="Product Image" id='img'>
  </div>
  <div style="margin-left:5cm; margin-top:1cm;">
    <h2 class="product-name">Product Name: <%= name %></h2>
    <p class="product-brand" > Brand: <%= brand %></p>
    <p class="product-price"> Price: <%= price %></p>
    
    </div>
    
    
    </div>
  </div>

	<% 	}
		%>
	</div>
	
	<div class="services">
  <div class="service">
    <img src="../uploads/bannerimages/banner1.jpg" alt="Service 1">
    <div class="service-description">
      <h3 style="margin-left:9cm; margin-bottom:1cm;">Weekly Deals</h3>
      <p>Welcome to our weekly deals section! Every week, we bring you the best deals on our website so that you can shop for 
      your favorite products at discounted prices. From clothing to accessories, electronics to home appliances, we have something
       for everyone. Our team of experts handpick the best products and negotiate with the sellers to offer you the best prices. 
       We also ensure that all the products are of high quality and meet our strict standards. Don't miss out on the opportunity 
		 to save big and grab the latest products at unbeatable prices. Check out our weekly deals section regularly and 
		 stay updated with the latest discounts and offers. Happy shopping!</p>
    </div>
  </div>
  <div class="service">
    <img src="../uploads/bannerimages/banner2.jpg" alt="Service 2">
    <div class="service-description">
      <h3 style="margin-left:9cm; margin-bottom:1cm;"> Awesome Cart</h3>
      <p>
Our cart facility allows customers to easily select and store items they wish to purchase 
while browsing our online store. Once a customer adds an item to their cart, it is saved for 
them until they decide to checkout or remove it. Customers can view their cart at any time to 
see a summary of the items they have added, including the quantity and total cost. Additionally,
 customers can make changes to their cart, such as updating the quantity of an item or removing 
 it altogether. Once the customer is ready to checkout, they can proceed to the payment page to 
 complete their purchase. Our cart facility is designed to provide customers with a convenient 
 and efficient shopping experience, ensuring that they can easily manage their selections and make
  purchases with confidence.</p>
    </div>
  </div>
  <div class="service">
    <img src="../uploads/bannerimages/banner3.png" alt="Service 3">
    <div class="service-description">
      <h3 style="margin-left:9cm; margin-bottom:1cm;"> Data Security</h3>
      <p>At our ecommerce website, we take the security and privacy of our customers' data very seriously.
       We understand that you trust us with your personal information, and we are committed to protecting 
       it. We use industry-standard security measures, such as encryption and firewalls, to ensure that your 
       data is safe and secure. Additionally, we only collect the information that we need to provide you 
       with the best possible service, and we never share your information with third parties without your 
       explicit consent. We regularly review and update our security protocols to ensure that we are keeping 
       up with the latest industry standards. You can shop with confidence at our website, knowing that your 
       data is in good hands.</p>
    </div>
  </div>
</div>

<div style="background-color: #333; color: #fff; padding: 20px; text-align: center; margin-top:0.7cm;">
  <p style="margin-left:2cm">&copy; 2023 Dank Clothing</p>
</div>

	
	<script>
	function search() {
		  var div = document.getElementById("product-container");
		  if (div.style.display === "none") {
		    div.style.display = "block";
		  } else {
		    div.style.display = "none";
		  }
		}
	function search() {
		  var div = document.getElementById("services");
		  if (div.style.display === "block") {
		    div.style.display = "none";
		  } else {
		    div.style.display = "block";
		  }
		}
	
	</script>
</body>
</html>