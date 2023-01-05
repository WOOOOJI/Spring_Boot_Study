package com.ajax.controller;



import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AjaxController {
	
	@RequestMapping("/time")
	@ResponseBody
	public String time() {
		Date date = new Date();
		return date.toString();
	}
	
}
