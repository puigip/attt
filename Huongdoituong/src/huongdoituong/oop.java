/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package huongdoituong;

import java.util.Scanner;

/**
 *
 * @author buigi
 */
     class Diem{
  private  double x,y;
  public void set(double a,double b){
      x=a;
      y=b;
  }
  public double t(){
      return this.x;
  }
  public double h(){
    return this.y;
}
}

public class oop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            Diem s1=new Diem();
            Diem s2=new Diem();
            s1.set(sc.nextDouble(), sc.nextDouble());
            s2.set(sc.nextDouble(), sc.nextDouble());
            double kc=(s1.h()-s2.h())*(s1.h()-s2.h())+(s1.t()-s2.t())*(s1.t()-s2.t());
           System.out.printf("%.4f",Math.sqrt(kc)); System.out.print("\n");
        }
    }
}
