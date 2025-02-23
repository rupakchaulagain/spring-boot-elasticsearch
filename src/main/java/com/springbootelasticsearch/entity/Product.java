package com.springbootelasticsearch.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(indexName = "product")
public class Product implements Serializable {

    @Id
    private String id;

    @Field(type = FieldType.Text,name = "productName")
    private String productName;

    @Field(type = FieldType.Text,name = "productCategory")
    private String productCategory;

    @Field(type = FieldType.Integer,name = "price")
    private int price;
}
