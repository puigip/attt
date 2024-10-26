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
public class j05009 {
     public static class Sv{
         int ma;
         String ten,sinh;
         double diem1,diem2,diem3,diem;

        public Sv(int ma, String ten, String sinh, double diem1, double diem2, double diem3) {
            this.ma = ma;
            this.ten = ten;
            this.sinh = sinh;
            this.diem1 = diem1;
            this.diem2 = diem2;
            this.diem3 = diem3;
            this.diem=this.diem1+this.diem2+this.diem3;
        }

        public double getDiem() {
            return diem;
        }

        @Override
        public String toString() {
            return ma+" "+ten+" " +sinh+" "+diem;
        }
        
         
     }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        Sv[] a=new Sv[n];
        for(int i=0;i<n;i++){
            sc.nextLine();
            a[i]=new Sv(i+1,sc.nextLine(),sc.nextLine(),sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
        }
       Arrays.sort(a,new Comparator<Sv>(){
            @Override
            public int compare(Sv o1, Sv o2) {
                return (int)(o2.getDiem()*10000+o1.getDiem()*10000);
            }
           
       });
       double m=0;
       for(Sv x:a){
           m=Math.max(m, x.getDiem());
       }
       for(Sv x:a){
           if(x.getDiem()==m) System.out.println(x.toString());
       }
    }
}
