<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>SignUp form</h1>
<form action="signUp" method="post">
<pre>
username<input type="text" name="username" >
userId<input type="text" name="userId" value=${dto.userId}>
Email<input type="text" name="email"  value=${dto.email}>
password<input type="password" name="password">
confirmPassword<input type="password" name="confirmpassword">
<input type="submit" value="Signup">

<h3>
<span style=color:green> ${msg}</span>
<span style=color:red> ${msgs}</span>
</h3>
</pre>



</form>
</body>
</html>