package com.productapi.springbootproduct.service;

import com.productapi.springbootproduct.entity.Product;
import com.productapi.springbootproduct.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repository;
//postmethod
    public Product saveProduct(Product product) {

        return repository.save(product);
    }

    //postmethod
    public List<Product> saveProducts(List<Product> products)
    {
        return repository.saveAll(products);
    }

    //getmethod
    public List<Product> getProduct(){
        return repository.findAll();
    }

    //getbyid
    public Optional <Product> getProductbyId(Integer product_id){

        return repository.findById(product_id);
    }
    //getbyname

    public Product getProductbyName(String name)
    {
        return repository.findByName(name);
    }
//delete
    public void deleteProduct(int product_id){

          repository.deleteById(product_id);
    }
//update
    public Product updateProduct( Product product, Integer product_id) {

        product.setId(product_id);
        return repository.save(product);
    }
    }

