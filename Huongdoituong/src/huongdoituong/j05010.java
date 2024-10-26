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
public class j05010 {

    public static class MH{
        int ma;
        String ten;
        String loai;
        double m;
        double b;
        double lai;
        public MH(int ma, String ten, String loai, double m, double b) {
            this.ma = ma;
            this.ten = ten;
            this.loai = loai;
            this.m = m;
            this.b = b;
            this.lai=this.b-this.m;
        }

        public double getLai() {
            return lai;
        }

        @Override
        public String toString() {
            return ma+" "+" "+ten+" "+loai+" "+ String.format("%.2f",lai);
        }
        
        
    }
    
    public static void main(String args[]) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       MH[] a= new MH[n];
       for(int i=0;i<n;i++){
           sc.nextLine();
           a[i]=new MH(i+1,sc.nextLine(),sc.nextLine(),sc.nextDouble(),sc.nextDouble());
       }
       Arrays.sort(a,new Comparator<MH>(){
           @Override
           public int compare(MH o1, MH o2) {
              return (int)(o2.getLai()*10000-o1.getLai()*10000);
           }
           
       });
       for(MH x: a){
           System.out.println(x.toString());
       }
    }
}
