<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
	<title>Login to your account</title>
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/all.css">
	<style type="text/css">
       
      img{/* The the image tag is given 100% width and height using this*/
        height: 100%;
        width: 100%;
      }
      .form {
  display: flex;
  justify-content: center;
  align-items: center;
  height: 100vh;
}

.page {
  display: flex;
  flex-direction: column;
  align-items: center;
  padding: 20px;
  background-color: #f1f1f1;
  border-radius: 5px;
  margin-left:4cm;
}

.text {
  font-size: 16px;
  font-weight: bold;
}

.box {
  width: 100%;
  padding: 10px;
  margin-bottom: 20px;
  border: none;
  border-radius: 5px;
  box-shadow: 0 0 5px #ccc;
}

.box1 {
  width: 100%;
  padding: 10px;
  margin-top: 20px;
  background-color: #007bff;
  color: #fff;
  border: none;
  border-radius: 5px;
  cursor: pointer;
  transition: all 0.3s ease-in-out;
}

.box1:hover {
  background-color: #0062cc;
}

a {
  text-decoration: none;
  color: #007bff;
}

a:hover {
  text-decoration: underline;
}
      
      .error-message {
	color: red;
	align-content: left;
	text-align: center;
	margin-top: 2cm;
	margin-left: 150px;
	background-color: blue;
	font-size: 22px;
}

	.register-message {
		color: seagreen;
		align-content: center;
		text-align: center;
		margin-top: 10px;
		position: absolute;
	    top: 0;
	}
    </style>
</head>
<body>
	<% 
	String errorMessage = (String) request.getAttribute("errorMessage");
	String registerMessage = (String) request.getHeader("registerMessage");
	%>
	
		<div class="containerd">
      <!-- The below div is div for navigation bar for the webpage-->
      <nav class="navbar">
        <!-- Inside the navigation div there are three div in which first used for logo, second one for nav bar of pages and third for icons-->
        
        <% if (registerMessage != null) { %>
		    <div class="register-message"><%= registerMessage %></div>
		<% } %>
	<div class="container">
		<% if (errorMessage != null) { %>
		    <div class="error-message"><%= errorMessage %></div>
		<% } %>
	</div>

        <!--Using this div icon are inserted to signup, when signup icon is clicked it will link to sigup page-->
    </nav>
      <!--Using this div the form kept at center-->
	<form action="LoginServlet" method="post" >
      <div class="form">
        <div style="height: 300px; width: 300px; margin-left: 50px;">
           <img src="uploads/bannerimages/login.png">
        </div>
         <!--Using form tag a form is created, the form input are kept inside a div and it will be submitted after filling, and there is also option if user is already signed in then they can sign in-->
          <div class="page" name="messageForm">
            <div style=" margin-left: 20px;">
              <h2 style="margin-top: 30px; margin-bottom: 20px; margin-left: 15px;">Login to Account</h2>
              <br><label class="text">Username</label><br>
              <input class="box" type="text" name="userName" required><br><br>
              <label class="text">Password</label><br>
              <input class="box" type="password" name="userPwd" required><br><br>
              <input class="box1" type="submit" name="submit" value="login" onclick="myFunc1()">
            </div>
            <hr style=" margin-top: 40px; width: 54%; margin-left: 80px;">
            <p style=" margin-top: 10px; margin-left: 90px;">Don't have an account? <a href="register.jsp"><span style="color: darkblue;">Sign Up</span></a></p>
          </div>
        </div>
        </form>
      <!--Using javascript the form validation is checked, the variable are get from forms, then if either of field is empty, empty message is popup or thank you message is popup-->
    </div> 
	</div>
</body>
</html>