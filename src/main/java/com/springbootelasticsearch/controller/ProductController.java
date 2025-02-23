package com.springbootelasticsearch.controller;

import com.springbootelasticsearch.entity.Product;
import com.springbootelasticsearch.service.ElasticSearchService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
@RequiredArgsConstructor
@Slf4j
public class ProductController {

    private final ElasticSearchService elasticSearchService;

    @PostMapping("/saveProduct")
    public int saveCustomer(@RequestBody List<Product> productList) {
        elasticSearchService.saveAll(productList);
        return productList.size();
    }

    @GetMapping("/findAll")
    public Iterable<?> findAllProducts() {
        return elasticSearchService.fetchAll();
    }

    @GetMapping("/findByProductName/{productName}")
    public List<Product> findByFirstName(@PathVariable String productName) {
        return elasticSearchService.findByFirstName(productName);
    }

}
