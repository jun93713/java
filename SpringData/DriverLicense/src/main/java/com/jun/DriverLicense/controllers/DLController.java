package com.jun.DriverLicense.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import com.jun.DriverLicense.models.*;
import com.jun.DriverLicense.service.DLService;

@Controller
public class DLController {
	private final DLService service;
	public DLController(DLService service) {
		this.service = service;
	}
	
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
	@RequestMapping("/persons/new")
	public String newPerson(@ModelAttribute("person") Person person) {
		return "newperson";
	}
	
	@RequestMapping("/licenses/new")
	public String newLicense(@ModelAttribute("license") License license, Model model) {
		model.addAttribute("persons", service.findPersons());
		return "newlicense";
	}
	
	@PostMapping("/persons/new")
	public String addPerson(@ModelAttribute("person") Person person, BindingResult result) {
		if (result.hasErrors()) {
            return "newperson";
        }else{
        		
            service.addPerson(person);
            return "redirect:/";
        }
	}
	
	@PostMapping("/licenses/new")
	public String addLicense(@ModelAttribute("license") License license, BindingResult result) {
		if (result.hasErrors()) {
            return "newlicense";
        }else{
            service.addLicense(license);
            return "redirect:/";
        }
	}
	
	@RequestMapping("/persons/{id}")
	public String detail(@PathVariable("id") Long id, Model model) {
		model.addAttribute("person", service.findPerson(id));
		return "detail";
	}
}
