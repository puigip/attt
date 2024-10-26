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
public class J05042 {

    /**
     * @param args the command line arguments
     */
    public static class SV{
        String ten;
        int dung,nop;

        public SV(String ten, int dung, int nop) {
            this.ten = ten;
            this.dung = dung;
            this.nop = nop;
        }

        public String getTen() {
            return ten;
        }

        public int getDung() {
            return dung;
        }

        public int getNop() {
            return nop;
        }

        @Override
        public String toString() {
            return ten + " " + dung + " " + nop ;
        }
        
    }
    public static void main(String args[]) {
        // TODO code application logic here
        Scanner sc= new Scanner (System.in);
        int n=sc.nextInt();
        SV[] a=new SV[n];
        for(int i=0;i<n;i++){
            sc.nextLine();
            a[i]=new SV(sc.nextLine(),sc.nextInt(),sc.nextInt());
        }
       Arrays.sort(a,new Comparator<SV>(){
            @Override
            public int compare(SV o1, SV o2) {
                if(o1.getDung()!=o2.getDung()) return o2.getDung()-o1.getDung();
                else {
                    if(o1.getNop()!=o2.getNop()) return o1.getNop()-o2.getNop();
                    else {
                        return o1.getTen().compareTo(o2.getTen());
                    }
                }
            }
           
       });
       for(SV x:a){
           System.out.println(x.toString());
       }
    }
}
