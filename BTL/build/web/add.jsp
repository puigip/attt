<%-- 
    Document   : add
    Created on : Oct 26, 2024, 6:25:34 PM
    Author     : buigi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
        <form action="add" method="POST">
            <label for="name">Họ và Tên:</label>
            <input type="text" id="name" name="name" required>

            <label for="username">Tên Đăng Nhập:</label>
            <input type="text" id="username" name="username" required>

            <label for="password">Mật Khẩu:</label>
            <input type="password" id="password" name="password" required>

            <input type="submit" value="Gửi">
        </form>
    
    <body>
        <h1>Hello World!</h1>
    </body>
</html>
