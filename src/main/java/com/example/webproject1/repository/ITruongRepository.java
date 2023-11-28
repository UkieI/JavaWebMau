package com.example.webproject1.repository;

import com.example.webproject1.model.Truong;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @CREATED 23/11/2023 - 2:29 PM
 * @PROJECT WebProject1
 * @AUTHOR Kiel
 */
/* CrudRepository
* Gồm 6 hàm quan trọng : save, findOne(ID), findAll, count, delete(T entity), exists(ID)
* */
@Repository
public interface ITruongRepository extends CrudRepository <Truong, Integer> {
    @Query(value = "SELECT * FROM truong WHERE tentruong = ?", nativeQuery = true)
    public Truong findByName(String name);

    @Query(value = "SELECT * FROM truong WHERE tentruong LIKE '%' ? '%' ", nativeQuery = true)
    public List<Truong> findListByName(String name);
}
