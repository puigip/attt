<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Xem Đơn Hàng</title>
</head>
<body>
    <h1>Đơn Hàng Của Bạn</h1>
    <table border="1">
        <thead>
            <tr>
                <th>Tên Sản Phẩm</th>
                <th>Giá</th>
                <th>Hành Động</th>
            </tr>
        </thead>
       <script>
        // Lưu username vào localStorage
        localStorage.setItem("username", "<%= request.getParameter("username") %>");
    </script>
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
   <a href="trangchu?username=${username}">Trở về Trang Chủ</a>

</body>
</html>
