package com.jun.ProductCategory.services;

import org.springframework.stereotype.Service;

import com.jun.ProductCategory.repositories.ProductRepository;
@Service
public class ProductService {

	private ProductRepository productRepository;
	public ProductService(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}
}
