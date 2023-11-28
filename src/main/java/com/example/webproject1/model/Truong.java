package com.example.webproject1.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

/**
 * @CREATED 23/11/2023 - 2:15 PM
 * @PROJECT WebProject1
 * @AUTHOR Kiel
 */
@Getter
@Setter
@Entity
@Table(name= "truong")
//@NamedQuery(name="Truong.findAllTruong", query = "SELECT * FROM TRUONG T")
public class Truong {
    @Id
    @Column(name="matruong")
    private String MaTruong;

    @Column(name="tentruong")
    private String TenTruong;

    @Column(name="diachi")
    private String DiaChi;

    @Column(name="sdt")
    private String SDT;

    @Override
    public String toString() {
        return "Truong{" +
                "MaTruong=" + MaTruong +
                ", TenTruong='" + TenTruong + '\'' +
                ", DiaChi='" + DiaChi + '\'' +
                ", SDT='" + SDT + '\'' +
                '}';
    }
}
