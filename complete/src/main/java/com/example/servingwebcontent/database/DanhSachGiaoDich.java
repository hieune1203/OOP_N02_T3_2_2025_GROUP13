package com.example.servingwebcontent.database;

import com.example.servingwebcontent.model.GiaoDich;
import java.util.ArrayList;
import java.util.List;

public class DanhSachGiaoDich {
    private final List<GiaoDich> danhSach = new ArrayList<>();

    public void them(GiaoDich gd) {
        danhSach.add(gd);
    }

    public List<GiaoDich> layTatCa() {
        return danhSach;
    }
}