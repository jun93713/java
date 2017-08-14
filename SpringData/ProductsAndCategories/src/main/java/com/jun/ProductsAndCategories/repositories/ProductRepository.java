package com.jun.ProductsAndCategories.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jun.ProductsAndCategories.models.*;
@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {
	
}
