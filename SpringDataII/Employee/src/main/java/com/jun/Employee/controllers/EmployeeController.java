package com.jun.Employee.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jun.Employee.models.Employee;
import com.jun.Employee.services.EmployeeService;

@Controller
public class EmployeeController {
	private EmployeeService service;
	public EmployeeController(EmployeeService service) {
		this.service = service;
	}
	
	@RequestMapping("/")
	public String index(@ModelAttribute("employee") Employee employee, Model model) {
		model.addAttribute("employees", service.allEm());
		return "index";
	}
	
	@PostMapping("/new")
	public String newEm(@ModelAttribute("employee") Employee employee, BindingResult result) {
		if (result.hasErrors()) {
			System.out.println("Errors");
	        return "redirect:/";
	    }
		service.newEmployee(employee);
		return "redirect:/";
	}
	
	@PostMapping("/manager")
	public String newManager(@RequestParam(value="manager") Long managerid, @RequestParam(value="employee") Long employeeid) {
		
		service.addEmployeeToManager(managerid, employeeid);
		return "redirect:/";
	}
}
