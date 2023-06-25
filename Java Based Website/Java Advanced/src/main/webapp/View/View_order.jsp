<%@page import="controller.dao.DatabaseConnectivity"%>
<%@page import="controller.statemanagement.SessionManage"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Connection"%>
<%@page import="com.mysql.cj.protocol.Resultset"%>
<%@page import="java.sql.PreparedStatement"%>
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
	#view1{
	margin-left:2cm;
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
<h3 style="margin-left:15cm">View Your orders</h3>

<div id='View1' style="margin-left:5cm;">
<%
	Connection con= DatabaseConnectivity.getDatabaseConeection();
	PreparedStatement st = con.prepareStatement("SELECT username, price, category, brand,image FROM orders where username=?");
	st.setString(1,user);
	ResultSet result = st.executeQuery();
	 
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
		 String imagePath =  "../uploads/productImage/";
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
</body>
</html>