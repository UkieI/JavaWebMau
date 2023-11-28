package com.example.webproject1.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Map;

/**
 * @CREATED 26/11/2023 - 7:16 PM
 * @PROJECT WebProject1
 * @AUTHOR Kiel
 */
@Repository
public class TotnghiepRepo {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public Map<String, Object> getlist() {
        String sql = "select sv.socmnd, sv.hoten, tt.manganh , tt.matruong , cv.manganh, cv.tencongty , cv.thoigianlamviec from sinhvien sv, totnghiep tt, congviec cv WHERE sv.socmnd = tt.socmnd and cv.socmnd = sv.socmnd ";
        return jdbcTemplate.queryForMap(sql);
    }
}
