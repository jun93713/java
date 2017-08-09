package com.jun.Platform.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PlatformController {
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping("/m/{part1}/0553/{part2}")
	public String lesson() {
		return "lesson.jsp";
	}
	@RequestMapping("/m/{part1}/0483/{part2}")
	public String assignment() {
		return "assignment.jsp";
	}
}
