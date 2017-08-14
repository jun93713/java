package com.jun.DojoAndNinja.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import com.jun.DojoAndNinja.models.*;
import com.jun.DojoAndNinja.service.DojoAndNinjaService;

@Controller
public class DojoAndNinjaController {
	private final DojoAndNinjaService service;
	public DojoAndNinjaController(DojoAndNinjaService service) {
		this.service = service;
	}
	
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
	@RequestMapping("/dojos/new")
	public String newDojo(@ModelAttribute("dojo") Dojo dojo) {
		return "newdojo";
	}
	
	@PostMapping("/dojos/new")
	public String addDojo(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result) {
		if (result.hasErrors()) {
            return "newdojo";
        }else{
        		
            service.addDojo(dojo);
            return "redirect:/";
        }
	}
	
	@RequestMapping("ninjas/new")
	public String newNinja(@ModelAttribute("ninja") Ninja ninja, Model model) {
		model.addAttribute("dojos", service.findDojos());
		return "newninja";
	}
	
	@PostMapping("ninjas/new")
	public String addNinja(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result) {
		if (result.hasErrors()) {
            return "newninja";
        }else{
        		
            service.addNinja(ninja);
            return "redirect:/";
        }
	}
	
	@RequestMapping("/dojo/{id}")
	public String dojoDetail(@PathVariable("id") Long id, Model model) {
		model.addAttribute("dojo", service.findDojo(id));
		model.addAttribute("ninjas", service.findNinjasByDojo(id));
		return "detail";
	}
}
