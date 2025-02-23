package com.springbootelasticsearch.service.impl;

import com.springbootelasticsearch.entity.Product;
import com.springbootelasticsearch.repository.ProductRepository;
import com.springbootelasticsearch.service.ElasticSearchService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Slf4j
@Service
public class ElasticSearchServiceImpl implements ElasticSearchService {

    private final ProductRepository productRepository;

    @Override
    public void saveAll(List<Product> dataList) {
        log.info("Saving {} product to Elasticsearch", dataList.size());
        productRepository.saveAll(dataList);
    }

    @Override
    public List<Product> findByFirstName(String firstName) {
        log.info("Fetching products with product name: {}", firstName);
        return productRepository.findByProductName(firstName);
    }

    @Override
    public Iterable<?> fetchAll() {
        log.info("Fetching all data from elastic search");
        return productRepository.findAll();
    }
}
