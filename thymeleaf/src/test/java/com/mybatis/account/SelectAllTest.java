package com.mybatis.account;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mybatis.dto.AccountDTO;
import com.mybatis.service.AccountService;

@SpringBootTest
class SelectAllTest {
	
	@Autowired
	AccountService service;
	
	@Test
	void contextLoads() {
		try {
			List<AccountDTO> obj = null;
			obj = service.get();
			for(AccountDTO d : obj)System.out.println(d);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
