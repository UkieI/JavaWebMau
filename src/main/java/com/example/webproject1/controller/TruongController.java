package com.example.webproject1.controller;

import com.example.webproject1.model.Truong;
import com.example.webproject1.service.TruongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @CREATED 23/11/2023 - 2:34 PM
 * @PROJECT WebProject1
 * @AUTHOR Kiel
 */
@Controller
@RequestMapping("/truong")
public class TruongController {
    @Autowired
    TruongService truongService;

    @GetMapping("/showAll")
    public String showAll(Model model){
        List<Truong> list = truongService.findAll();
        for (Truong truong : list ){
            System.out.println(truong.toString());
        }
        model.addAttribute("listTruong", list);
        return "index";
    }

    @GetMapping("/search")
    public String searchByName(@RequestParam(defaultValue = "", name="keyword") String keyWord, Model model){
        List<Truong> list = null;
        if (!"".equals(keyWord)){
            list = truongService.findListByName(keyWord);
            System.out.println(list.toString());
        }
        model.addAttribute("listTruong", list);
        return "index";
    }


}
