package com.example.webproject1.service;

import com.example.webproject1.model.Truong;
import com.example.webproject1.repository.ITruongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @CREATED 23/11/2023 - 2:32 PM
 * @PROJECT WebProject1
 * @AUTHOR Kiel
 */
@Service
public class TruongService {
    @Autowired
    private ITruongRepository truongRepository;

    public List<Truong> findAll(){
        return (List<Truong>) truongRepository.findAll();
    }

    public Truong findByName(String name){
        return truongRepository.findByName(name);
    }

    public List<Truong> findListByName(String name){
        return truongRepository.findListByName(name);
    }
}
