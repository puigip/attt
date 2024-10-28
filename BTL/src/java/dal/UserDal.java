/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.User;
import dal.DBcontext;
import java.util.List;

/**
 *
 * @author buigi
 */
public class UserDal {

    // 
    public List<User> getAll() {
        List<User> list = new ArrayList<>();
        String sql = "select * from Users";
        try {
            DBcontext db = new DBcontext();
            PreparedStatement st = db.connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()){
           User c = new User(rs.getString("TK"), rs.getString("MK"), rs.getString("HoTen"),rs.getString("DiaChi"),rs.getString("SDT"),rs.getInt("GroupID"));
                list.add(c);    
                System.out.println(c.getTen());
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return list;
    }

    public void insert(User c) {
        String sql = "INSERT INTO [dbo].[Users]\n"
                + "           ([TK]\n"
                + "           ,[MK]\n"
                + "           ,[HoTen]\n"
                + "           ,[DiaChi]\n"
                + "           ,[SDT]\n"
                + "           ,[GroupID])\n"
                + "     VALUES\n"
                + "           (?,?,?,?,?,?)";
        try {
            DBcontext db = new DBcontext();
            PreparedStatement st = db.connection.prepareStatement(sql);
            st.setString(1, c.getTk());
            st.setString(2, c.getMk());
            st.setString(3, c.getTen());
            st.setString(4, c.getDiachi());
            st.setString(5, c.getSdt());
            st.setInt(6, c.getGroup());
            st.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public void delete(String username) {
        String sql = "DELETE FROM [dbo].[Users]\n"
                + "      WHERE TK=?";
        try {
            DBcontext db = new DBcontext();
            PreparedStatement st = db.connection.prepareStatement(sql);
            st.setString(1, username);
            st.executeUpdate();
        } catch (SQLException x) {
            System.out.println(x);
        }
    }

    public int login() {
        return 1;
    }

   public  int timKiemtk(String username) {
    String sql = "SELECT TK FROM Users WHERE TK = ?;";
    try {
        DBcontext db = new DBcontext();
        PreparedStatement st = db.connection.prepareStatement(sql);
        st.setString(1, username);
        
        ResultSet rs = st.executeQuery();
        
        // Kiểm tra nếu có kết quả trả về (tài khoản tồn tại)
        if (rs.next()) {
            return 0; // Tài khoản đã tồn tại
        }
    } catch (Exception e){
        e.printStackTrace(); // In lỗi ra console để kiểm tra
    }
    
    return 1; // Tài khoản không tồn tại
}
public String timKiemmk(String username) {
    String sql = "SELECT MK FROM Users WHERE TK = ?;";
    String password = null; // Khởi tạo biến password

    try {
        DBcontext db = new DBcontext();
        PreparedStatement st = db.connection.prepareStatement(sql);
        st.setString(1, username);
        
        ResultSet rs = st.executeQuery();
        
        // Kiểm tra xem có kết quả nào không
        if (rs.next()) {
            // Nếu có kết quả, lấy giá trị mật khẩu
            password = rs.getString("MK");
        }
    } catch (Exception e) {
        e.printStackTrace(); // In lỗi ra console để kiểm tra
    }
    
    return password; // Trả về mật khẩu hoặc null nếu không tìm thấy
}
public int timKiemid(String username) {
    String sql = "SELECT GroupID FROM Users WHERE TK = ?;";
      // Khởi tạo biến password
     int id=2;
    try {
        DBcontext db = new DBcontext();
        PreparedStatement st = db.connection.prepareStatement(sql);
        st.setString(1, username);
      
        ResultSet rs = st.executeQuery();
            if (rs.next()) {
            // Nếu có kết quả, lấy giá trị mật khẩu
            id = rs.getInt("GroupID");
        }
        // Kiểm tra xem có kết quả nào không
        
            // Nếu có kết quả, lấy giá trị mật khẩu
        return (int)id;
    } catch (SQLException e) {
       // In lỗi ra console để kiểm tra
    }
    
  // Trả về mật khẩu hoặc null nếu không tìm thấy
        return id;
}
 
}
