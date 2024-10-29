/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import com.oracle.wls.shaded.org.apache.bcel.generic.AALOAD;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Chitietdonhang;

/**
 *
 * @author buigi
 */
public class Chitietdonhangdal {

    public List<Chitietdonhang> getAll(String username) {
      String sql = "SELECT Gia, Ten, ID FROM ChiTietDonHang WHERE Username = ?";
           List<Chitietdonhang> a= new ArrayList<>();
        try {
            DBcontext db = new DBcontext();
            PreparedStatement st = db.connection.prepareStatement(sql);
            st.setString(1, username);
           ResultSet rs= st.executeQuery();
           while(rs.next()){
           Chitietdonhang c= new Chitietdonhang(rs.getInt("ID"),rs.getString("Ten"),rs.getInt("Gia")); 
           a.add(c);
           }
           
        } catch (Exception e) {

        }
        return a;
    }

    public void add(String tK, int idsp, int gia, String ten) {
        String sql = "INSERT INTO [dbo].[ChiTietDonHang]\n"
                + "           ([Username]\n"
                + "           ,[SPID]\n"
                + "           ,[Gia]\n"
                + "           ,[Ten])\n"
                + "     VALUES\n"
                + "           (?,?,?,?)";
        try {
            DBcontext db = new DBcontext();
            PreparedStatement st = db.connection.prepareStatement(sql);
            st.setString(1, tK);
            st.setInt(2, idsp);
            st.setInt(3, gia);
            st.setString(4, ten);
            st.executeUpdate();
        } catch (Exception e) {

        }
    }

    public int findandSum(String tK) {
        String sql = "SELECT \n"
                + "    SUM(Gia) AS TongTien\n"
                + "FROM \n"
                + "    ChiTietDonHang\n"
                + "WHERE \n"
                + "    Username = ?;";
        int tongTien = (int) 0;
        try {
            DBcontext db = new DBcontext();
            PreparedStatement st = db.connection.prepareStatement(sql);
            st.setString(1, tK);

            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                tongTien = (int) rs.getInt("TongTien");
            }

        } catch (SQLException e) {
            System.out.println(e);
        }
        return tongTien;
    }
 public void deletebyID(int id) {
           String sql = "DELETE  FROM [dbo].[ChiTietDonHang]\n" +
"      WHERE id=?";
     
        try {
            DBcontext db = new DBcontext();
            PreparedStatement st = db.connection.prepareStatement(sql);
            st.setInt(1, id);
            st.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
      
    }
 
  public void deletebyUser(String U) {
           String sql = "DELETE  FROM [dbo].[ChiTietDonHang]\n" +
"      WHERE Username=?";
     
        try {
            DBcontext db = new DBcontext();
            PreparedStatement st = db.connection.prepareStatement(sql);
            st.setString(1, U);
            st.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
      
    }
    public static void main(String[] args) {
         Chitietdonhangdal a=new Chitietdonhangdal();
       List<Chitietdonhang> ds=a.getAll("admin");
        for(Chitietdonhang x:ds){
            System.out.println(x.getId()+" "+ x.getTen()+" " +x.getGia());
        }
    }
}
