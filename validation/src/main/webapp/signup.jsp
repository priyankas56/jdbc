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
<form action="signin" method="post">
<pre>
UserName<input type="text" name="username"/>
Email<input type="text" name="email">
Password<input type="password" name="password"/>
ConfirmPassword<input type="password" name="confirm password"/>
<input type="submit" value="signup"/>
</pre>
</form>
<h1>
<span style=color:green>${success}</span>
<span style=color:red> ${failure}</span>
</h1>
</body>

</body>
</html>