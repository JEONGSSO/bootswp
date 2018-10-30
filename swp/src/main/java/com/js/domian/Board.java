package com.js.domian;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
// @Table(name= "Board")   //대문자안되는데
@Data
public class Board {
   
   @Id
   private int bno;

   @Column
   private String title;
   @Column
   private String writer;
   @Column
   private String content;
   @Column
   private Date time;
   @Column
   private int viewcnt;
}