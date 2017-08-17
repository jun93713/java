package com.jun.QueriesAndJoins.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jun.QueriesAndJoins.services.ApiService;

@Controller
public class ApiController {
	private ApiService service;
	
	public ApiController(ApiService apiService) {
		this.service = apiService;
	}
	
	@RequestMapping("/")
	public String index(Model model) {
		//1
		//model.addAttribute("countries", service.findCountryByLang("Slovene"));
		//2
		//model.addAttribute("countries", service.findAllCountreisOrderByCitiesDesc());
		//3
		//model.addAttribute("cities", service.task3("Mexico"));
		//4
		//model.addAttribute("languages", service.task4());
		//5
		//model.addAttribute("countries", service.task5());
		//6
		//model.addAttribute("countries", service.task6());
		//7
		//model.addAttribute("cities", service.task7());
		//8
		model.addAttribute("countries", service.task8());
		return "index";
	}
}
