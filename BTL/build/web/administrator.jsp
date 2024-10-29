<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="model.User"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Danh Sách Người Dùng</title>
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
    <li><a href="index.html">Đăng Xuất</a></li>
    <center>
        <h1>Danh Sách Người Dùng</h1>
        <table>
            <thead>
                <tr>
                    <th>Tên</th> 
                    <th>Mật Khẩu</th> 
                    <th>Tài khoản</th>  
                    <th>Địa Chỉ</th>
                    <th>SĐT</th>
                    <th>Group</th> 
                </tr>
            </thead>
            <tbody>
                
     <c:forEach var="x" items="${data}">
        <tr>
            <td>${x.ten}</td>
            <td>${x.mk}</td>
            <td>${x.tk}</td>
            <td>${x.diachi}</td>
            <td>${x.sdt}</td>
            <td>${x.group}</td>
        </tr>
    </c:forEach>
            </tbody>    
        </table>
        <form action="add" method="POST">
              <h1>Thêm người dùng </h1>
            <label for="name">Họ và Tên:</label>
            <input type="text" id="name" name="name" required>
            <br><br>

            <label for="username">Tên Đăng Nhập:</label>
            <input type="text" id="username" name="username" required>
            <br><br>

            <label for="password">Mật Khẩu:</label>
            <input type="password" id="password" name="password" required>
            <br><br>

            <label for="diachi">Địa Chỉ:</label>
            <input type="text" id="diachi" name="diachi" required>
            <br><br>

            <label for="sdt">SĐT:</label>
            <input type="tel" id="sdt" name="sdt" required>
            <br><br>

            <label for="group">Group:</label>
            <input type="text" id="group" name="group" required>
            <br><br>

            <input type="submit" value="Gửi">
        </form>

        <br>
        <h1>Xóa người dùng</h1>
        <label for="userTK">Nhập Tài Khoản người dùng:</label>
        <input type="text" id="userTK" placeholder="Nhập TK">
        <button onclick="doDelete()">Xóa</button>
    </center>

    <script type="text/javascript">
        function doDelete(){
            const TK = document.getElementById("userTK").value;
            if (TK === ""){
                alert("Vui lòng nhập TK người dùng.");
                return;
            }
            if (confirm("Bạn có muốn xóa người dùng có TK " + TK + "?")){
                window.location = "delete?TK=" + encodeURIComponent(TK);
            }
        }
    </script>
                     <h1>Danh Sách Sản Phẩm</h1>
                       <center>
             <c:forEach var="c" items="${requestScope.data1}">
                <div class="product">
                    <img src="${c.image}" alt="${c.ten}">
                    <div class="product-info">
                      <form action="xoaSanPham" method="POST" style="display: inline;">
    <input type="hidden" name="id" value="${c.id}">
    <button type="submit">Xóa</button>
</form>
                        <h3>${c.ten}</h3>
                        <p>Giá: ${c.gia}</p>
                        <p>Mô tả: ${c.mota}</p>
                    </div>
                </div>
             </c:forEach>
        
      <h1>Thêm Mới Sản Phẩm</h1>
         <form action="addSanPham" method="POST">
            <div class="form-group">
                <label for="ten">Tên Sản Phẩm:</label>
                <input type="text" id="ten" name="ten" required>
            </div>
            <div class="form-group">
                <label for="gia">Giá:</label>
                <input type="number" id="gia" name="gia" required>
            </div>
            <div class="form-group">
                <label for="moTa">Mô Tả:</label>
                <input type="text" id="moTa" name="moTa" required>
            </div>
            <div class="form-group">
                <label for="image">Đường Dẫn Hình Ảnh:</label>
                <input type="text" id="image" name="image" required>
            </div>
            <button type="submit">Thêm Mới</button>
        </form>
              </center>
  
    
</body>
</html>
