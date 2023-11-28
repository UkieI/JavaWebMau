package com.example.webproject1.repository;

import com.example.webproject1.model.Totnghiep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.util.List;
import java.util.Map;

/**
 * @CREATED 23/11/2023 - 10:38 PM
 * @PROJECT WebProject1
 * @AUTHOR Kiel
 */
@Repository
public interface ITotnghiepRepository extends CrudRepository<Totnghiep, String> {
    @Query(value =  "select sv.socmnd, sv.hoten, tt.manganh , tt.matruong , cv.manganh, cv.tencongty , cv.thoigianlamviec from sinhvien sv, totnghiep tt, congviec cv WHERE sv.socmnd = tt.socmnd and cv.socmnd = sv.socmnd " , nativeQuery = true)
    public List<Map<String, Object>> getListInfo();
}
