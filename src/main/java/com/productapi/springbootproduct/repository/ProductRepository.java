package com.productapi.springbootproduct.repository;

import com.productapi.springbootproduct.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {
    Product findByName(String name);

   // String deleteAllById(int id);
}
