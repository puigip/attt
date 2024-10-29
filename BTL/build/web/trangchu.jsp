<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Trang chủ - Cửa hàng Rau Củ & Thịt</title>
    <link rel="stylesheet" href="styles.css">
   <style>
    body {
        font-family: Arial, sans-serif;
        background: linear-gradient(135deg, #f4f4f4 0%, #e0e0e0 100%);
        margin: 0;
        padding: 0;
    }
    .container {
        width: 80%;
        margin: 0 auto;
        background: white;
        padding: 20px;
        box-shadow: 0 0 15px rgba(0, 0, 0, 0.2);
        border-radius: 12px;
        transition: box-shadow 0.3s ease;
    }
    .container:hover {
        box-shadow: 0 0 20px rgba(0, 0, 0, 0.4);
    }
    h1 {
        text-align: center;
        color: #4CAF50;
        font-size: 2em;
        margin-bottom: 0;
    }
    .product {
        display: flex;
        align-items: center;
        margin-bottom: 20px;
        padding: 15px;
        border: 1px solid #ddd;
        border-radius: 10px;
        background-color: #fff;
        transition: transform 0.3s ease, box-shadow 0.3s ease;
    }
    .product:hover {
        transform: scale(1.02);
        box-shadow: 0 4px 12px rgba(0, 0, 0, 0.15);
    }
    .product img {
        width: 100px;
        height: auto;
        margin-right: 20px;
        border-radius: 8px;
    }
    .product-info {
        flex: 1;
    }
    .product-info h3 {
        margin: 0;
        font-size: 1.4em;
        color: #333;
    }
    .product-info p {
        margin: 5px 0;
        color: #555;
    }
    button {
        padding: 8px 16px;
        background-color: #4CAF50;
        color: white;
        border: none;
        border-radius: 5px;
        font-size: 1em;
        cursor: pointer;
        transition: background-color 0.3s ease;
    }
    button:hover {
        background-color: #45A049;
    }
    nav {
        margin-top: 20px;
        text-align: center;
    }
    .nav-links {
        list-style-type: none;
        padding: 0;
    }
    .nav-links li {
        display: inline;
        margin: 0 15px;
    }
    .nav-links a {
        text-decoration: none;
        color: #007BFF;
        font-weight: bold;
        transition: color 0.3s ease;
    }
    .nav-links a:hover {
        color: #0056b3;
    }
</style>
</head>
<body>
   
<!--    <script>
        // Lưu username vào localStorage
        localStorage.setItem("username", "<%= request.getParameter("username") %>");
    </script>-->
    <div class="container">
        <li><a href="index.html">Đăng Xuất</a></li>
        <li><a href="profile?username=${username}">Thông Tin Tài Khoản</a></li>
             <li><a href="muaSanPham?username=${username}">Xem Đơn Hàng</a></li>
        <h1>Chào mừng đến với Cửa hàng Tạp Hóa </h1> <h1> ${username}</h1>
        <!-- Bảng hiển thị sản phẩm -->
        <div>
            <c:forEach var="c" items="${requestScope.sp}">
                <div class="product">
                    <img src="${c.image}" alt="${c.ten}">
                    <div class="product-info">
                        <h3>${c.ten}</h3>
                        <p>Giá: ${c.gia}</p>
                        <p>Mô tả: ${c.mota}</p>
                        <!-- Form để mua sản phẩm -->
                        <form action="muaSanPham" method="POST">
                            <input type="hidden" name="username" value="${username}" />
                            <input type="hidden" name="productId" value="${c.id}" />
                            <input type="hidden" name="ten" value="${c.ten}" /> 
                            <input type="hidden" name="price" value="${c.gia}" /> <!-- Gửi giá sản phẩm -->
                            <button type="submit">Mua</button>
                        </form>
                    </div>
                </div>
            </c:forEach>
        </div>

        <nav>
            <ul class="nav-links">
                <li><a href="muaSanPham?username=${username}">Xem Đơn Hàng</a></li>
            </ul>
        </nav>
    </div>
</body>
</html>
