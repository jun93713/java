package com.jun.AdminDashboard.controllers;

import java.security.Principal;
import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jun.AdminDashboard.models.Role;
import com.jun.AdminDashboard.models.User;
import com.jun.AdminDashboard.services.UserService;

@Controller
public class SomeController {
	private UserService userService;
    
    public SomeController(UserService userService) {
    		this.userService = userService;
    }
    
    
	@RequestMapping("/")
	public String loginAndReggitrationForm(@Valid @ModelAttribute("user") User user, @RequestParam(value="error", required=false) String error, @RequestParam(value="logout", required=false) String logout, Model model) {
		if(error != null) {
            model.addAttribute("errorMessage", "Invalid Credentials, Please try again.");
        }
        if(logout != null) {
            model.addAttribute("logoutMessage", "Logout Successfull!");
        }
		
		return "loginandreg";
	}
	
	@PostMapping("/registration")
    public String registration(@Valid @ModelAttribute("user") User user, BindingResult result) {
	    if (result.hasErrors()) {
	        return "loginandreg";
	    }
	    if (userService.findAllUsers() == null) {
	    		userService.saveUserWithAdminRole(user);
	    }
	    else {
	    		userService.saveWithUserRole(user);
	    }
	    
    		return "redirect:";
    }
	
	@RequestMapping("/dashboard")
    public String home(Principal principal, Model model) {
        String username = principal.getName();
        model.addAttribute("currentUser", userService.findByUsername(username));
        return "dashboard";
    }
	
	@RequestMapping("/admin")
	public String admin(Principal principal, Model model) {
        // 1
        String username = principal.getName();
        model.addAttribute("currentUser", userService.findByUsername(username));
        model.addAttribute("users", userService.findAllUsers());
        List<User> users = userService.findAllUsers();
        List<Role> roles = users.get(1).getRoles();
        String role = roles.get(0).getName();
        System.out.println(role);
        return "admin";
    }
	

}
