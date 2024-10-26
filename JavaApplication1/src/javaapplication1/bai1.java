import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class bai1 {
   public static String change1(String s){
         String[] t=s.split("\\s+");
       for(int i=0;i<t.length;i++){                                                                                                                                             
         if (t[i].length() > 0) {  // Kiểm tra từ không rỗng
                // Chuyển ký tự đầu tiên thành in hoa và phần còn lại thành in thường
                t[i] = t[i].substring(0, 1).toUpperCase() + t[i].substring(1).toLowerCase();
            }
       }
       String tmp="";
       for(int i=0;i<t.length;i++){
           tmp+=t[i]+" ";
       }
          return tmp; 
   }

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int t=sc.nextInt();
       sc.nextLine();
       ArrayList<String> s = new ArrayList<String>();
       while(t-- >0){
         s.add(sc.nextLine());
       }
       for(int i=0;i<s.size();i++){
              s.set(i,s.get(i).trim());
            s.set(i, change1(s.get(i)));  // Cập nhật chuỗi đã thay đổi
       }
       for(int i=0;i<s.size();i++){
           System.out.println(s.get(i));
       }
    }
}
