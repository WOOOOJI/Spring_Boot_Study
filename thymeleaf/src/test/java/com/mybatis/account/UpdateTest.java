package com.mybatis.account;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mybatis.dto.AccountDTO;
import com.mybatis.service.AccountService;

@SpringBootTest
class UpdateTest {
	
	@Autowired
	AccountService service;
	
	@Test
	void contextLoads() {
		AccountDTO dto = new AccountDTO("아이디><","dnwls1234", "연우진", "010-2222-1111", "zathy1225@gmail.com");
		try {
			service.modify(dto);
			System.out.println("유저수정 성공");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
