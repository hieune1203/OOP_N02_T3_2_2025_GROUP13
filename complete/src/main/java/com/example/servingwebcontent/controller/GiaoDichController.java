package com.example.servingwebcontent.controller;

import com.example.servingwebcontent.model.GiaoDich;
import com.example.servingwebcontent.database.DanhSachGiaoDich;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@Controller
public class GiaoDichController {

    private final DanhSachGiaoDich danhSachGiaoDich = new DanhSachGiaoDich();

    @GetMapping("/giaodich")
    public String hienThiForm(Model model) {
        model.addAttribute("giaoDich", new GiaoDich());
        model.addAttribute("danhSach", danhSachGiaoDich.layTatCa());
        return "GiaoDien";
    }

    @PostMapping("/giaodich")
    public String themGiaoDich(@ModelAttribute GiaoDich giaoDich, Model model) {
        giaoDich.setNgayGD(new Date());
        danhSachGiaoDich.them(giaoDich);
        model.addAttribute("giaoDich", new GiaoDich());
        model.addAttribute("danhSach", danhSachGiaoDich.layTatCa());
        return "GiaoDien";
    }
}