package com.example.servingwebcontent.controller;

import com.example.servingwebcontent.database.DanhSachGiaoDich;
import com.example.servingwebcontent.model.GiaoDich;

import java.util.Date;
import java.util.List;

public class GiaoDichController {
    private DanhSachGiaoDich danhSach = new DanhSachGiaoDich();

    public void themGiaoDich(String maKH, String maHH, int soLuong, double thanhTien, Date ngayGD) {
        GiaoDich gd = new GiaoDich(maKH, maHH, soLuong, thanhTien, ngayGD);
        danhSach.themGiaoDich(gd);
    }

    public void xoaGiaoDich(int viTri) {
        danhSach.xoaGiaoDich(viTri);
    }

    public List<GiaoDich> layTatCaGiaoDich() {
        return danhSach.layTatCa();
    }

    public List<GiaoDich> timGiaoDichTheoMaKH(String maKH) {
        return danhSach.timTheoMaKhachHang(maKH);
    }

    public double tinhTongThanhTien() {
        double tong = 0;
        for (GiaoDich gd : danhSach.layTatCa()) {
            tong += gd.getThanhTien();
        }
        return tong;
    }

    public int demSoLuongGiaoDich() {
        return danhSach.demSoLuong();
    }
}