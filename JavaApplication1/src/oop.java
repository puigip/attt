
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author buigi
 */
public class oop {
    public static void main(String[] args) {
        // xử lí ngoại lệ
        
        // kiểu gặp lỗi nma vẫn muốn chtrinh chạy
        //Lỗi null pointer exception lỗi khó sửa
        Scanner sc = new Scanner(System.in);
        try{ // try loi thi nhay vao catch
            int a= sc.nextInt(),b=sc.nextInt();
            // if neu b=0 loi
            System.out.println(a/b);
        }catch(ArithmeticException ex){
            System.out.println("Loi"+ex.getMessage()); // in ra loi gi
            ex.printStackTrace(); // in ra loi o dong nao
            System.out.println("Giap");
        }finally{
            // phai nhay vao du co catch hay try 
        } 
        // CLASS Sách
        // object : tác giả , địa chỉ , ngày xuât bản ... 
        //public private 
        // object chia ra 2 loại là data field và behavier ( method) 
        //
        
    }
    
}
