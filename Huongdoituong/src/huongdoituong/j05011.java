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
public class j05011 {

    /**
     * @param args the command line arguments
     **/
    
    public static class HH{
        String ma,ten,vao,ra;
        String tg;
        int tt;
        public HH(String ma, String ten, String vao, String ra) {
            this.ma = ma;
            this.ten = ten;
            this.vao = vao;
            this.ra = ra;
            String[] a=this.vao.split(":");
            String[] b=this.ra.split(":");
            int tmp = Integer.parseInt(b[0])*60+Integer.parseInt(b[1])- Integer.parseInt(a[0])*60-Integer.parseInt(a[1]);
            this.tt=tmp;
            this.tg=tmp/60+" gio "+(tmp%60)+" phut";
        }
        public int getTt() {
            return tt;
        }

        @Override
        public String toString() {
            return  ma+" "+ten+" "+tg;
        }
       
        
    }
    public static void main(String args[]) {
     Scanner sc= new Scanner(System.in);
      int n=sc.nextInt();
      HH[] a = new HH[n];
      sc.nextLine();
      for(int i=0;i<n;i++){
          a[i]=new HH(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine());
      }
      Arrays.sort(a,new Comparator <HH>(){
         @Override
         public int compare(HH o1, HH o2) {
              return o2.getTt()-o1.getTt();
         }
      });
      for(HH x: a){
           System.out.println(x.toString());
      }
    }
}
