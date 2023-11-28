package com.example.webproject1.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

/**
 * @CREATED 23/11/2023 - 10:10 PM
 * @PROJECT WebProject1
 * @AUTHOR Kiel
 */
@Getter
@Setter
@Entity
@Table(name = "totnghiep")
public class Totnghiep {
    @Id
    @Column(name="socmnd")
    private String SoCMND;

    @Column(name="matruong")
    private String maTruong;

    @Column(name="manganh")
    private String maNganh;

    @Column(name="hetn")
    private String heTotNghiep;

    @Column(name="ngaytn")
    private String ngayTotNghiep;

    @Column(name="loaitn")
    private String loaiTotNghiep;
}
