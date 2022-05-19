<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 align ="center"><i>Student Informatiom</i></h1>
<table border ="1">
   <thead> 
      <tr>
         <td>ID</td>
         <td>First Name</td>
          <td>Branch</td>
          <td>Contact</td>
          <td>Mobile Number</td>
          <td>Email Address</td>
          <td>City</td>
         </tr> 
      </thead>
      
 <c:forEach var="student" items="${StudentList}" >
 <tr>
    <td>  ${student.id} </td>
    <td> ${student.fname}</td>
     <td>  ${student.lname} </td>
      <td>  ${student.gender} </td>
      <td>  ${student.mobileNo}  </td>
        <td>  ${student.email}  </td>
      <td>  ${student.city}  </td>
    </tr>
 </c:forEach>
 
 </table>
 
</body>
</html>