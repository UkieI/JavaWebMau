package com.example.webproject1.service;

import com.example.webproject1.model.Nganh;
import com.example.webproject1.repository.INganhRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @CREATED 24/11/2023 - 10:01 PM
 * @PROJECT WebProject1
 * @AUTHOR Kiel
 */
@Service
public class NganhService {
    @Autowired
    private INganhRepository iNganhRepository;

    public List<Nganh> findAll() {
        return (List<Nganh>) iNganhRepository.findAll();
    }
}
