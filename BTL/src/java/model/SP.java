/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author buigi
 */
public class SP {
     int id;
     String ten;
     int gia;
     String mota;
    String image;
    public SP(String ten, int gia, String mota,String image) {
        this.ten = ten;
        this.gia = gia;
        this.mota = mota;
      
        this.image=image;
    }

//    public SP(String ten, int gia, String mota, String image) {
//        this.ten = ten;
//        this.gia = gia;
//        this.mota = mota;
//        this.image = image;
//    }

    public SP(int id, String ten, int gia, String mota, String image) {
        this.id = id;
        this.ten = ten;
        this.gia = gia;
        this.mota = mota;
      
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public String getTen() {
        return ten;
    }

    public int getGia() {
        return gia;
    }

    public String getMota() {
        return mota;
    }

  
    public String getImage(){
        return image;
    }
     
}
