<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Danh Sách Người Dùng</title>
</head>
<body>
    <center>
        <h1>Danh Sách Người Dùng</h1>
        <table border="1">
            <thead>
                <tr>
                    <th>ID</th> 
                    <th>Tên</th> 
                    <th>Tên Đăng Nhập</th> 
                    <th>Mật Khẩu</th> 
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${requestScope.data}" var="c">
                    <tr>
                        <td>${c.id}</td>
                        <td>${c.ten}</td>
                        <td>${c.username}</td>
                        <td>${c.password}</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
              <li><a href="add.jsp">thêm người dùng</a></li>
               <li><a href="delete.jsp">xóa người dùng </a></li>
    </center>
</body>
</html>
