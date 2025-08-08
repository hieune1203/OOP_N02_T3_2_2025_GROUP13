package com.example.servingwebcontent.component;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import com.example.servingwebcontent.model.GiaoDich;
import com.example.servingwebcontent.database.DanhSachGiaoDich;

public class GiaoDien {
    private DanhSachGiaoDich danhSachGiaoDich;
    private Scanner scanner;

    public GiaoDien() {
        scanner = new Scanner(System.in);
        danhSachGiaoDich = new DanhSachGiaoDich();
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
        GiaoDich gd = new GiaoDich(maKH, maHH, soLuong, thanhTien, ngayGD);
        danhSachGiaoDich.them(gd);
        System.out.println("✅ Giao dịch đã được thêm.");
    }

    private void hienThiDanhSach() {
        List<GiaoDich> danhSach = danhSachGiaoDich.layTatCa();
        if (danhSach.isEmpty()) {
            System.out.println("Không có giao dịch nào.");
        } else {
            for (GiaoDich gd : danhSach) {
                System.out.println("Mã KH: " + gd.getMaKH());
                System.out.println("Mã HH: " + gd.getMaHH());
                System.out.println("Số lượng: " + gd.getSoLuong());
                System.out.println("Thành tiền: " + gd.getThanhTien());
                System.out.println("Ngày GD: " + gd.getNgayGD());
                System.out.println("----------------------");
            }
        }
    }

    public String layNoiDung() {
        return "Đây là nội dung giao diện từ GiaoDien.java!";
    }
}
