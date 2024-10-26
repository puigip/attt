/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package huongdoituong;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author buigi
 */
public class J05018 {

    public static class HS {

        String ma,ten;
        float diem1;
        float diem2;
        float diem3;
        float diem4;
        float diem5;
        float diem6;
        float diem7;
        float diem8;
        float diem9;
        float diem10;
        float diem;
         String xl="";
 
        public HS(String ma,String ten, float diem1, float diem2, float diem3, float diem4, float diem5, float diem6, float diem7, float diem8, float diem9, float diem10) {
            this.ma=ma;
            this.ten = ten;
            this.diem1 = diem1;
            this.diem2 = diem2;
            this.diem3 = diem3;
            this.diem4 = diem4;
            this.diem5 = diem5;
            this.diem6 = diem6;
            this.diem7 = diem7;
            this.diem8 = diem8;
            this.diem9 = diem9;
            this.diem10 = diem10;
            this.diem = diem1 + diem2 + diem3 + diem4 + diem5 + diem6 + diem7 + diem8 + diem9 + diem10;
//            this.diem=(float)Math.round((float)this.diem)*(float)0.1;
          this.diem/=10;
            if(this.diem>=9) this.xl="XUAT SAC";
            if(this.diem<9&&this.diem>=8) this.xl="GIOI";
            if(this.diem<8&&this.diem>=7) this.xl="KHA";
            if(this.diem<7&&this.diem>=5) this.xl="TB";
            if(this.diem<5) this.xl="YEU";
        }

        public float getDiem() {
            return diem;
        }

        @Override
        public String toString() {
            return  ma + " " + ten + " " + String.format("%.1f", diem) + " " + xl;
        }
                
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HS[] a= new HS[n];
        for(int i=0;i<n;i++){
            sc.nextLine();
            String ma="HS"+String.format("%02d", i+1);
            
            a[i]=new HS(ma, sc.nextLine(), sc.nextFloat(), sc.nextFloat() ,sc.nextFloat(), sc.nextFloat(), sc.nextFloat(), sc.nextFloat() ,sc.nextFloat(), sc.nextFloat(), sc.nextFloat(), sc.nextFloat());
        }
        Arrays.sort(a,new Comparator <HS>(){
            @Override
            public int compare(HS o1, HS o2) {
                return (int) (o2.getDiem()*10000-o1.getDiem()*10000);
            }
            
        }); for(HS x:a){
           System.out.println(  x.toString());

        }
        
    }
}
