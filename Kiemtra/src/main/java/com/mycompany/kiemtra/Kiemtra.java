import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Scanner;

public class Kiemtra {
    
    // Hàm để mã hóa MD5 một chuỗi
    public static String md5(String input) {
        try {
            // Tạo đối tượng MessageDigest với MD5
            MessageDigest md = MessageDigest.getInstance("MD5");
            
            // Thực hiện băm chuỗi
            byte[] messageDigest = md.digest(input.getBytes());
            
            // Chuyển đổi byte thành chuỗi hex
            StringBuilder hexString = new StringBuilder();
            for (byte b : messageDigest) {
                hexString.append(String.format("%02x", b));
            }
            
            return hexString.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> tmp = new ArrayList<>();
        String k = "3dac93b8cd250aa8c1a36fffc79a17a";
        
        // Nhập 95 chuỗi từ người dùng và thêm vào chuỗi k
        for (int i = 0; i < 95; i++) {
            String x = scanner.nextLine();  // Nhập phần thêm vào
            String tmp2 = k + x;  // Ghép chuỗi
            tmp.add(tmp2);  // Lưu vào tmp
        }
        
        // Tạo danh sách kết quả đã mã hóa
        ArrayList<String> kq = new ArrayList<>();
        for (String hashStr : tmp) {
            String md5Hash = md5(hashStr);  // Mã hóa MD5 mỗi phần tử trong tmp
            kq.add(md5Hash);  // Lưu kết quả vào kq
        }
        
        // In các kết quả đã mã hóa
        for (String res : kq) {
            System.out.println(res);
        }
        
        scanner.close();
    }
}
