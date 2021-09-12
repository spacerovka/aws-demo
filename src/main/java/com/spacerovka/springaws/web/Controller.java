package com.spacerovka.springaws.web;

import com.spacerovka.springaws.repo.Product;
import com.spacerovka.springaws.repo.ProductRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    private final ProductRepository productRepository;

    public Controller(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping("/dynamodb/{id}")
    Product getProductFromDynamoDB(@PathVariable String id) {
        return productRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid id supplied"));
    }
}
