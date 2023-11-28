package com.example.webproject1.service;

import com.example.webproject1.model.Totnghiep;
import com.example.webproject1.repository.ITotnghiepRepository;
import com.example.webproject1.repository.TotnghiepRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Map;

/**
 * @CREATED 23/11/2023 - 10:42 PM
 * @PROJECT WebProject1
 * @AUTHOR Kiel
 */
@Controller
public class TotNghiepService {

    @Autowired
    private ITotnghiepRepository iTotnghiepRepository;
    @Autowired
    private TotnghiepRepo totnghiepRepo;

    public void save(Totnghiep totnghiepModel){
        iTotnghiepRepository.save(totnghiepModel);
    }

    public List<Map<String, Object>> getList(){
        return iTotnghiepRepository.getListInfo();
    }
}
