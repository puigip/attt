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
import model.NguoiDung;
import dal.DBcontext;

/**
 *
 * @author buigi
 */
public class NguoiDungDal {

    // 
    public ArrayList<NguoiDung> getAll() {
        ArrayList<NguoiDung> list = new ArrayList<>();
        String sql = "select * from NguoiMua";
        try {
            DBcontext db = new DBcontext();
            PreparedStatement st = db.connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                NguoiDung c = new NguoiDung(rs.getInt("id"), rs.getString("ten"), rs.getString("username"), rs.getString("password"));
                list.add(c);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return list;
    }

    public void insert(NguoiDung c) {
        String sql = "INSERT INTO [dbo].[NguoiMua] (Ten, Username, Password)\n"
                + "VALUES (?,?,?);";
        try {
            DBcontext db = new DBcontext();
            PreparedStatement st = db.connection.prepareStatement(sql);
            st.setString(1, c.getTen());
            st.setString(2, c.getUsername());
            st.setString(3, c.getPassword());
            st.executeUpdate(); 
        } catch (SQLException e){
            System.out.println(e);
        }
    }

    public void delete(int id) {
        String sql = "DELETE FROM [dbo].[NguoiMua]\n"
                + "      WHERE id=?";
        try{
            DBcontext db=new DBcontext();
            PreparedStatement st=db.connection.prepareStatement(sql);
            st.setInt(1,id);
            st.executeUpdate();
        }catch(Exception x){
            System.out.println(x);
        }
    }
//    public static void main(String[] args) {
//        ArrayList<NguoiDung> list = new ArrayList<>();
//        NguoiDungDal dao=new NguoiDungDal();
//        list=dao.getAll();
//        for(NguoiDung x:list){
//            System.out.println(x.getId());
//        }
//        
//    }
}
