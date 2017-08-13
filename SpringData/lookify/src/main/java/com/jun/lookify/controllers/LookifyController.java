package com.jun.lookify.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import com.jun.lookify.models.Lookify;
import com.jun.lookify.service.LookifyService;

@Controller
public class LookifyController {
	private final LookifyService service;
	public LookifyController(LookifyService service) {
		this.service = service;
	}
	
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
	@RequestMapping("/dashboard")
	public String dashboard(Model model) {
		model.addAttribute("songs", service.allSongs());
		return "dashboard";
	}
	
	@RequestMapping("/songs/new")
	public String newSong(@ModelAttribute("song") Lookify lookify) {
		return "new";
	}
	
	@PostMapping("/songs/new")
	public String newLanguage(@Valid @ModelAttribute("song") Lookify song, BindingResult result) {
		if (result.hasErrors()) {
            return "index";
        }else{
            service.addSong(song);;
            return "redirect:/dashboard";
        }
	}
	
	@RequestMapping("/songs/{id}")
	public String detail(@PathVariable("id") Long id, Model model) {
		model.addAttribute("song", service.findSong(id));
		return "song";
	}
	
	@RequestMapping("/songs/topten")
	public String topten(Model model) {
		model.addAttribute("songs", service.findTopTen());
		System.out.println(service.findTopTen());
		return "topten";
	}
	
	@PostMapping("/songs/search")
	public String searchPost(@RequestParam(value="search") String search) {
		String url = "redirect:/songs/search/";
		url += search;
		return url;
	}
	
	@RequestMapping("/songs/search/{search}")
	public String search(@PathVariable("search") String search, Model model) {
		model.addAttribute("songs", service.searchArtist(search));
		model.addAttribute("search", search);
		return "search";
	}
	
	@RequestMapping("/songs/delete/{id}")
	public String delete(@PathVariable("id") Long id) {
		service.delete(id);
		return "redirect:/dashboard";
	}
	
}
