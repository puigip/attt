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
public class J05081 {

    /**
     * @param args the command line arguments
     */
    public static class Sp{
        String ma,ten,dvt;
        int mua,ban,lai;

        public Sp(String ma, String ten, String dvt, int mua, int ban, int lai) {
            this.ma = ma;
            this.ten = ten;
            this.dvt = dvt;
            this.mua = mua;
            this.ban = ban;
            this.lai = lai;
        }

        public int getMua() {
            return mua;
        }

        public int getBan() {
            return ban;
        }

        public int getLai() {
            return lai;
        }

        public String getMa() {
            return ma;
        }

        @Override
        public String toString() {
            return  ma+" "+ ten+" "+ dvt+" " + mua + " " + ban +" "  + lai ; 
        }
        
        
    }
    
      
    public static void main(String args[]) {
       Scanner sc=new Scanner(System.in);
       int t=sc.nextInt();
       Sp[] a=new Sp[t];
       for(int i=0;i<t;i++){
           sc.nextLine();
           String ma="MH";
           if(i<10) ma+="00"+(i+1)+"";
           else ma+="0"+(i+1)+"";
           String tmp1=sc.nextLine();
           String tmp2=sc.nextLine();
           int mua=sc.nextInt();
           int ban=sc.nextInt();
           a[i]=new Sp(ma,tmp1,tmp2,mua,ban,ban-mua);
       }
       Arrays.sort(a,new Comparator <Sp>(){
           @Override
           public int compare(Sp o1, Sp o2) {
           if (o1.getLai() != o2.getLai()) {
                    // So sánh lợi nhuận giảm dần
                    return o2.getLai() - o1.getLai();
                } else {
                    // Nếu lợi nhuận bằng nhau, so sánh mã sản phẩm tăng dần
                    return o1.getMa().compareTo(o2.getMa());
                }
           }
       });
       for(int i=0;i<t;i++){
           System.out.println(a[i].toString());
       }
    }
}
