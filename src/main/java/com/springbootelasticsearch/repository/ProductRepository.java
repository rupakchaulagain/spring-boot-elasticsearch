package com.springbootelasticsearch.repository;

import com.springbootelasticsearch.entity.Product;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

public interface ProductRepository extends ElasticsearchRepository<Product, String>{

	List<Product> findByProductName(String productName);

}