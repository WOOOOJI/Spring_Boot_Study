package com.mt.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.mt.dto.AccountDTO;

@Mapper
@Repository
public interface AccountMapper {
	public AccountDTO loginCheck(String userid, String userpwd);
}
