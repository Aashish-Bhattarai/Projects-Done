<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="controller.dao.DatabaseConnectivity"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Add Product</title>
</head>
<style>
form {
	max-width:80%
	margin: 0 auto;
	padding: 20px;
	background-color: #f0f0f0;
	border: 1px solid #ccc;
	border-radius: 5px;
}

h1 {
	text-align: center;
	margin-bottom: 30px;
}

label {
	display: block;
	margin-bottom: 5px;
	font-weight: bold;
}

input[type="text"], input[type="number"], select, input[type="file"] {
	display: block;
	width: 100%;
	padding: 10px;
	border: 1px solid #ccc;
	border-radius: 5px;
	margin-bottom: 15px;
	font-size: 16px;
}

input[type="file"] {
	padding: 5px;
}

button[type="submit"] {
	background-color: #4CAF50;
	color: #fff;
	border: none;
	border-radius: 5px;
	padding: 10px;
	font-size: 16px;
	cursor: pointer;
}

button[type="submit"]:hover {
	background-color: #3e8e41;
}

#delete-form {
  font-family: Arial, sans-serif;
  font-size: 16px;
  color: #333333;
  padding: 20px;
  border: 1px solid #cccccc;
  border-radius: 5px;
  width:80%
  
  
  }

#delete-form label {
  display: block;
  margin-bottom: 10px;
}
#delete-form input[type="text"] {
  padding: 8px;
  border-radius: 5px;
  border: 1px solid #cccccc;
  width: 100%;
  margin-bottom: 20px;
  box-sizing: border-box;
}
#delete-form input[type="submit"] {
  background-color: #4CAF50;
	color: #fff;
	border: none;
	border-radius: 5px;
	padding: 10px;
	font-size: 16px;
	cursor: pointer;
}
#delete-form input[type="submit"]:hover {
  background-color: #3e8e41;
}

#Heading{
Margin-left: 33.33%;
color=#333333;
}


#form {
  max-width: 600px;
  margin: 0 auto;
  padding: 20px;
  background-color: #f8f8f8;
  border-radius: 5px;
  box-shadow: 0 0 5px #ccc;
}

label {
  display: block;
  font-weight: bold;
  margin-bottom: 5px;
}

input[type="text"],
input[type="number"] {
  width: 100%;
  padding: 10px;
  margin-bottom: 15px;
  border: none;
  border-radius: 3px;
  box-sizing: border-box;
  font-size: 16px;
}

select {
  width: 100%;
  padding: 10px;
  margin-bottom: 15px;
  border: none;
  border-radius: 3px;
  box-sizing: border-box;
  font-size: 16px;
}

input[type="submit"] {
  background-color: #4CAF50;
  color: #fff;
  border: none;
  border-radius: 3px;
  padding: 10px 20px;
  font-size: 16px;
  cursor: pointer;
}

input[type="submit"]:hover {
  background-color: #3e8e41;
}

#show\/hide {
margin-top:0.5cm;
margin-left:6.5cm;
  background-color: #4CAF50;
  color: #fff;
  border: none;
  border-radius: 3px;
  padding: 10px 20px;
  font-size: 16px;
  cursor: pointer;
}
#show\/hide1 {
margin-left:1cm;
margin-top:0.5cm;
  background-color: #4CAF50;
  color: #fff;
  border: none;
  border-radius: 3px;
  padding: 10px 20px;
  font-size: 16px;
  cursor: pointer;
}
#show\/hide2 {
margin-top:0.5cm;
margin-left:1cm;
  background-color: #4CAF50;
  color: #fff;
  border: none;
  border-radius: 3px;
  padding: 10px 20px;
  font-size: 16px;
  cursor: pointer;
}
#show\/hide3 {
margin-top:0.5cm;
margin-left:1cm;
  background-color: #4CAF50;
  color: #fff;
  border: none;
  border-radius: 3px;
  padding: 10px 20px;
  font-size: 16px;
  cursor: pointer;
}
#show\/hide4 {
margin-top:0.5cm;
margin-left:1cm;
margin-bottom:1cm;
  background-color: #4CAF50;
  color: #fff;
  border: none;
  border-radius: 3px;
  padding: 10px 20px;
  font-size: 16px;
  cursor: pointer;
}



</style>

<body>


<nav style="background-color: green; text-align: center; align-items:center; height:1cm;">
  <a style="color: white; font-weight: bold; ">Admin Panel</a>
</nav>

<button id='show/hide' onclick="toggle()">ADD Product</button>
<button id='show/hide1' onclick="toggle1()">Delete Product</button>
<button id='show/hide2' onclick="toggle2()">View Product</button>
<button id='show/hide3' onclick="toggle3()">Edit Product</button>
<button id='show/hide4' onclick="toggle4()">View Order</button>

<div id="myDiv" style="display: none;">


	<h1>Add Product</h1>
	<form action="adminPanel1" method="post" >
		<label for="name">Name:</label>
		<input type="text" name="name" required><br>

		<label for="price">Price:</label>
		<input type="number"  name="price" min="0" step="1" required><br>

		<label for="quantity">Quantity:</label>
		<input type="number" id="quantity" name="quantity" min="0" required><br>

		<label for="category">Category:</label>
		<select  name="category" required>
			<option value="">Select a category</option>
			<option value="Shoe">Shoe</option>
			<option value="Tshirt">Tshirt</option>
			<option value="Pants">Pants</option>
			<option value="Formal suit">Formal Suit</option>
		</select>

		<label for="brand">Brand:</label>
		<input type="text"  name="brand" required><br>

		
		<input type="file" id="image-name-placeholder" name="image" accept="image/*" required value="example.jpg">

		<button type="submit" name="addProduct">Add Product</button>
	</form>
	
