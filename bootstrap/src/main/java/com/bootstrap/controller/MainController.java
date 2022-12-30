package com.bootstrap.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	@RequestMapping("/")
	public String main() {
		return "index";
	}
	
	@RequestMapping("/about")
	public String about(Model model) {
		
		model.addAttribute("text","저희 회사 소개입니다");
		model.addAttribute("text_two","Start Bootstrap can help you build better websites using the Bootstrap framework! Just download a theme and start customizing, no strings attached!");
		return "index";
	}
	
	@RequestMapping("/service")
	public String service(Model model) {
		model.addAttribute("text","서비스 소개");
		model.addAttribute("text_two","Start Bootstrap can help you build better websites using the Bootstrap framework! Just download a theme and start customizing, no strings attached!");
		return "index";
	}
}
