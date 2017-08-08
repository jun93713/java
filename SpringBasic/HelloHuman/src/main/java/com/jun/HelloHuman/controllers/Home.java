package com.jun.HelloHuman.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Home {
	@RequestMapping("/")
	public String index(@RequestParam(value="name", required=false) String name, Model model) {
		if(name==null) {
			name = "Human";
		}
		model.addAttribute("name", name);
		return "index.jsp";
	}
}