</div>
<div id="delete" style="display: none;">
	<div id="delete-form">
  <form method="post" action="adminpanel2">
    <label for="product-id">Enter Product ID:</label>
    <input type="text" id="product-id" name="prod_id">
    <button type="submit" name="Delete">Delete Product</button>
  </form>
</div>
</div>
	
<div id='View' style="display: none;">
<%
	Connection con = DatabaseConnectivity.getDatabaseConeection();
	PreparedStatement st = con.prepareStatement("SELECT p_id, name, price, category, brand FROM product");
	ResultSet result = st.executeQuery();
%>

<style>
	table {
	    margin-left:2cm;
		border-collapse: collapse;
		margin: 20px;
		margin-top:2cm;
		width:80%
		
	}
	
	th, td {
		padding: 10px;
		border: 1px solid #ddd;
	}
	
	th {
		background-color: #f2f2f2;
	}
	
	tr:nth-child(even) {
		background-color: #f2f2f2;
	}
</style>

<table>
	<tr>
		<th> ID </th>
		<th> Name </th>
		<th> Price </th>
		<th> Category </th>
		<th> Brand </th>
	</tr>
	
	<%
	while (result.next()) {
	%>
		<tr>
			<td><%= result.getString(1) %></td>
			<td><%= result.getString(2) %></td>
			<td><%= result.getString("price") %></td>
			<td><%= result.getString("category") %></td>
			<td><%= result.getString("brand") %></td>
		</tr>
	<%
	}
	%>
</table>
</div>
<div id='edit' style="display:none;">

<h3 style="margin-left=33.33%;">Edit Product</h3>
<form action="adminPanel3" id='form' method="POST">
  <label for="id">ID:</label>
  <input type="text" id="id" name="id"><br>

  <label for="name">Name:</label>
		<input type="text" name="name" required><br>

		<label for="price">Price:</label>
		<input type="number"  name="price" min="0" step="1" required><br>

		<label for="quantity">Quantity:</label>
		<input type="number" id="quantity" name="quantity" min="0" required><br>

		<label for="category">Category:</label>
		<select  name="category" required>
			<option value="">Select a category</option>
			<option value="Shoe">Shoe</option>
			<option value="Tshirt">Tshirt</option>
			<option value="Pants">Pants</option>
			<option value="Formal suit">Suit</option>
		</select>

		<label for="brand">Brand:</label>
		<input type="text"  name="brand" required><br>

		
		<input type="file" id="image-name-placeholder" name="image" accept="image/*" required value="example.jpg">

		<button type="submit" name="UpdateProduct">Update Product</button>
</form>

</div>
<div id='View1' style="display: none;">
<%
	
	 st = con.prepareStatement("SELECT username, price, category, brand,image FROM orders");
	 result = st.executeQuery();
	 
%>


<table>
	<tr>
		
		<th> Name </th>
		<th> Price </th>
		<th> Category </th>
		<th> Brand </th>
		<th> Image </th>
	</tr>
	
	<%
	

	while (result.next()) {
		String imageName = result.getString("image");
		 String imagePath =  "uploads/productImage/";
	%>
		<tr>
			<td><%= result.getString(1) %></td>
			<td><%= result.getString(2) %></td>
			<td><%= result.getString("category") %></td>
			<td><%= result.getString("brand") %></td>
			<td ><img style="height:5cm; width:5cm;" src="<%= imagePath + imageName %>"alt="Product Image" id='img'></td>
		</tr>
	<%
	}
	%>
	
</table>
</div>

<div style="background-color: #fff; padding: 20px; border: 1px solid #ccc;">

  <ul>
    <li> View Orders</li>
    <li>Manage Employee</li>
    <li>View Customer list</li>
  </ul>
</div>

<div style="background-color: #f0f0f0; padding: 20px; border: 1px solid #ccc;">
  <h2 style="margin-top: 0;">Admin Panel</h2>
  <ul>
    <li>Add Product</li>
    <li>Delete Product</li>
    <li>Edit Product</li>
    <li>View Product</li>
  </ul>
  <p>This admin panel allows you to manage your products. You can add new products, delete existing products, edit product details, and view all products in your inventory.</p>
</div>

	<script>
	
	const imageInput = document.getElementById('image');
	const imageNamePlaceholder = document.getElementById('image-name-placeholder');

	imageInput.addEventListener('change', () => {
	  const imageName = imageInput.files[0].name;
	  imageNamePlaceholder.textContent = imageName;
	});
	
	function toggle() {
		  var div = document.getElementById("myDiv");
		  if (div.style.display === "none") {
		    div.style.display = "block";
		  } else {
		    div.style.display = "none";
		  }
		}
	function toggle1() {
		  var div = document.getElementById("delete");
		  if (div.style.display === "none") {
		    div.style.display = "block";
		  } else {
		    div.style.display = "none";
		  }
		}
	function toggle2() {
		  var div = document.getElementById("View");
		  if (div.style.display === "none") {
		    div.style.display = "block";
		  } else {
		    div.style.display = "none";
		  }
		}
	function toggle3() {
		  var div = document.getElementById("edit");
		  if (div.style.display === "none") {
		    div.style.display = "block";
		  } else {
		    div.style.display = "none";
		  }
		}
	function toggle4() {
		  var div = document.getElementById("View1");
		  if (div.style.display === "none") {
		    div.style.display = "block";
		  } else {
		    div.style.display = "none";
		  }
		}
	
	
	function updateDateTime() {
	    var now = new Date();
	    var dateString = now.toLocaleDateString();
	    var timeString = now.toLocaleTimeString();
	    document.getElementById("date").textContent = dateString;
	    document.getElementById("time").textContent = timeString;
	  }

	  setInterval(updateDateTime, 1000);


	</script>
</body>
</html>
