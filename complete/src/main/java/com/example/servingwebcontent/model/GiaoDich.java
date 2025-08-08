package com.example.servingwebcontent.model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class GiaoDich {
    private String maKhachHang;
    private String maHangHoa;
    private int soLuong;
    private double thanhTien;
    private Date ngayGiaoDich;

    public GiaoDich(String maKH, String maHH, int soLuong, double thanhTien, Date ngayGD) {
        this.maKhachHang = maKH;
        this.maHangHoa = maHH;
        this.soLuong = soLuong;
        this.thanhTien = thanhTien;
        this.ngayGiaoDich = ngayGD;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public String getMaHangHoa() {
        return maHangHoa;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public double getThanhTien() {
        return thanhTien;
    }

    public Date getNgayGiaoDich() {
        return ngayGiaoDich;
    }

    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return "Mã KH: " + maKhachHang +
               " | Mã HH: " + maHangHoa +
               " | Số lượng: " + soLuong +
               " | Thành tiền: " + thanhTien +
               " | Ngày GD: " + sdf.format(ngayGiaoDich);
    }
}
