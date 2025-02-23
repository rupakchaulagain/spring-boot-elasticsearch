package com.springbootelasticsearch.service;

import com.springbootelasticsearch.entity.Product;

import java.util.List;

public interface ElasticSearchService {

    void saveAll(List<Product> dataList);

    Iterable<?> fetchAll();

    List<Product> findByFirstName(String firstName);
}
