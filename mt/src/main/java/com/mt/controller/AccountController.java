package com.mt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

import com.mt.dto.AccountDTO;
import com.mt.service.AccountService;

@Controller
public class AccountController {
	@Autowired
	AccountService service;
	
	@PostMapping("/loginCheck")
	public String loginCheck(String userid, String userpwd, Model model) {
		
		AccountDTO dto = service.loginCheck(userid, userpwd);
		
		if(dto!=null) {
			model.addAttribute("dto",dto);			
		}
		
		return "index";
	}
	
}
