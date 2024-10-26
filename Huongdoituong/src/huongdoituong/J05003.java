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
public class J05003 {
    
    public static class sv{
        String ma,ten,lp,sinh;
        double diem;

        public sv(String ma, String ten, String lp, String sinh, double diem) {
            this.ma = ma;
            this.ten = ten;
            this.lp = lp;
            this.sinh = sinh;
            this.diem = diem;
        }
        public void chuanhoa(){
           String a=this.ten;   
           a=a.trim();
           String[] arr = a.split("\\s+");
           String tmp="";
           for(String x :arr){
               tmp+=x.substring(0,1).toUpperCase()+x.substring(1,x.length()).toLowerCase();
               tmp+=" ";
           }
           tmp=tmp.trim();
           this.ten=tmp;
           if(this.sinh.charAt(2)!='/') this.sinh="0"+this.sinh;
           if(this.sinh.charAt(5)!='/') this.sinh=this.sinh.substring(0,3)+"0"+this.sinh.substring(3,this.sinh.length());
        }

        public double getDiem() {
            return diem;
        }

       
        public String toString() {
            return  ma+" "+ten+" "+lp+" "+sinh+" "+String.format("%.2f", diem);
        }
    }
    
    public static void main(String args[]) {
       Scanner sc=new Scanner(System.in);
       int t= sc.nextInt();
       sv[] a=new sv[t];
       for(int i=0;i<t;i++){
           sc.nextLine();
           String ma="";
           if(i<9) ma+="B20DCCN00"+(i+1);
           else ma+="B20DCCN0"+(i+1);
           a[i]=new sv(ma,sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextDouble());
           a[i].chuanhoa();
       }
       Arrays.sort(a,new Comparator<sv>(){ // chú ý tới kiểu trả về hàm compare
           @Override
           public int  compare(sv o1, sv o2) {
                   return (int)(o2.getDiem()*10000-o1.getDiem()*10000);
           }
           
       });
      for(sv x:a){
          System.out.println(x.toString());
      }
    }
}  
