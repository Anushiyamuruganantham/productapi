package com.productapi.springbootproduct.controller;

import com.productapi.springbootproduct.entity.Product;
import com.productapi.springbootproduct.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ProductController {
@Autowired
    private ProductService service;
@PostMapping("/product")
    public Product addProduct(@RequestBody Product product){
    return service.saveProduct(product);
}
@PostMapping("/products")
    public List <Product>addProducts(@RequestBody List< Product> products)
{
    return service.saveProducts(products);
}
@GetMapping("/Product")
    public List<Product> findallProduct(){
    return service.getProduct();
}
@GetMapping("/product/{product_id}")
    public Optional <Product> getProductbyId(@PathVariable Integer product_id){
    return service.getProductbyId(product_id);
}

    @GetMapping("/product/{product_name}")
    public Product findbyname(@PathVariable String name){
        return service.getProductbyName(name);
    }
    @PutMapping("/product")
    public  Product updateProduct(@RequestBody Product product,@PathVariable("product_id")Integer product_id){
        return service.updateProduct(product,product_id);
    }
    @DeleteMapping("/product/{product_id}")
public void deleteProduct(@PathVariable ("product_id")int product_id){
     service.deleteProduct(product_id);
}
    }
