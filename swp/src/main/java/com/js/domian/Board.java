package com.js.domian;

import java.sql.Date;

import lombok.Data;

@Data
public class Board {
   
   private int bno;
   private String title;
   private String writer;
   private String content;
   private Date time;
   private int viewcnt;
}

// @Entity
// // @Table(name= "Board")   //대문자안되는데
// @Data
// public class Board {
   
//    @Id
//    @GeneratedValue(strategy=GenerationType.AUTO)
//    private int bno;

//    @Column
//    private String title;
//    @Column
//    private String writer;
//    @Column
//    private String content;
//    @Column
//    private Date time;
//    @Column
//    private int viewcnt;
// }