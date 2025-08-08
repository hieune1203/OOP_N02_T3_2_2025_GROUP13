package com.example.servingwebcontent.model;

import java.util.Date;

public class GiaoDich {
    private String maKH;
    private String maHH;
    private int soLuong;
    private double thanhTien;
    private Date ngayGD;

    public GiaoDich() {} // Constructor mặc định cho Spring

    public GiaoDich(String maKH, String maHH, int soLuong, double thanhTien, Date ngayGD) {
        this.maKH = maKH;
        this.maHH = maHH;
        this.soLuong = soLuong;
        this.thanhTien = thanhTien;
        this.ngayGD = ngayGD;
    }

    public String getMaKH() { return maKH; }
    public void setMaKH(String maKH) { this.maKH = maKH; }

    public String getMaHH() { return maHH; }
    public void setMaHH(String maHH) { this.maHH = maHH; }

    public int getSoLuong() { return soLuong; }
    public void setSoLuong(int soLuong) { this.soLuong = soLuong; }

    public double getThanhTien() { return thanhTien; }
    public void setThanhTien(double thanhTien) { this.thanhTien = thanhTien; }

    public Date getNgayGD() { return ngayGD; }
    public void setNgayGD(Date ngayGD) { this.ngayGD = ngayGD; }
}
