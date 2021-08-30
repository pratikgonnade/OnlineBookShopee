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
	<h1>Shopping Cart For Book Store</h1>
	
	<form action="">
		
		Customer Name : <input type="text"><br><br>
		Address : <input type="text"><br><br>
		Phone No. : <input type="text"><br><br>
		Order Date : <input type="date"><br><br>
		
			<h2>Your Order Details	</h2>
	
		
		<input type="submit" value="Confrim"> <br> <br>
	</form>
	

	<form action="./WelcomeServlet">
		
		<input type="submit" value="Cancle">
		
	</form>
 </center>
</body>
</html>