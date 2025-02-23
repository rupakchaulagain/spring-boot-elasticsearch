package com.springbootelasticsearch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication(scanBasePackages = "com.springbootelasticsearch")
public class SpringBootElasticSearchApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SpringBootElasticSearchApplication.class);
    }

    public static void main(String[] args) {

        ConfigurableApplicationContext ctx = SpringApplication.run(SpringBootElasticSearchApplication.class, args);
    }

}

