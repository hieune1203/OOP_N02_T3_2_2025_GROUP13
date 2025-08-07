package com.example.servingwebcontent.component;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import com.example.servingwebcontent.controller.GiaoDichController;
import com.example.servingwebcontent.model.GiaoDich;

public class GiaoDien {
    private GiaoDichController controller;
    private Scanner scanner;

    public GiaoDien() {
        scanner = new Scanner(System.in);
        controller = new GiaoDichController();
    }

    public void chay() {
        boolean tiepTuc = true;
        while (tiepTuc) {
            System.out.println("===== MENU =====");
            System.out.println("1. Nhập giao dịch");
            System.out.println("2. Hiển thị danh sách giao dịch");
            System.out.println("3. Thoát");
            System.out.print("Chọn chức năng: ");
        
        int luaChon = scanner.nextInt();
            scanner.nextLine(); 
            switch (luaChon) {
                case 1:
                    nhapGiaoDich();
                    break;
                case 2:
                    hienThiDanhSach();
                    break;
                case 3:
                    tiepTuc = false;
                    System.out.println("Đã thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng thử lại.");
            }
        }
    }

    private void nhapGiaoDich() {
        System.out.print("Mã khách hàng: ");
        String maKH = scanner.nextLine();

        System.out.print("Mã hàng hóa: ");
        String maHH = scanner.nextLine();

        System.out.print("Số lượng: ");
        int soLuong = Integer.parseInt(scanner.nextLine());

        System.out.print("Thành tiền: ");
        double thanhTien = Double.parseDouble(scanner.nextLine());

        Date ngayGD = new Date();
        controller.themGiaoDich(maKH, maHH, soLuong, thanhTien, ngayGD);
        System.out.println("✅ Giao dịch đã được thêm.");
    }

    private void hienThiDanhSach() {
        List<GiaoDich> danhSach = controller.layTatCaGiaoDich();
        if (danhSach.isEmpty()) {
            System.out.println("⚠️ Không có giao dịch nào.");
        } else {
            for (int i = 0; i < danhSach.size(); i++) {
            GiaoDich gd = danhSach.get(i);
            System.out.printf("[%d] KH: %s | HH: %s | SL: %d | Tiền: %.2f | Ngày: %s\n",
            i + 1,
                gd.getMaKhachHang(),
                gd.getMaHangHoa(),
                gd.getSoLuong(),
                gd.getThanhTien(),
                gd.getNgayGiaoDich().toString()
            );
            }
        }
    }
}
