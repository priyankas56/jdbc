<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Register</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <div class="container mt-5">
        <h1 class="text-center mb-4">Register page</h1>
        <form action="register" method="post" class="p-4 border rounded shadow-sm">
            <div class="mb-3">
                <label for="name" class="form-label">Name</label>
                <input type="text" class="form-control" id="name" name="name" placeholder="Enter your name">
            </div>
            <div class="mb-3">
                <label for="email" class="form-label">phoneNumber</label>
                <input type="number" class="form-control" id="phoneNumber" name="phoneNumber" placeholder="Enter your phoneNumber">
            </div>
            <div class="mb-3">
                <label for="email" class="form-label">email</label>
                <input type="email" class="form-control" id="email" name="email" placeholder="Enter your email">
            </div>
            <div class="mb-3">
                <label for="contact" class="form-label">age</label>
                <input type="tel" class="form-control" id="age" name="age" placeholder="Enter your age">
            </div>
            <div class="mb-3">
                <label for="contact" class="form-label">Password</label>
                <input type="number" class="form-control" id="password" name="password" placeholder="Enter your contact password">
            </div>
            
            <div class="mb-3">
                <label for="contact" class="form-label">ConfirmPassword</label>
                <input type="number" class="form-control" id="confirmPassword" name="confirmPassword" placeholder="Enter your contact confirmPassword">
            </div>
            
            <button type="submit" class="btn btn-primary w-100">Submit</button>
            <h2>
            <span style='color:green'>${msg}</span>
             <span style='color:red'>${msgs}</span>
             </h2>
        </form>
    </div>
    <!-- Bootstrap JS (optional for some interactive features) -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>