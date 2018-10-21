package com.js.domian;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity //태이블이라는거
// @Table(name = "User")
@Getter @Setter
public class User {

    @Id //기본키
    private String id;

    @Column
    private String pw;
}