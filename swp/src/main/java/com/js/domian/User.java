package com.js.domian;

import lombok.Data;
import lombok.ToString;

@Data
@ToString(exclude={"pw"})
public class User {
    private String id;
    private String pw;
}
// @Entity //태이블이라는거
// // @Table(name = "User")
// @Getter @Setter //exclude
// public class User {

//     @Id //기본키
//     private String id;

//     @Column
//     private String pw;
// }