/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author buigi
 */
public class NguoiDung {
    int id;
    String ten,username, password;
    public NguoiDung(int id,String ten, String username, String password){
        this.id=id;
        this.ten = ten;
        this.username = username;
        this.password = password;
    }

    public NguoiDung() {
    }

    public NguoiDung(String ten, String username, String password) {
        this.ten = ten;
        this.username = username;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public String getTen() {
        return ten;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
    
}
