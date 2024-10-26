/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package huongdoituong;
/**
 *
 * @author buigi
 */
public class People {
        //data field
   private String a;
   private String b;
   private double u;
   int tmp=213;
   //behavier
   public void eat() { // khai bao method ;
            System.out.println("people eat");
    }
   public People(){ // constructor
            System.out.println("Ham khoi tao");
}
   public People(String a, String b, double u){ 
       // constructor cos tham so 
       // nếu tên tham số trùng với tên data field  dùng con trỏ this
       this.a = a;
       this.b =b ;
       this.u=u;
   }
       //lấy ra các data field 
   public String getGa(){
       return this.a;
   }

    public String getA() {
        return a;
    }

    public String getB() {
        return b;
    }

    public double getU() {
        return u;
    }

    public int getTmp() {
        return tmp;
    }

   
    public String toString() {
        return "People{" + "a=" + a + ", b=" + b + ", u=" + u + ", tmp=" + tmp + '}';
    }
  
}
