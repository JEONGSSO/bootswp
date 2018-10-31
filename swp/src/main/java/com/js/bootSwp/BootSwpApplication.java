package com.js.bootSwp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

// 자동 설정을 담당 exclude는 제외 
// DB 설정을 넣고, 맞는 드라이버와 라이브러리 설치, JDBC 설정을 해야하는데 아직은 비어있으니 제외.
// @EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
// @EnableJpaRepositories("com.js.JPA")	jpa세팅
@ComponentScan("com.js")	//com.js 밑의 패키지들 bean을 자동 등록
@MapperScan("com.js.mappers")	//매퍼 위치 설정
@EntityScan("com.js.domian")
@SpringBootApplication
//@Configuration @EnableConfiguration @ComponentScan
public class BootSwpApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootSwpApplication.class, args);
	}
}
