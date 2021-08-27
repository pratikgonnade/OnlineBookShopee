<%@page import="java.sql.ResultSet"%>
<%@page import="com.mysql.cj.protocol.Resultset"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<center>
		<h1>Shopping Cart For Book Store </h1>
		<h2>Selected Book Details Are Displayed</h2>
		<form action="Customer.jsp">
		
	
			<%
		try{
			
			ResultSet rs = (ResultSet)session.getAttribute("rs1");
			
		while(rs.next ()) {
			
		%>


			Book Name : <%=rs.getString("Books_name") %> <br> <br> 
			Author : <%=rs.getString("Author") %><br> <br> 
			Price : <%= rs.getInt("Price") %><br> <br>
			
			<%
			
			
		}

	}
			catch(Exception e){
				e.printStackTrace();
				
			}
%>

			Quantity : <input type="text"> <br> <br> <input
				type="submit" value="Purchase"> <br>
			<br>
		</form>

		<form action="index.jsp">
			<input type="submit" value="Cancle">
		</form>
	</center>
</body>
</html>