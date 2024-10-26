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
public class J05038 {

    /**
     * @param args the command line arguments
     */
    public static class NV{
        String ma,ten;
        int luongngay,songaycong;
        String chucvu;
        int luongthang;
        int thuong=0;
        int phucap=0;
        int linh;
        public NV(String ma, String ten, int luongngay, int songaycong, String chucvu) {
            this.ma = ma;
            this.ten = ten;
            this.luongngay = luongngay;
            this.songaycong = songaycong;
            this.chucvu = chucvu;
            
            this.luongthang=this.luongngay*this.songaycong;
            if(this.songaycong>=25) this.thuong=(int)Math.round((float)this.luongthang*0.2);
            if(this.songaycong>=22&&this.songaycong<25) this.thuong=(int)Math.round((float)this.luongthang*0.1);
            if(this.chucvu.equals("GD")) this.phucap=250000;
            if(this.chucvu.equals("PGD")) this.phucap=200000;
            if(this.chucvu.equals("TP")) this.phucap=180000;
            if(this.chucvu.equals("NV")) this.phucap=150000;
            this.linh=this.luongthang+this.thuong+this.phucap;
        }

        @Override
        public String toString() {
            return ma+" "+ten+" "+luongthang+" "+thuong+" "+phucap+" "+linh;
        }

        public int getLinh() {
            return linh;
        }
        
        
        
    }
    
    public static void main(String args[]) {
        // TODO code application logic here
        Scanner sc= new Scanner (System.in);
        int n=sc.nextInt();
        NV[] a= new NV[n];   sc.nextLine();
        for(int i=0;i<n;i++){
         
            String ma="NV"+String.format("%02d", i+1);
            String x=sc.nextLine();
            int luongngay=sc.nextInt();
            int cong=sc.nextInt();
            sc.nextLine();
            String cv=sc.nextLine();
            a[i]=new NV(ma,x,luongngay,cong,cv);
        }
        int sum=0;
        Arrays.sort(a,new Comparator<NV> (){
            @Override
            public int compare(NV o1, NV o2) {
                return o2.getLinh()-o1.getLinh();
            }
            
        });
        for(NV x: a){
            System.out.println(x.toString());
            sum+=x.getLinh();
        }
//        System.out.println("Tong chi phi tien luong: "+sum);
    }
}
