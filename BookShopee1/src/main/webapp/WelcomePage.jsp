<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome To BookShopee</title>
</head>
<body>


	<center>
		<h1>Welcome To BookShopee</h1>
		<h2>Welcome Page</h2>
	
	<table border="2">
		<thead>
			<th>Book ID</th>
			<th>Book Name</th>
			<th>Author</th>
			<th>Price</th>
		</thead>
		
		
		<%
		try{
	    ResultSet rs =(ResultSet) session.getAttribute("rs");
		while(rs.next()) {
		%>	
			
			<tr>
				<td><%= rs.getString("Books_ID")%></td>
				<td><a href="Book.jsp?BookID=<%=rs.getString("Books_ID") %>"><%= rs.getString("Books_name")%></a></td>
				<td><%= rs.getString("Author")%></td>
				<td><%= rs.getInt("Price")%></td>
			</tr>
			
	<% }
		}
		catch(Exception e){
			e.printStackTrace();
			
		}
	
	
	%>
		
		

		
	</table>
	

	</center>


</body>
</html>