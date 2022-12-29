package com.mybatis.account;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mybatis.dto.AccountDTO;
import com.mybatis.service.AccountService;

@SpringBootTest
class InsertTest {
	
	@Autowired
	AccountService service;
	
	@Test
	void contextLoads() {
		AccountDTO dto = new AccountDTO("zathy122", "1aaas22", "woojin yeon", "010-1112-2211", "zathy1225@gmail.com");
		try {
			service.register(dto);
			System.out.println("유저등록 성공");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
