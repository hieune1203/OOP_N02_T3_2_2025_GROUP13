package database;

import model.GiaoDich;

import java.util.ArrayList;
import java.util.List;

public class DanhSachGiaoDich {
    private List<GiaoDich> danhSach = new ArrayList<>();

    public void themGiaoDich(GiaoDich gd) {
        danhSach.add(gd);
    }

    public void xoaGiaoDich(int viTri) {
        if (viTri >= 0 && viTri < danhSach.size()) {
            danhSach.remove(viTri);
        }
    }
    public List<GiaoDich> layTatCa() {
        return danhSach;
    }

    public List<GiaoDich> timTheoMaKhachHang(String maKH) {
        List<GiaoDich> ketQua = new ArrayList<>();
        for (GiaoDich gd : danhSach) {
            if (gd.getMaKhachHang().equalsIgnoreCase(maKH)) {
                ketQua.add(gd);
            }
        }
        return ketQua;
    }

    public int demSoLuong() {
        return danhSach.size();
    }
}