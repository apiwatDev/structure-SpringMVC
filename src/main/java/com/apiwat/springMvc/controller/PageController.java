package com.apiwat.springMvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

	@GetMapping("/page2")
	public String showPage2Page() {
		return "page/page2";
	}
}
