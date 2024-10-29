/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.util.ArrayList;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.SP;

/**
 *
 * @author buigi
 */
public class SPDal {

    public List<SP> getAll() {
        List<SP> list = new ArrayList<>();
        String sql = "select * from SanPham";
        try {
            DBcontext db = new DBcontext();
            PreparedStatement st = db.connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                SP c = new SP(rs.getInt("ID"), rs.getString("Ten"), rs.getInt("Gia"), rs.getString("MoTa"), rs.getString("Image"));
                list.add(c);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return list;
    }

    public void add(SP a) {
        String sql = "INSERT INTO [dbo].[SanPham]\n"
                + "           ([Ten]\n"
                + "           ,[Gia]\n"
                + "           ,[MoTa]\n"
                + "           ,[Image])\n"
                + "     VALUES\n"
                + "           (?,?,?,?)";

        try {
            DBcontext db = new DBcontext();
            PreparedStatement st = db.connection.prepareStatement(sql);
            st.setString(1, a.getTen());
            st.setInt(2, a.getGia());
            st.setString(3, a.getMota());
            st.setString(4, a.getImage());
            st.executeUpdate();
        } catch (Exception e) {

        }
    }

    //id tự tăng , 0 , 1 nếu là 
//    public void setinfo(int id, int flag, String a, String c, int b) {
//        if (flag == 0) { // chinh sửa string
//            String sql = "UPDATE [dbo].[SanPham]\n"
//                    + "   SET \n"
//                    + "         [?]='?' \n"
//                    + " WHERE [ID] = ?;";
//
//            try {
//                DBcontext db = new DBcontext();
//                PreparedStatement st = db.connection.prepareStatement(sql);
//                st.setString(1, a);
//                st.setString(2, c);
//                st.setInt(3, id);
//                st.executeUpdate();
//            } catch (Exception x) {
//
//            }
//        } else {
//            String sql = "UPDATE [dbo].[SanPham]\n"
//                    + "   SET \n"
//                    + "         [MaDanhMuc]='?' \n"
//                    + " WHERE [ID] = ?;";
//            try {
//                DBcontext db = new DBcontext();
//                PreparedStatement st = db.connection.prepareStatement(sql);
//                st.setInt(1, b);
//                st.setInt(2, id);
//                st.executeUpdate();
//            } catch (Exception e) {
//
//            }
//        }
//    }
    public void delete(int id) {
        String sql = "delete from SanPham where id=?";
        try {
            DBcontext db = new DBcontext();
            PreparedStatement st = db.connection.prepareStatement(sql);
            st.setInt(1, id);
            st.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }

    }

    public static void main(String[] args) {
        SPDal c = new SPDal();
        SP a = new SP("123", 123, "hh", "sdafsd/dsfa");
        c.add(a);
    }
}
