<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
  <head>
  
    <title>signup</title>

  	<style type="text/css">
       /* Style for the form */
.form {
  max-width: 500px;
  margin: 0 auto;
  padding: 20px;
  background-color: #f9f9f9;
  border: 1px solid #ccc;
  border-radius: 5px;
  box-shadow: 0px 0px 5px rgba(0, 0, 0, 0.1);
  font-family: Arial, sans-serif;
}

/* Style for the labels */
.text {
  font-size: 16px;
  font-weight: bold;
  margin-top: 20px;
  display: block;
}

/* Style for the inputs */
.box {
  border-radius: 3px;
  border: 1px solid #ccc;
  padding: 10px;
  font-size: 16px;
  width: 100%;
  margin-bottom: 20px;
  box-sizing: border-box;
}

/* Style for the submit button */
.box1 {
  background-color: #4CAF50;
  border: none;
  color: white;
  padding: 10px 20px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
  margin-top: 20px;
  cursor: pointer;
  border-radius: 3px;
}

/* Style for the header */
h2 {
  font-size: 24px;
  font-weight: bold;
  margin-bottom: 20px;
}

/* Style for the links */
a {
  color: darkblue;
  text-decoration: none;
}

a:hover {
  text-decoration: underline;
}

/* Style for the hr */
hr {
  border: none;
  height: 1px;
  background-color: #ccc;
  margin-top: 40px;
  margin-bottom: 40px;
}

/* Media query for mobile devices */
@media (max-width: 480px) {
  .form {
    padding: 10px;
  }
  
  .box {
    margin-bottom: 10px;
  }
  
  h2 {
    font-size: 20px;
  }
  
  hr {
    margin-top: 20px;
    margin-bottom: 20px;
  }
}
       

      
    </style>
    </head>
  <body>
   
     
      <form action="${pageContext.request.contextPath}/UserRegister" method="post" ENCTYPE="multipart/form-data">  
      <div class="form">
        
         
          <div class="page" name="messageForm">
            <div style=" margin-left: 20px;">
              <h2 style="margin-top: 20px; margin-left: 20px">Create account</h2>
              <br><label class="text">Name </label><br>
              <input class="box" type="text" name="name" size=24 required><br><br>
              <label class="text">Username</label><br>
              <input class="box" type="text" name="username" size=24 required><br><br>
              <label class="text">Phone Number</label><br>
              <input class="box" type="text" name="num" size=24 required><br><br>
              <label class="text">Password</label><br>
              <input class="box" type="password" name="password" size=24 placeholder="Please enter aleast 6 charaters" required><br><br>
              <label class="text">Role</label><br>
              <input class="box" type="text" name="role" size=24 required><br><br>
              <label class="text">Upload Image</label><br>
              <input type="file" value="" name="image" size=24 style="margin-top: 20px; margin-left: 20px"><br><br><br>
              <input class="box1" type="submit" name="submit" value="insert" onclick="myfunc()">
            </div>
            <hr style=" margin-top: 40px; width: 50%; margin-left: 90px;">
            <p style=" margin-top: 10px; margin-left: 75px;">Already have an account? <a href="login.jsp"><span style="color: darkblue;">Sign in</span></a></p>
          </div>
        </div>
        </form> 
      <!--Using javascript the form validation is checked, the variable are get from forms, then if either of field is empty, empty message is popup or thank you message is popup-->
    </div> 
  </body>
</html>