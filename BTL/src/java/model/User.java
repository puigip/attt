/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author buigi
 */
public class User {
     String tk,mk,ten,diachi,sdt;
      int group;
      int tien;
    public User(String tk, String mk, String ten, String diachi, String sdt, int group) {
        this.tk = tk;
        this.mk = mk;
        this.ten = ten;
        this.diachi = diachi;
        this.sdt = sdt;
        this.group = group;
    }

    public User(String tk, String mk, String ten, String diachi, String sdt, int group, int tien) {
        this.tk = tk;
        this.mk = mk;
        this.ten = ten;
        this.diachi = diachi;
        this.sdt = sdt;
        this.group = group;
        this.tien = tien;
    }

    public String getTk() {
        return tk;
    }

    public int getTien() {
        return tien;
    }

    public String getMk() {
        return mk;
    }

    public String getTen() {
        return ten;
    }

    public String getDiachi() {
        return diachi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setTk(String tk) {
        this.tk = tk;
    }

    public void setMk(String mk) {
        this.mk = mk;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public int getGroup() {
        return group;
    }

}
