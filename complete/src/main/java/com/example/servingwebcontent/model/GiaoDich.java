package model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class GiaoDich {
    private String maKhachHang;
    private String maHangHoa;
    private int soLuong;
    private double thanhTien;
    private Date ngayGiaoDich;

    public GiaoDich(String maKhachHang, String maHangHoa, int soLuong, double thanhTien, Date ngayGiaoDich) {
        this.maKhachHang = maKhachHang;
        this.maHangHoa = maHangHoa;
        this.soLuong = soLuong;
        this.thanhTien = thanhTien;
        this.ngayGiaoDich = ngayGiaoDich;
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
