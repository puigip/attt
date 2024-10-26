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
public class j04018 {
    public static class Sp{
        int t,a;

        public Sp(int t, int a) {
            this.t = t;
            this.a = a;
        }
        public int getT() {
            return t;
        }
        public int getA() {
            return a;
        }
        public Sp nhan(Sp khac){
         int thuc=this.t * khac.getT() - this.a*khac.getA();
         int ao = this.t*khac.getA() + this.a*khac.getT();
           Sp kq=new Sp(thuc,ao);
            return kq;
        }
        public Sp cong(Sp khac){
            int thuc=this.t+khac.getT();
            int ao=this.a+khac.getA();
            Sp kq= new Sp(thuc,ao);
            return kq;
        }

        @Override
        public String toString() {
             String tmp="";
             tmp+=t;
             if(a>=0) tmp+=" + "+a+"i";
             else tmp+=" - "+Math.abs(a)+"i";
            return tmp;
        }
        
    }
    
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            Sp a=new Sp(sc.nextInt(),sc.nextInt());
            Sp b=new Sp(sc.nextInt(),sc.nextInt());
            Sp c=a.cong(b).nhan(a);
            Sp d=a.cong(b); 
            d=d.nhan(d);
            System.out.println(c+", "+d);
        }
        
    }
}
