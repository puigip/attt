import java.util.Scanner;

public class NewClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Mảng để lưu 94 chuỗi ASCII
        String[] asciiInputs = new String[94];
        
        // Nhập 94 chuỗi ASCII từ người dùng
        for (int i = 0; i < 94; i++) {
            asciiInputs[i] = scanner.nextLine();
        }
        
        // Chuyển đổi và in kết quả
        for (String ascii : asciiInputs) {
            String hexOutput = asciiToHex(ascii);
            System.out.println(hexOutput);
        }
        
        scanner.close(); // Đóng Scanner
    }

    // Phương thức chuyển đổi chuỗi ASCII thành chuỗi hex
    private static String asciiToHex(String ascii) {
        StringBuilder hexString = new StringBuilder();
        for (char c : ascii.toCharArray()) {
            String hex = Integer.toHexString(c);
            if (hex.length() == 1) hexString.append('0'); // Thêm '0' nếu cần
            hexString.append(hex); // Không thêm khoảng trắng
        }
        return hexString.toString(); // Trả về chuỗi hex
    }
}
