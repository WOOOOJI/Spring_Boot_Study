package com.fileupload.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FileController {
	//파일업로드 페이지 매핑
	@RequestMapping("/")
	public String filepage() {
		return "fileUpload";
	}
	
}
