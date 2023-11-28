package com.example.webproject1.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

/**
 * @CREATED 23/11/2023 - 10:01 PM
 * @PROJECT WebProject1
 * @AUTHOR Kiel
 */
@Getter
@Setter
@Entity
@Table(name= "Nganh")
public class Nganh {
    @Id
    @Column(name="manganh")
    private String maNganh;

    @Column(name="tennganh")
    private String tenNganh;

    @Column(name="loainganh")
    private String loaiNganh;
}
