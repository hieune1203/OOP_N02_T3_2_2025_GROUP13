package com.example.servingwebcontent;

import com.example.servingwebcontent.component.GiaoDien;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GiaoDienWebController {

    @GetMapping("/giaodien")
    public String showGiaoDien(Model model) {
        GiaoDien giaoDien = new GiaoDien();
        model.addAttribute("noiDung", giaoDien.layNoiDung());
        return "GiaoDien";
    }
}