<html>
<body>

<<h2>Employee Name <%=request.getParameter("uName") %></h2>
<h2>Employee Id <%=request.getParameter("uId") %></h2>
<h2>Employee Salary <%=request.getParameter("uSalary") %></h2>

<!--  
  it is used when session used in app class
<h2>Employee Name <%=session.getAttribute("uName") %></h2>
 -->
</body>
</html>