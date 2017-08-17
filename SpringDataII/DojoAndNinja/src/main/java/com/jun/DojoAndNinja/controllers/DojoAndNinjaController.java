package com.jun.DojoAndNinja.controllers;

import javax.validation.Valid;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import com.jun.DojoAndNinja.models.*;
import com.jun.DojoAndNinja.service.DojoAndNinjaService;
import com.jun.DojoAndNinja.service.NinjaService;

@Controller
public class DojoAndNinjaController {
	private final DojoAndNinjaService service;
	private final NinjaService ninjaService;
	public DojoAndNinjaController(DojoAndNinjaService service, NinjaService ninjaService) {
		this.service = service;
		this.ninjaService = ninjaService;
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
	
	@RequestMapping("/pages/{pageNumber}")
	public String getNinjasPerPage(Model model, @PathVariable("pageNumber") int pageNumber) {
	    // we have to subtract 1 because the Pages iterable is 0 indexed. This is for our links to be able to show from 1...pageMax, instead of 0...pageMax - 1.
	    Page<Ninja> ninjas = ninjaService.ninjasPerPage(pageNumber - 1);

	    // total number of pages that we have
	    int totalPages = ninjas.getTotalPages();
	    model.addAttribute("totalPages", totalPages);
	    model.addAttribute("ninjas", ninjas);
	    return "ninjas";
	}

}
