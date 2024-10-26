/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package huongdoituong;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author buigi
 */
public class j05006 {

    public static class NV{
        String ma,ten,gt,sinh,diachi,thue,ngayki;

        public NV(String ma, String ten, String gt, String sinh, String diachi, String thue, String ngayki) {
            this.ma = ma;
            this.ten = ten;
            this.gt = gt;
            this.sinh = sinh;
            this.diachi = diachi;
            this.thue = thue;
            this.ngayki = ngayki;
        }

        public int getSinh(){
            String[] tmp=this.sinh.split("/");
            int n=Integer.parseInt(tmp[2])*360+Integer.parseInt(tmp[1])*30+Integer.parseInt(tmp[0]); return n; // chuyen ve integer 
        }
        public String toString() {
            return ma +" "  + ten + " " + gt + " " + sinh +" " + diachi + " " + thue + " " + ngayki ;
        }
        
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        NV[] a= new NV[n]; sc.nextLine();
        for(int i=0;i<n;i++){
            String ma="";
            if(i<9)ma+="0000"+(i+1);
            else ma+="000"+(i+1);
            a[i]=new NV(ma,sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine()); 
        }
        Arrays.sort(a,new Comparator<NV>(){
            @Override
            public int compare(NV o1, NV o2) {
               return o1.getSinh()-o2.getSinh();
            }
            
        });
        for(NV x:a){
            System.out.println(x);
        }
       
    }
}


