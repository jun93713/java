package com.jun.Events.controllers;

import java.security.Principal;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jun.Events.models.*;
import com.jun.Events.services.EventsService;

@Controller
public class EventsController {
	private EventsService service;
	public EventsController(EventsService service) {
		this.service = service;
	}
	
	private String[] states = {"AL", "AK", "AZ", "AR", "CA", "CO", "CT", "DE", "FL", "GA", "HI", "ID", "IL", "IN", "IA",
	                                                               "KS", "KY", "LA", "ME", "MD", "MA", "MI", "MN", "MS", "MO", "MT", "NE", "NV", "NH",
	                                                               "NJ", "NM", "NY", "NC", "ND", "OH", "OK", "OR", "PA", "RI", "SC", "SD", "TN", "TX",
	                                                               "UT", "VT", "VA", "WA", "WV", "WI", "WY"};
	
	
	@RequestMapping("/")
	public String index(@Valid @ModelAttribute("user") User user, Model model ) {
		model.addAttribute("states", states);
		return "loginandreg";
	}
	
	@PostMapping("/registration")
	public String registration(@ModelAttribute("user") User user, BindingResult result) {
		if(result.hasErrors()) {
			return "loginandreg";
		}
		else {
			service.saveUser(user);
			return "redirect:/";
		}
	}
	
	@RequestMapping("/login")
    public String login(@Valid @ModelAttribute("user") User user, @RequestParam(value="error", required=false) String error, @RequestParam(value="logout", required=false) String logout, Model model) {
        if(error != null) {
            model.addAttribute("errorMessage", "Invalid Credentials, Please try again.");
        }
        if(logout != null) {
            model.addAttribute("logoutMessage", "Logout Successfull!");
        }
        model.addAttribute("states", states);
        return "loginandreg";
    }
	
	@RequestMapping("/events")
    public String home(Principal principal, Model model, @Valid @ModelAttribute("event") Event event, BindingResult result) {
        String username = principal.getName();
        model.addAttribute("currentUser", service.findByEmail(username));
        model.addAttribute("states", states);
        model.addAttribute("events", service.allEvents());
        return "dashboard";
    }
	
	@PostMapping("/event")
	public String newEvent(@ModelAttribute("event") Event event, BindingResult result, Principal principal) {
		service.saveEvent(event);
		return "redirect:/events";
	}
	
	@RequestMapping("/events/{id}")
	public String eventDetail(@PathVariable(value="id") Long id, Model model, @ModelAttribute("message") Message message, BindingResult result) {
		model.addAttribute("event", service.eventDetail(id));
		return "detail";
	}
	
	@PostMapping("/message")
	public String newMessage(@ModelAttribute("message") Message message, BindingResult result) {
		service.saveMessage(message);
		return "redirect:/events/" + message.getEvent().getId();
	}
	
	@RequestMapping("/events/{id}/edit")
	public String editEvent(@PathVariable(value="id") Long id, Model model, @ModelAttribute("event") Event event, BindingResult result, Principal principal) {
		String username = principal.getName();
		if(service.findByEmail(username).getId() != service.eventDetail(id).getHost().getId()) {
			return "redirect:/events";
		}
		model.addAttribute("event", service.eventDetail(id));
		model.addAttribute("states", states);
		return "edit";
	}
	
	@PostMapping("/event/{id}")
	public String newEvent(@PathVariable(value="id") Long id, @ModelAttribute("event") Event newEvent, BindingResult result, Principal principal) {
		service.updateEvent(id, newEvent);
		return "redirect:/events";
	}
	
	@RequestMapping("/delete/{id}")
	public String deleteEvent(@PathVariable(value="id") Long id) {
		service.deleteEvent(id);
		return "redirect:/events";
	}
	
	@RequestMapping("/join/{id}")
	public String joinEvent(@PathVariable(value="id") Long id, Principal principal) {
		service.joinEvent(id, service.findByEmail(principal.getName()).getId());
		return "redirect:/events";
	}
	
	@RequestMapping("/cancel/{id}")
	public String cancelEvent(@PathVariable(value="id") Long id, Principal principal) {
		service.cancelEvent(id, service.findByEmail(principal.getName()).getId());
		return "redirect:/events";
	}
}
