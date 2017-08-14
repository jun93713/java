package com.jun.ProductsAndCategories.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import com.jun.ProductsAndCategories.models.*;
import com.jun.ProductsAndCategories.service.LalalaService;

@Controller
public class LalalaController {
	private final LalalaService service;
	public LalalaController(LalalaService service) {
		this.service = service;
	}
	
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
	@RequestMapping("/new/product")
	public String newProduct(@ModelAttribute("product") Product product) {
		return "newproduct";
	}
	
	@RequestMapping("/new/category")
	public String newCategory(@ModelAttribute("category") Category category) {
		return "newcategory";
	}
	
	@PostMapping("/new/product")
	public String addProduct(@Valid @ModelAttribute("product") Product product, BindingResult result) {
		if (result.hasErrors()) {
            return "newproduct";
        }else{
        		
            service.newProduct(product);
            return "redirect:/";
        }
	}
	
	@PostMapping("/new/category")
	public String addProduct(@Valid @ModelAttribute("category") Category category, BindingResult result) {
		if (result.hasErrors()) {
            return "newcategory";
        }else{
        		
            service.newCategory(category);
            return "redirect:/";
        }
	}

	@RequestMapping("/products/{id}")
	public String product(@PathVariable("id") Long id, Model model) {
		model.addAttribute("product", service.findOneProduct(id));
		model.addAttribute("categories", service.finaAllCate());
		return "product";
	}
	
	@PostMapping("/products/{id}/new")
	public String addCategoryToProduct(@PathVariable("id") Long id, @RequestParam(value="category") Long cateId) {
		service.addCategoryToProduct(cateId, id);
		String url = "redirect:/products/" + id;
		return url;
	}
	
}
