<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="controller.dao.DatabaseConnectivity"%>
<%@page import="java.sql.Connection"%>
<%@page import="controller.statemanagement.SessionManage"%>
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
  margin: 20px;
  padding: 10px;
  border: 1px solid #ccc;
  border-radius: 5px;
  box-shadow: 2px 2px 5px #ccc;
}

.name {
  font-size: 24px;
  font-weight: bold;
  margin-top: 0;
}

.id, .unname, .name, .role , .contact {
  font-size: 18px;
  margin: 5px 0;
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

nav li {
  float: left;
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
/* Style for the container div */
.container {
  display: block;
  width: 300px;
  height: 200px;
  background-color: #f1f1f1;
  border: 1px solid #ccc;
  padding: 10px;
  align-items:center;
}

/* Style for the toggle button */
.toggle-button {
  display: block;
  width: 100px;
  height: 30px;
  background-color: #4CAF50;
  color: #fff;
  text-align: center;
  line-height: 30px;
  cursor: pointer;
  margin: 10px auto;
}

/* Hide the container div by default */
.container {
  display: none;
}

/* Show the container div when the button is clicked */
.container.show {
  display: block;
}

#myDiv {
  display: none;
  background-color: #f2f2f2;
  padding: 20px;
  margin-top: 20px;
}

#delete-form {
  max-width: 400px;
  
}

label {
  display: block;
  margin-bottom: 10px;
}

input[type="text"],
input[type="number"] {
  width: 100%;
  padding: 10px;
  margin-bottom: 20px;
  box-sizing: border-box;
  border: none;
  border-radius: 4px;
  border: 1px solid #ccc;
}

button[type="submit"] {
  background-color: #4CAF50;
  color: #fff;
  padding: 10px 20px;
  border: none;
  border-radius: 4px;
  cursor: pointer;
}
#Update{
background-color: #4CAF50;
  color: #fff;
  padding: 10px 20px;
  border: none;
  border-radius: 4px;
  cursor: pointer;
  display: inline;
  cursor: pointer;
}
#Update:hover{
background-color: #45a049;
display: inline;
  cursor: pointer;
}

button[type="submit"]:hover {
  background-color: #45a049;
}

#delete {
  display: inline;
  cursor: pointer;
}

#delete:hover {
  color: red;
}


</style>
<body>
<nav>
  <ul>
    <li><a href="View/Home.jsp">Home</a></li>
    <li><a href="View/product.jsp">Products</a></li>
    <li><a href="View/AboutUs.jsp">About Us</a></li>
  </ul>
</nav>
<%
	Connection con = DatabaseConnectivity.getDatabaseConeection();
	PreparedStatement st = con.prepareStatement("SELECT id, name, contact_number,role FROM register where username=?");
	st.setString(1,user);
	ResultSet result = st.executeQuery();
	%>
	<%
		while (result.next()) {
			String id = result.getString("id");
			String name = result.getString("name");
			String role = result.getString("role");
			String Contact = result.getString("contact_number");
			
			%>
			
			
		
		
	<div class="product-container">
	<div style="display:flex;">
	<div style="margin-left:1cm; float:left;">
  
  </div>
  <div style="margin-left:5cm;">
    <p class="id">ID: <%= id %></p>
    <p class="uame">Name: <%= name %> </p>
    <p class="uname"> User Name: <%= user %></p>
    
    <p class="role"> Role: <%= role %></p>
    <p class="contact"> Contact: <%= Contact %></p>
      
    </div>
    </div>
<div style="margin-top:0.6cm; margin-left:6cm;">
<button onclick="toggleDiv()" id="Update">Update profile</button>

<div id="myDiv" style="display: none;">
  <div id="delete">
	<div id="delete-form">
  <form method="post" action="UpdateProfile">
    <label for="Name">Enter name:</label>
    <input type="text" id="name" name="name">
    <label for="Contact">Enter Contact No:</label>
    <input type="number" id="contact" name="contact">
    <input type="hidden" name="username" value="<%= user %>">
    
    <button type="submit" name="Delete">Change</button>
  </form>
</div>
</div>
  </div>
    </div>
 </div>
 	
    
    <% } %>
    
   

<script>
function toggleDiv() {
  var div = document.getElementById("myDiv");
  if (div.style.display === "none") {
    div.style.display = "block";
  } else {
    div.style.display = "none";
  }
}
</script>
    
    
    


</body>
</html>