package com.jun.DojoOverflow.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jun.DojoOverflow.models.Helper;
import com.jun.DojoOverflow.models.Question;
import com.jun.DojoOverflow.service.DojoOverflowService;

@Controller
public class DojoOverflowController {
	private final DojoOverflowService service;
	public DojoOverflowController(DojoOverflowService service) {
		this.service = service;
	}
	
	@RequestMapping("/")
	public String index() {
		return "dashboard";
	}
	
	@RequestMapping("/new")
	public String newQuestion(@ModelAttribute("helper") Helper helper) {
		return "newquestion";
	}
	
	@PostMapping("/new")
	public String newQuestionAndTag(@ModelAttribute("helper") Helper helper) {
		System.out.println(helper.getQuestion());
		System.out.println("lalala");
		System.out.println(helper.getTags());
		return "redirect:/";
	}
}
