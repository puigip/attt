<%-- 
    Document   : profile
    Created on : Oct 29, 2024, 4:39:05 AM
    Author     : buigi
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Profile Page</title>
    <style>
        /* Định dạng bảng */
        table {
            width: 80%;
            margin: 20px auto;
            border-collapse: collapse;
            font-family: Arial, sans-serif;
        }
        th, td {
            padding: 10px;
            border: 1px solid #ddd;
            text-align: left;
        }
        th {
            background-color: #4CAF50;
            color: white;
        }
        tr:nth-child(even) {
            background-color: #f2f2f2;
        }
        tr:hover {
            background-color: #ddd;
        }

        /* Định dạng container cho nút và form */
        .button-container {
            text-align: center;
            margin-top: 20px;
        }
        .form-container {
            display: flex;
            justify-content: center;
            gap: 40px; /* Tăng khoảng cách giữa các ô nhập liệu */
            margin-top: 10px;
        }
        .input-group {
            display: flex;
            flex-direction: column; /* Đặt theo chiều dọc */
            align-items: center; /* Căn giữa các phần tử */
        }

        /* Định dạng cho các nút và input */
        input[type="password"], input[type="text"], input[type="number"] {
            width: 220px; /* Kích thước ô nhập liệu */
            padding: 8px;
            font-size: 16px;
            margin-bottom: 10px; /* Khoảng cách giữa các ô nhập liệu */
        }
        button {
            padding: 8px 20px;
            font-size: 16px;
            cursor: pointer;
            background-color: #4CAF50; /* Màu nền nút */
            color: white; /* Màu chữ nút */
            border: none; /* Không có viền */
            border-radius: 5px; /* Bo góc nút */
            transition: background-color 0.3s; /* Hiệu ứng chuyển màu khi hover */
        }
        button:hover {
            background-color: #45a049; /* Màu nền khi hover */
        }
    </style>
</head>
<body>
    <h2 style="text-align: center;">User Profile Information</h2>   

    <table>
      
        <thead>
               <a href="trangchu?username=${username}">Trở về Trang Chủ</a>
            <tr>
                <th>Họ tên</th>
                <th>Tài khoản</th>
                <th>Địa chỉ</th>
                <th>Số điện thoại</th>
                <th>Tiền</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="c" items="${requestScope.list}">
                <tr>
                    <td>${c.ten}</td>
                    <td>${c.tk}</td>
                    <td>${c.diachi}</td>
                    <td>${c.sdt}</td>
                    <td>${c.tien}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>

    <div class="button-container">
        <!-- Container bao quanh form -->
        <div class="form-container">
            <!-- Form đổi mật khẩu -->
<form action="changePass" method="post" class="input-group">
    <input type="password" name="newPassword" placeholder="Nhập mật khẩu mới" required>
      <input type="hidden" name="username" value="${username}"/>
    <button type="submit">Đổi mật khẩu</button>
         
</form>
  <c:if test="${not empty ms}">
        <p style="color:red;">${ms}</p>
    </c:if>
            <!-- Form nạp tiền -->
            <form action="napTien" method="post" onsubmit="return validateInput()" class="input-group">
                <input type="text" id="amount" name="amount" placeholder="Nhập số tiền cần nạp" required>
              <input type="hidden" name="username" value="${username}"/>
                <button type="submit">Nạp tiền</button>
            </form>
        </div>
    </div>
      
    <script>
        function validateInput() {
            const input = document.getElementById('amount').value;
            const isValid = /^-?\d+$/.test(input); // Biểu thức chính quy để kiểm tra số nguyên (có thể âm)
            if (!isValid) {
                alert("Vui lòng chỉ nhập số nguyên.");
                return false; // Ngăn chặn gửi form
            }
            return true; // Cho phép gửi form
        }
    </script>
</body>
</html>
