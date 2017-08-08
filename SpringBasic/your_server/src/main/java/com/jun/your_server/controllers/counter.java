package com.jun.your_server.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class counter {
	@RequestMapping("/")
	public String index(HttpSession session) {
		if(session.getAttribute("counter")==null) {
			session.setAttribute("counter", 0);
		}
		else {
			Integer counter = (Integer) session.getAttribute("counter");
			session.setAttribute("counter", ++counter);
		}
		return "index.jsp";
	}
	@RequestMapping("/counter")
	public String counter(HttpSession session, Model model) {
		model.addAttribute("count", session.getAttribute("counter"));
		return "counters.jsp";
	}
}
