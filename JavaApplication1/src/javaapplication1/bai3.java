import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class bai3 {

    // Hàm kiểm tra chuỗi có phải là số hợp lệ (chỉ chứa chữ số)
    public static boolean isValidNumber(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // Biến tổng để tính tổng các số nguyên hợp lệ
        long sum = 0;
        TreeMap<Integer,Integer> mp=new TreeMap<>();
        // Sử dụng try-with-resources để tự động đóng file sau khi xử lý xong
        try (BufferedReader br = new BufferedReader(new FileReader("DATA.in"))) {

            String line;
            // Đọc từng dòng trong file
            while ((line = br.readLine()) != null) {
                // Tách các phần tử trong dòng dựa trên dấu cách hoặc các ký tự trắng
                String[] arr = line.split("\\s+");
                
                // Duyệt qua từng chuỗi sau khi tách
                for (String str : arr) {
                    // Kiểm tra nếu chuỗi hợp lệ và có thể chuyển thành số
                    if(mp.containsKey(Integer.valueOf(str))){
                        int g=mp.get(Integer.valueOf(str));
                        g++;
                        mp.put(Integer.valueOf(str), g);
                    }else {
                        mp.put(Integer.valueOf(str), 1);
                    }
                }
            }
        } catch (IOException e) {
       
            
        }
        

        Set<Map.Entry<Integer,Integer>> etr= mp.entrySet();
        for(Map.Entry<Integer,Integer> x :etr){
            System.out.println(x.getKey()+" "+x.getValue());
        }
    }
}
