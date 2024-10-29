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
            while (rs.next()) {
                User c = new User(rs.getString("TK"), rs.getString("MK"), rs.getString("HoTen"), rs.getString("DiaChi"), rs.getString("SDT"), rs.getInt("GroupID"));
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

    public int timKiemtk(String username) {
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
        } catch (Exception e) {
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
        int id = 2;
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
            return (int) id;
        } catch (SQLException e) {
            // In lỗi ra console để kiểm tra
        }

        // Trả về mật khẩu hoặc null nếu không tìm thấy
        return id;
    }

    public List<User> getAll1(String tK) {
        List<User> list = new ArrayList<>();
        String sql = "select * from Users where TK=?";
        try {
            DBcontext db = new DBcontext();
            PreparedStatement st = db.connection.prepareStatement(sql);
            st.setString(1, tK);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                User c = new User(rs.getString("TK"), rs.getString("MK"), rs.getString("HoTen"), rs.getString("DiaChi"), rs.getString("SDT"),rs.getInt("GroupID") ,rs.getInt("Tien"));
                list.add(c);
             
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return list;
    }

    public void changeP(String tK, String p) {

        String sql = "UPDATE Users SET MK = ? WHERE TK = ?";

        try {
            DBcontext db = new DBcontext();
            PreparedStatement st = db.connection.prepareStatement(sql);
            st.setString(1, p);
            st.setString(2, tK);
            st.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e);
        }

    }
     public void changeT(String tK,int T) {

        String sql = "UPDATE Users SET Tien = ? WHERE TK = ?";

        try {
            DBcontext db = new DBcontext();
            PreparedStatement st = db.connection.prepareStatement(sql);
            st.setInt(1, T);
            st.setString(2, tK);
            st.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e);
        }

    }

    public void Nap(String ten, int tien) {
        String sql = "UPDATE Users\n"
                + "SET Tien = Tien + ? \n"
                + "WHERE TK = ?; ";
        try{
            DBcontext db=new DBcontext();
            PreparedStatement st=db.connection.prepareStatement(sql);
            st.setInt(1,tien);
            st.setString(2,ten);
            st.executeUpdate();
        }catch (Exception e){
            
        }
        
    }
 public int sumTien(String Username) {
        String sql = "select * from Users Where TK=?";
        int tien=0;
        try{
            DBcontext db=new DBcontext();
            PreparedStatement st=db.connection.prepareStatement(sql);
            st.setString(1,Username);
            ResultSet rs=st.executeQuery();
            tien =rs.getInt("Tien");
            st.executeUpdate();
        }catch (Exception e){
            
        }
        return tien;
    }
    public static void main(String[] args) {
        UserDal a = new UserDal();
        if(a.getAll1("admin").size()>=1)System.out.println(a.getAll1("wiener").get(0).getTien());
    }

}
