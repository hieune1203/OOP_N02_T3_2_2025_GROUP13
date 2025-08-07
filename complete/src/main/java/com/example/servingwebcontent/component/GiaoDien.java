package com.example.servingwebcontent.component;

import java.util.Scanner;

public class GiaoDien {
    private Scanner scanner;

    public GiaoDien() {
        scanner = new Scanner(System.in);
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
            scanner.nextLine(); // Đọc bỏ dòng thừa

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
        System.out.println("Nhập thông tin giao dịch...");
    }

    private void hienThiDanhSach() {
        System.out.println("Hiển thị danh sách giao dịch...");
    }
}