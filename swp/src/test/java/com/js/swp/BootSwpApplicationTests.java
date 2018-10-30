package com.js.swp;

import com.js.JPA.Jpa;
import com.js.domian.Board;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BootSwpApplicationTests {

	@Autowired
	Jpa repository; // jpaRepository JPA

	@Test
	public void contextLoads() {
	}

	@Test
	public void jpaTest () {

		Board vo = new Board();
		vo.setBno(1);
		vo.setContent("테스트");
		vo.setTitle("테스트 제목");
		vo.setViewcnt(1);
		vo.setWriter("작성자");

		repository.save(vo);
	}

}
