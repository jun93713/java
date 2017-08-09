package com.jun.DojoSurvey.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SurveyController {
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping(path="/process", method=RequestMethod.POST)
	public String process(HttpSession session, 
			@RequestParam(value="name") String name,
			@RequestParam(value="location") String location,
			@RequestParam(value="lang") String lang,
			@RequestParam(value="comment", required=false) String comment
			) {
		session.setAttribute("name", name);
		session.setAttribute("location", location);
		session.setAttribute("lang", lang);
		session.setAttribute("comment", comment);
		return "redirect:/result";
	}
	@RequestMapping("/result")
	public String result(Model model, HttpSession session) {
		model.addAttribute("name", session.getAttribute("name"));
		model.addAttribute("location", session.getAttribute("location"));
		model.addAttribute("lang", session.getAttribute("lang"));
		model.addAttribute("comment", session.getAttribute("comment"));

		return "results.jsp";
	}
}
