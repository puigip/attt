/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package huongdoituong;

import java.util.Scanner;

/**
 *
 * @author buigi
 */
public class j05027 {

  public static class Gv{
      String ma,ten;
      String nganh="";

        public Gv(String ma, String ten, String nganh) {
            this.ma = ma;
            this.ten = ten;
            nganh=nganh.trim();
            String a[]= nganh.split("\\s+");
            for(String x:a){
                this.nganh+=x.substring(0,1).toUpperCase();
            }
            
        }

        public String getTen() {
            return ten;
        }
      
     
        @Override
        public String toString() {
            return  ma +" "+ ten +" "+nganh;
        }
      
  }
  public static boolean check(String a,String b){
      a=a.toLowerCase();
      b=b.toLowerCase();
      if(a.contains(b)) return true;
      else return false ;
  }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Gv[] a=new Gv[n];
        sc.nextLine();
        for(int i=0;i<n;i++){
            String ma="GV";
            if(i<9) ma+="0"+(i+1);
            else ma+=(i+1);
            a[i]=new Gv(ma,sc.nextLine(),sc.nextLine());
        }
//        for(Gv x: a){
//            System.out.println(x.toString());
//        }
        int q=sc.nextInt();
        for(int i=0;i<q;i++){
            String x=sc.next();
            System.out.println("DANH SACH GIANG VIEN THEO TU KHOA "+x+":");
            for(int ii=0;ii<n;ii++){
                 if(check(a[ii].getTen(),x)) System.out.println(a[ii].toString());
            }
        }
       
    }
}

