import java.util.Base64;
import java.util.Arrays;
import java.util.List;

public class JavaApplication5 {
    public static void main(String[] args) {
        String md5Part = "3dac93b8cd250aa8c1a36fffc79a17a"; // Chuỗi MD5 thiếu ký tự cuối
        // Danh sách 94 ký tự
        List<Character> fuzzCharacters = Arrays.asList(
            '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', // Các ký tự số
            'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', // Các ký tự chữ thường
            'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', // Các ký tự chữ hoa
            '!', '"', '#', '$', '%', '&', '\'', '(', ')', '*', '+', ',', '-', '.', '/', ':', ';', '<', '=', '>', '?', '@', '[', '\\', ']', '^', '_', '{', '|', '}', '~' // Các ký tự đặc biệt
        );

        // Biến lưu kết quả
        StringBuilder results = new StringBuilder();

        // Thử từng ký tự trong danh sách
        for (char c : fuzzCharacters) {
            String md5Full = md5Part + c; // Kết hợp MD5 với ký tự fuzz
            String base64Encoded = encodeToBase64(md5Full); // Mã hóa thành Base64
            results.append(base64Encoded).append("\n"); // Thêm vào kết quả
        }

        // In kết quả
        System.out.println(results.toString());
    }

    private static String encodeToBase64(String md5Full) {
        // Mã hóa thành Base64
        return Base64.getEncoder().encodeToString(md5Full.getBytes());
    }
}
