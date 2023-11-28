package com.example.webproject1.controller;


import com.example.webproject1.model.Sinhvien;
import com.example.webproject1.model.Totnghiep;
import com.example.webproject1.model.Truong;
import com.example.webproject1.service.NganhService;
import com.example.webproject1.service.SinhvienService;
import com.example.webproject1.service.TotNghiepService;
import com.example.webproject1.service.TruongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * @CREATED 23/11/2023 - 10:27 PM
 * @PROJECT WebProject1
 * @AUTHOR Kiel
 */
@org.springframework.stereotype.Controller
@RequestMapping("/sinhvien")
public class Controller {

    @Autowired
    private SinhvienService sinhvienService;
    @Autowired
    private TotNghiepService totNghiepService;
    @Autowired
    private TruongService truongService;
    @Autowired
    private NganhService nganhService;

    @GetMapping("/home")
    public String index(Model model){

        return "index";
    }

    @GetMapping("/search")
    public String search(@RequestParam(defaultValue = "", name="keyword") String keyWord
            ,Model model){
        model.addAttribute("listSinhvien", sinhvienService.findListByName(keyWord));

        return "search";
    }

    @GetMapping("/search2")
    public String search2(@RequestParam(defaultValue = "", name="keyword") String keyWord
            ,Model model){
        model.addAttribute("listSinhvien", sinhvienService.findListByName(keyWord));
        model.addAttribute("listSinhvien", sinhvienService.findListByName(keyWord));
        return "search";
    }

    @GetMapping("/showlist")
    public String showList(Model model){
        model.addAttribute("listJoin", totNghiepService.getList());
        return "showlist";
    }

    @GetMapping("/add")
    public String addStudent(Model model){
        model.addAttribute("sinhVienModel", new Sinhvien());
        model.addAttribute("totNghiepModel", new Totnghiep());
        model.addAttribute("listTruong", truongService.findAll());
        model.addAttribute("listNganh", nganhService.findAll());
        return "formSV";
    }

//    @GetMapping("")
//    public String homePage(Model model) {
//        List<User> listUser = iUserService.getallUsers();
//        model.addAttribute("newuser", new User());
//        model.addAttribute("userItem", listUser);
//        return "home";
//    }

    @PostMapping("/save")
    public String save(@ModelAttribute(name = "sinhVienModel") Sinhvien sinhVienModel,
                       @ModelAttribute(name = "totNghiepModel") Totnghiep totNghiepModel
            , Model model){
        totNghiepModel.setSoCMND(sinhVienModel.getSoCMND());
        sinhvienService.save(sinhVienModel);
        totNghiepService.save(totNghiepModel);
        return "index";
    }
}
