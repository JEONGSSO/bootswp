package com.js.bootSwp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan("com.js")	//com.js 밑의 패키지들 bean을 자동 등록
// 자동 설정을 담당 exclude는 제외 
// DB 설정을 넣고, 맞는 드라이버와 라이브러리 설치, JDBC 설정을 해야하는데 아직은 비어있으니 제외.
// @EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@EntityScan("com.js.domian")
@EnableJpaRepositories("com.js.JPA")
@SpringBootApplication
//@Configuration @EnableConfiguration @ComponentScan
public class BootSwpApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootSwpApplication.class, args);
	}
}
