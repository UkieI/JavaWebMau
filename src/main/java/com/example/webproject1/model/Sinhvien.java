package com.example.webproject1.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

/**
 * @CREATED 23/11/2023 - 10:04 PM
 * @PROJECT WebProject1
 * @AUTHOR Kiel
 */
@Getter
@Setter
@Entity
@Table(name = "sinhvien")
public class Sinhvien {
    @Id
    @Column(name="socmnd")
    private String SoCMND;

    @Column(name="hoten")
    private String hoTen;

    @Column(name="email")
    private String email;

    @Column(name="sdt")
    private String SDT;

    @Column(name="diachi")
    private String diaChi;

}
