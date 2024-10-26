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
  class tg{
    int gi,ph,giay;

    public tg(int gi, int ph, int giay) {
        this.gi = gi;
        this.ph = ph;
        this.giay = giay;
    }

    public int getGi() {
        return gi;
    }

    public int getPh() {
        return ph;
    }

    public int getGiay() {
        return giay;
    }

    @Override
    public String toString() {
        return  gi + " " + ph + " " + giay ;
    }
    
}
public class J05033 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       Scanner sc= new Scanner(System.in);
       int t=sc.nextInt();
        tg[] a=new tg[t];
  
        for(int i=0;i<t;i++){
            a[i]=new tg(sc.nextInt(),sc.nextInt(),sc.nextInt());
        }
       Arrays.sort(a ,new Comparator<tg>(){
           @Override
           public int compare(tg o1, tg o2) {
               if(o1.getGi()!=o2.getGi()) return o1.getGi()-o2.getGi();
               else {
                   if(o1.getPh()!=o2.getPh()) return o1.getPh()-o2.getPh();
                   else {
                     return o1.getGiay()-o2.getGiay();
                   }
               }
           }
       });
       for(int i=0;i<t;i++){
           System.out.println(a[i].toString());
       }
    }
}
