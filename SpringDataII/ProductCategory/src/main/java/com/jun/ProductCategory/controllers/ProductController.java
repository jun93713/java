package com.jun.ProductCategory.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jun.ProductCategory.models.Product;
import com.jun.ProductCategory.services.ProductService;

@Controller
public class ProductController {
	@Autowired
	private ProductService service;
	public ProductController(ProductService service) {
		this.service = service;
	}
	
	
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
	@RequestMapping(value = "/products", method = RequestMethod.POST, headers = "Accept=application/json")
	public String postProduct(@RequestBody Product product) {
		System.out.println(product);
		
		return "redirect:/";
	}
}
