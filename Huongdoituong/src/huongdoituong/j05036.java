import java.util.Scanner;

public class CuaHangTapHoa {

    // Lớp quản lý mặt hàng
    public static class MatHang {
        String ma, ten, donVi;
        int donGiaNhap, soLuong, phiVanChuyen, thanhTien, giaBan;

        public MatHang(int maSo, String ten, String donVi, int donGiaNhap, int soLuong) {
            this.ma = "MH" + String.format("%02d", maSo);  // Định dạng mã hàng như MH01, MH02,...
            this.ten = ten;
            this.donVi = donVi;
            this.donGiaNhap = donGiaNhap;
            this.soLuong = soLuong;

            // Tính phí vận chuyển
            this.phiVanChuyen = (int) Math.round(donGiaNhap * soLuong * 0.05);
            
            // Tính thành tiền
            this.thanhTien = (int) Math.round(donGiaNhap * soLuong + phiVanChuyen);
            
            // Tính giá bán
            this.giaBan = (int) Math.round(thanhTien * 1.02);
        }

        @Override
        public String toString() {
            return ma + " " + ten + " " + donVi + " " + phiVanChuyen + " " + thanhTien + " " + giaBan;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Đọc số lượng mặt hàng
        int n = sc.nextInt();
        sc.nextLine();  // Bỏ qua dòng trống sau khi nhập số lượng

        // Tạo mảng lưu trữ danh sách mặt hàng
        MatHang[] danhSachMatHang = new MatHang[n];

        // Nhập thông tin các mặt hàng
        for (int i = 0; i < n; i++) {
            String ten = sc.nextLine();
            String donVi = sc.nextLine();
            int donGiaNhap = Integer.parseInt(sc.nextLine());
            int soLuong = Integer.parseInt(sc.nextLine());

            // Tạo đối tượng mặt hàng và thêm vào danh sách
            danhSachMatHang[i] = new MatHang(i + 1, ten, donVi, donGiaNhap, soLuong);
        }

        // In ra kết quả
        for (MatHang mh : danhSachMatHang) {
            System.out.println(mh.toString());
        }

        sc.close();
    }
}
