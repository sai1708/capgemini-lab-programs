<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="add" method="post">

Enter Trainee Id <input type="number" name="id" value="id"><br>
Enter Trainee Name <input type="text" name="name"><br>
Trainee Location <input type="checkbox" name="location" value="location">chennai
                 <input type="checkbox" name="location" value="location">Bangalore
                 <input type="checkbox" name="location" value="location">pune
                 <input type="checkbox" name="location" value="location">Mumbai<br>
Trainee Domain <label for="domains"></label>
               <select id="domains">
              <option value="jee" name="domain" value="domain">jee</option>
              <option value=".net" name="domain" value="domain">.Net</option>
              <option value="java" name="domain" value="domain">java</option>
              <option value=".orc" name="domain" value="domain">.orc</option></select><br>
              
<input type="submit" value="add"></button>
</form>
</body>
</html>