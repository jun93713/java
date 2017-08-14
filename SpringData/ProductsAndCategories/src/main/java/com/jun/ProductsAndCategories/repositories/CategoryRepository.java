package com.jun.ProductsAndCategories.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jun.ProductsAndCategories.models.Category;
@Repository
public interface CategoryRepository extends CrudRepository<Category, Long> {
	
}
