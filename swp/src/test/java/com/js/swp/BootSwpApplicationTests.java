package com.js.swp;

import com.js.JPA.Jpa;

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
		// repository.save(entity)
	}

}
