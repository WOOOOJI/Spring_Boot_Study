package com.mt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mt.dto.AccountDTO;
import com.mt.mapper.AccountMapper;

@Service
public class AccountService implements AccountMapper{
	@Autowired
	AccountMapper mapper;

	@Override
	public AccountDTO loginCheck(String userid, String userpwd) {
		// TODO Auto-generated method stub
		return mapper.loginCheck(userid, userpwd);
	}
	
	
}
