<%-- 
    Document   : delete
    Created on : Oct 26, 2024, 6:31:23 PM
    Author     : buigi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="vi">
<head>
       <script>
        const username = localStorage.getItem("username");
    </script>
    <meta charset="UTF-8">
    <title>Quản lý người dùng</title>
    <script type="text/javascript">
        function doDelete() {
            const id = document.getElementById("userId").value;
            if (id === "") {
                alert("Vui lòng nhập ID người dùng.");
                return;
            }
            if (confirm("Bạn có muốn xóa người dùng có ID " + id + "?")) {
                window.location = "delete?id=" + id;
            }
        }
    </script>
</head>
<body>
    <h2>Quản lý người dùng</h2>

    <!-- Ô nhập liệu cho ID người dùng và nút Xóa -->
    <label for="userId">Nhập ID người dùng:</label>
    <input type="text" id="userId" placeholder="Nhập ID">
    <button onclick="doDelete()">Xóa</button>

</body>
</html>
