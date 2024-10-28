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
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 20px;
        }
        table {
            width: 100%;
            border-collapse: collapse;
        }
        th, td {
            padding: 10px;
            text-align: left;
            border: 1px solid #ddd;
        }
        th {
            background-color: #f2f2f2;
        }
    </style>
</head>
<body>
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
        <h2>Quản lý người dùng</h2>
        <label for="userTK">Nhập ID người dùng:</label>
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
    
  
             <c:forEach var="c" items="${requestScope.data1}">
                <div class="product">
                    <img src="${c.image}" alt="${c.ten}">
                    <div class="product-info">
                        <h3>${c.ten}</h3>
                        <p>Giá: ${c.gia}</p>
                        <p>Mô tả: ${c.mota}</p>
                    </div>
                </div>
            </c:forEach>
    
    
</body>
</html>
