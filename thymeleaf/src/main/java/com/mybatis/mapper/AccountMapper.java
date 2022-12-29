package com.mybatis.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.mybatis.dto.AccountDTO;
import com.mybatis.frame.FrameMapper;

@Repository
@Mapper
public interface AccountMapper extends FrameMapper<String, AccountDTO>{
	
}
