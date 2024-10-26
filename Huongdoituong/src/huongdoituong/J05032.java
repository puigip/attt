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
public class J05032 {

   public static class ng{
    String ten,sinh;

        public ng(String ten, String sinh) {
            this.ten = ten;
            this.sinh = sinh;
        }
       public int tuoi(){
           String tmp[]=this.sinh.split("/");
           int n=Integer.parseInt(tmp[2])*360+Integer.parseInt(tmp[1])*30+Integer.parseInt(tmp[0]);
           return n;
       }
}
    public static void main(String args[]) {
        Scanner sc= new Scanner (System.in);
        int n=sc.nextInt();
        ng[] a=new ng[n];
        sc.nextLine();
        for(int i=0;i<n;i++){
            a[i]=new ng(sc.next(),sc.next());
        }
       Arrays.sort(a,new Comparator<ng>(){
            @Override
            public int compare(ng o1, ng o2) {
                return o1.tuoi()-o2.tuoi();
            }
           
       });
        System.out.println(a[n-1].ten+"\n"+a[0].ten); 
    }
}

