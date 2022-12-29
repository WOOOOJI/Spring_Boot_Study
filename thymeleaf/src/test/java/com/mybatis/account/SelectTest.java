package com.mybatis.account;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mybatis.dto.AccountDTO;
import com.mybatis.service.AccountService;

@SpringBootTest
class SelectTest {
	
	@Autowired
	AccountService service;
	
	@Test
	void contextLoads() {
		try {
			AccountDTO dto = service.get("아이디><");
			System.out.println(dto);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
