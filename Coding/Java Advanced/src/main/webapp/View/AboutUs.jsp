<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
body {
  font-family: Arial, sans-serif;
  margin: 0;
  padding: 0;
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

.container {
  max-width: 800px;
  margin: 0 auto;
  padding: 20px;
}

h1 {
  font-size: 36px;
  margin-bottom: 20px;
}

p {
  font-size: 18px;
  line-height: 1.5;
  margin-bottom: 20px;
}

footer {
  background-color: #333;
  color: #fff;
  text-align: center;
  padding: 10px;
}


</style>
<body>
 <nav>
  <ul>
    <li><a href="Home.jsp">Home</a></li>
    <li><a href="product.jsp">Products</a></li>
    <li><a href="AboutUs.jsp">About Us</a></li>
    <li><a href="../UserProfile.jsp">Profile</a></li>
    

  </ul>
</nav>
    <div class="container">
      <h1>About Our Clothing Store</h1>
      <p>Our clothing store was established in 1990 and has been providing quality clothing to our customers ever since. We offer a wide selection of clothing for men, women, and children, ranging from casual wear to formal attire.</p>
      <p>Our mission is to provide our customers with the highest quality clothing at affordable prices, while also providing exceptional customer service. We believe that everyone should have access to stylish and comfortable clothing, and we strive to make that a reality for all of our customers.</p>
      <p>Thank you for choosing our clothing store for your clothing needs. We look forward to serving you and providing you with the best shopping experience possible.</p>
    </div>
    <footer>
      &copy; 2023 Our Clothing Store. All rights reserved.
    </footer>
</body>
</html>