package com.jun.ProductCategory.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jun.ProductCategory.models.Product;
@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {

}
