<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Xem Giỏ Hàng</title>
    <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Xem Giỏ Hàng</title>
    <link rel="stylesheet" href="styles.css">
    <style>
        body {
            font-family: Arial, sans-serif;
            background: linear-gradient(to right, #f8f9fa, #e0e0e0);
            margin: 0;
            padding: 0;
            color: #333;
        }
        h1 {
            text-align: center;
            color: #4CAF50;
            font-size: 2.5em;
            margin-top: 20px;
        }
        .container {
            width: 70%;
            margin: auto;
            background: white;
            padding: 20px;
            box-shadow: 0 0 15px rgba(0, 0, 0, 0.2);
            border-radius: 12px;
        }
        table {
            width: 100%;
            border-collapse: collapse;
            margin: 20px 0;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
        }
        th, td {
            padding: 15px;
            text-align: center;
            border-bottom: 1px solid #ddd;
        }
        th {
            background-color: #4CAF50;
            color: white;
            font-size: 1.2em;
        }
        td {
            font-size: 1em;
            background-color: #f9f9f9;
        }
        tr:hover {
            background-color: #f1f1f1;
            transition: background-color 0.3s;
        }
        button {
            padding: 10px 20px;
            background-color: #e74c3c;
            color: white;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            font-size: 1em;
            transition: background-color 0.3s;
        }
        button:hover {
            background-color: #c0392b;
        }
        .message {
            text-align: center;
            color: red;
            font-size: 1.1em;
        }
        .links {
            text-align: center;
            margin-top: 20px;
        }
        .links a {
            margin: 0 10px;
            color: #007BFF;
            text-decoration: none;
            font-weight: bold;
            transition: color 0.3s;
        }
        .links a:hover {
            color: #0056b3;
        }
    </style>
</head>

</head>
<body>
    <h1>Giỏ Hàng Của Bạn</h1>
    <table border="1">
        <thead>
            <tr>
                <th>Tên Sản Phẩm</th>
                <th>Giá</th>
                <th>Hành Động</th>
            </tr>
        </thead>
<!--       <script>
        // Lưu username vào localStorage
        localStorage.setItem("username", "<%= request.getParameter("username")%>");
    </script>-->
        <tbody>
            <c:forEach var="c" items="${requestScope.ds}">
                <tr>
                    <td>${c.ten}</td>
                    <td>${c.gia}</td>
                    <td>
                        <!-- Form để xóa sản phẩm -->
                        <form action="deleteds" method="POST">
                            <input type="hidden" name="id" value="${c.id}" />
                             <input type="hidden" name="username" value="${username}"/>
                            <button type="submit">Xóa</button>
                        </form>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
        <h1> ${username}</h1>
    </table>
      <c:if test="${not empty ms}">
        <p style="color:red;">${ms}</p>
    </c:if>
     <a href="thanhToan?username=${username}">Thanh Toán</a> 
   <a href="trangchu?username=${username}">Trở về Trang Chủ</a>
   
</body>
</html>
