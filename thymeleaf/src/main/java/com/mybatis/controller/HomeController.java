package com.mybatis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mybatis.service.AccountService;

@Controller
public class HomeController {
	@Autowired
	AccountService service;
	
	@RequestMapping("/")
	public String home(Model model) {
		try {
			model.addAttribute("account",service.get("zathy122"));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "home";
	}
	
	
	@RequestMapping("/loginpage")
	public String loginPage() {
		return "loginpage";
	}
	
	@PostMapping("/logincheck")
	public String loginCheck(String userid,  Model model) {
		try {
			model.addAttribute("account",service.get(userid));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "logincheck";
	}
}
