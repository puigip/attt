<%-- 
    Document   : register
    Created on : Oct 27, 2024, 3:03:12 PM
    Author     : buigi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="vi">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Đăng Ký</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
            background-color: #f4f4f4;
        }
        .register-container {
            width: 300px;
            padding: 20px;
            background-color: white;
            border-radius: 8px;
            box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);
        }
        h2 {
            text-align: center;
            color: #333;
        }
        label {
            font-weight: bold;
        }
        input[type="text"], input[type="password"], input[type="tel"] {
            width: 100%;
            padding: 8px;
            margin: 5px 0 15px 0;
            display: inline-block;
            border: 1px solid #ccc;
            border-radius: 4px;
            box-sizing: border-box;
        }
        button {
            width: 100%;
            padding: 10px;
            background-color: #4CAF50;
            color: white;
            border: none;
            border-radius: 4px;
            cursor: pointer;
        }
        button:hover {
            background-color: #45a049;
        }
    </style>
</head>
<body>
    <div class="register-container">
        <h2>Đăng Ký</h2>
        <form action="dki" method="POST">
            <label for="name">Họ và Tên</label>
            <input type="text" id="name" name="name" required>

            <label for="username">Tên Tài Khoản</label>
            <input type="text" id="username" name="username" required>

            <label for="password">Mật Khẩu</label>
            <input type="password" id="password" name="password" required>

            <label for="address">Địa Chỉ</label>
            <input type="text" id="address" name="address" required>

            <label for="phone">Số Điện Thoại</label>
            <input type="tel" id="phone" name="phone" required>

            <button type="submit">Đăng Ký</button>
        </form>
         <c:if test="${not empty error}">
        <p style="color:red;">${error}</p>
    </c:if>

    <c:if test="${not empty success}">
        <p style="color:green;">${success}</p>
    </c:if>
    </div>
</body>
</html>
