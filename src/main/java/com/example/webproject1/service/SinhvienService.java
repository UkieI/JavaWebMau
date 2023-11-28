package com.example.webproject1.service;

import com.example.webproject1.model.Sinhvien;
import com.example.webproject1.model.Truong;
import com.example.webproject1.repository.ISinhvienRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @CREATED 23/11/2023 - 10:17 PM
 * @PROJECT WebProject1
 * @AUTHOR Kiel
 */
@Service
public class SinhvienService {
    @Autowired
    private ISinhvienRepository iSinhvienRepository;

    public List<Sinhvien> findAll(){
        return (List<Sinhvien>) iSinhvienRepository.findAll();
    }

    public void save(Sinhvien sinhvien){
        iSinhvienRepository.save(sinhvien);
    }

    public List<Sinhvien> findListByName(String hoten){
        return  iSinhvienRepository.findListByName(hoten);
    }
}
