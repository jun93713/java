package com.jun.LoginAndReg.controllers;

import java.security.Principal;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jun.LoginAndReg.models.User;
import com.jun.LoginAndReg.services.LoginAndRegService;

@Controller
public class LoginAndRegController {
	private LoginAndRegService loginAndRegService;
	
	public LoginAndRegController(LoginAndRegService loginAndRegService) {
		this.loginAndRegService = loginAndRegService;
	}
	
	@RequestMapping("/")
	public String index(@Valid @ModelAttribute("user") User user ) {
		return "loginandreg";
	}
	
	@PostMapping("/registration")
	public String registration(@ModelAttribute("user") User user, BindingResult result) {
		System.out.println("CONTROLLER!!!");
		if(result.hasErrors()) {
			System.out.println("ERROR!!!");
			return "loginandreg";
		}
		else {
			System.out.println("controller before service");
			loginAndRegService.saveUser(user);
			System.out.println("controller, after service");
			return "redirect:/";
		}
	}
	
	@RequestMapping("/login")
    public String login(@RequestParam(value="error", required=false) String error, @RequestParam(value="logout", required=false) String logout, Model model) {
        if(error != null) {
            model.addAttribute("errorMessage", "Invalid Credentials, Please try again.");
        }
        if(logout != null) {
            model.addAttribute("logoutMessage", "Logout Successfull!");
        }
        return "loginPage.jsp";
    }
	
	@RequestMapping("/dashboard")
    public String home(Principal principal, Model model) {
        String username = principal.getName();
        model.addAttribute("currentUser", loginAndRegService.findByEmail(username));
        return "homePage.jsp";
    }
	
	
}
