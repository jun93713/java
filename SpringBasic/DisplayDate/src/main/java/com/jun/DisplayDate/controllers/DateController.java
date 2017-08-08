package com.jun.DisplayDate.controllers;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DateController {
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	@RequestMapping("/date")
	public String date(Model model, Date date) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		model.addAttribute("date", sdf.format(date.toString()));
		return "dates.jsp";
	}
	@RequestMapping("/time")
	public String time(Model model, Date date) {
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
		model.addAttribute("time", sdf.format(date.toString()));
		return "times.jsp";
	}
}
