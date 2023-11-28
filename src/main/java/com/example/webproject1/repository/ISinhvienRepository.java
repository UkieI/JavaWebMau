package com.example.webproject1.repository;

import com.example.webproject1.model.Sinhvien;
import com.example.webproject1.model.Truong;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @CREATED 23/11/2023 - 10:16 PM
 * @PROJECT WebProject1
 * @AUTHOR Kiel
 */
@Repository
public interface ISinhvienRepository extends CrudRepository<Sinhvien, String> {
    @Query(value = "SELECT * FROM sinhvien WHERE hoten LIKE '%' ? '%' ", nativeQuery = true)
    public List<Sinhvien> findListByName(String name);
}
