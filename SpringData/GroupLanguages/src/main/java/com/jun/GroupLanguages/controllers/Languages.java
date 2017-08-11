package com.jun.GroupLanguages.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import com.jun.GroupLanguages.models.Language;
import com.jun.GroupLanguages.service.LanguageService;

@Controller
public class Languages {
	private final LanguageService languageService;
	public Languages(LanguageService languageService) {
		this.languageService = languageService;
	}
	
	@RequestMapping("/languages")
	public String languages(Model model, @ModelAttribute("language") Language language) {
		List<Language> languages = languageService.allLanguages();
		model.addAttribute("langs", languages);
		return "index";
	}
	
	@PostMapping("/language/new")
	public String newLanguage(@Valid @ModelAttribute("language") Language language, BindingResult result) {
		if (result.hasErrors()) {
            return "index";
        }else{
            languageService.addLanguage(language);
            return "redirect:/languages";
        }
	}
	
	@RequestMapping("/languages/{id}")
	public String detail(@PathVariable("id") Long id, Model model) {
		model.addAttribute("lang", languageService.find(id));
		return "lang";
	}
	
	@RequestMapping("/languages/edit/{id}")
	public String edit(@PathVariable("id") Long id, Model model, @ModelAttribute("language") Language language) {
		Language lang = languageService.find(id);
		if(lang != null) {
			model.addAttribute("lang", lang);
			return "editlang";
		}
		else {
			return "redirect:/languages";
		}
	}
	
	@PostMapping("/languages/edit/{id}")
	public String update(@Valid @ModelAttribute("language") Language language, BindingResult result, @PathVariable("id") Long id) {
		if (result.hasErrors()) {
            return "editlang";
        }else{
            languageService.update(language);
            return "redirect:/languages";
        }
	}
	
	@RequestMapping("/languages/delete/{id}")
    public String delete(@PathVariable("id") Long id) {
        languageService.delete(id);
        return "redirect:/languages";
    }
	
	
}
