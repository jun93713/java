package com.jun.portfolio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Portfolio {
	@RequestMapping("/")
	public String index() {
		return "forward:/index.html";
	}
	
	@RequestMapping("/me")
	public String me() {
		return "forward:/aboutme.html";
	}
	
	@RequestMapping("/project")
	public String project() {
		return "forward:/projects.html";
	}
}
