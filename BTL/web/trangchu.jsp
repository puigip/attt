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
            background-color: #f4f4f4;
            margin: 0;
            padding: 0;
        }
        .container {
            width: 80%;
            margin: 0 auto;
            background: white;
            padding: 20px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            border-radius: 8px;
        }
        h1 {
            text-align: center;
            color: #333;
        }
        .product {
            display: flex;
            align-items: center;
            margin-bottom: 20px;
            padding: 10px;
            border: 1px solid #ddd;
            border-radius: 5px;
            background-color: #fff;
        }
        .product img {
            width: 100px; /* Chỉnh kích thước ảnh */
            height: auto;
            margin-right: 20px;
        }
        .product-info {
            flex: 1; /* Tự động mở rộng chiếm không gian còn lại */
        }
        .product-info h3 {
            margin: 0;
            font-size: 1.2em;
        }
        .product-info p {
            margin: 5px 0;
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
        }
        .nav-links a:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>
    <script>
        // Lưu username vào localStorage
        localStorage.setItem("username", "<%= request.getParameter("username") %>");
    </script>
    <div class="container">
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
