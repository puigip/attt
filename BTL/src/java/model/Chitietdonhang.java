/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author buigi
 */
public class Chitietdonhang {
    /*
    CREATE TABLE ChiTietDonHang (
    ID INT IDENTITY(1,1) PRIMARY KEY  ,   -- Mã tự động tăng cho từng chi tiết đơn hàng 
    Username VARCHAR(50) ,               -- Tên tài khoản người dùng 
    SPID INT  ,                         -- Mã sản phẩm (khóa ngoại tham chiếu đến bảng HangHoa) 
    Gia INT , 
    -- Giá của sản phẩm tại thời điểm mua 
    */
    int id;String tK;int spid;int gia;
    String tensp;
    public Chitietdonhang(int id, String tK, int spid, int gia,String ten) {
        this.id = id;
        this.tK = tK;
        this.spid = spid;
        this.gia = gia;
        this.tensp=ten;
    }

    public Chitietdonhang(int id ,String tensp,int gia) {
        this.id=id;
        this.gia = gia;
        this.tensp = tensp;
    }
    

    public int getId() {
        return id;
    }

    public String gettK() {
        return tK;
    }

    public String getTen() {
        return tensp;
    }


    public int getSpid() {
        return spid;
    }

    public int getGia() {
        return gia;
    }
    
}
