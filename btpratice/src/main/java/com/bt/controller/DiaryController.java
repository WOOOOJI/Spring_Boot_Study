package com.bt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DiaryController {
	
	String dir = "diary/";
	
	@GetMapping("/diary/mydiary")
	public String mydiary(Model model) {
		
		model.addAttribute("content", dir+"mydiary");
		
		return "index";
	}
	
}
