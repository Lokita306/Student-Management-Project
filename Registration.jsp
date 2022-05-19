<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<body bgcolor="pink">
<div align="center">
  <h1>Registration page</h1> 
  
  <form action="login" method="get">
  
  <label><b>Student ID:</b></label>
<input type="number" name="id" placeholder="Enter your ID"><br><br>
  
<label><b>Student Name:</b></label>
<input type="text" name="name" placeholder="Enter your Name"><br><br>

<label><b>Branch:</b></label>
<input type="text" name="branch" placeholder="Enter your Branch"><br><br>

<label><b>Contact:</b></label>
<input type="number" name="contact" placeholder="Enter your MobileNo"><br><br>

<label><b>Email:</b></label>
<input type="email" name="email" placeholder="Enter your Email Address"><br><br>

<label><b>User Name :- </b></label>
<input type="text" name="uname" placeholder="Enter UserName"/><br><br>

<label><b>Password :- </b></label>
<input type="password" name="pswd" placeholder="Enter Password"/><br><br>

<input type ="submit" value="Register Student">
</form>
</div>
</body>
</html>