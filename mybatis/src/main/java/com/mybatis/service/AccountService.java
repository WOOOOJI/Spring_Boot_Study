package com.mybatis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mybatis.dto.AccountDTO;
import com.mybatis.frame.FrameService;
import com.mybatis.mapper.AccountMapper;

@Service
public class AccountService implements FrameService<String, AccountDTO>{
	@Autowired
	AccountMapper mapper;
	
	@Override
	public void register(AccountDTO v) throws Exception {
		mapper.insert(v);
		
	}

	@Override
	public void remove(String k) throws Exception {
		mapper.delete(k);
		
	}

	@Override
	public void modify(AccountDTO v) throws Exception {
		mapper.update(v);
		
	}

	@Override
	public List<AccountDTO> get() throws Exception {
		return mapper.selectAll();
	}

	@Override
	public AccountDTO get(String k) throws Exception {
		return mapper.select(k);
	}
	
}
