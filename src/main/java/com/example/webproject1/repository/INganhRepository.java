package com.example.webproject1.repository;

import com.example.webproject1.model.Nganh;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @CREATED 24/11/2023 - 10:00 PM
 * @PROJECT WebProject1
 * @AUTHOR Kiel
 */
@Repository
public interface INganhRepository extends CrudRepository<Nganh,String> {
}
