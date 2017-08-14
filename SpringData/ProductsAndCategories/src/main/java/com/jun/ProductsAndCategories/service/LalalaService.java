package com.jun.ProductsAndCategories.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jun.ProductsAndCategories.models.*;
import com.jun.ProductsAndCategories.repositories.*;

@Service
public class LalalaService {
	private ProductRepository productRepo;
	private CategoryRepository categoryRepo;
	
	public LalalaService(ProductRepository productRepo, CategoryRepository categoryRepo) {
		this.productRepo = productRepo;
		this.categoryRepo = categoryRepo;
	}
	
	public void newProduct(Product product) {
		productRepo.save(product);
	}
	
	public void newCategory(Category category) {
		categoryRepo.save(category);
	}
	
	public void addCategoryToProduct(Long cateId, Long id) {
		Product product = productRepo.findOne(id);
		product.getCategories().add(categoryRepo.findOne(cateId));
		productRepo.save(product);
	}
	
	public Product findOneProduct(Long id) {
		return productRepo.findOne(id);
	}
	
	public List<Category> finaAllCate(){
		return (List<Category>) categoryRepo.findAll();
	}
}
