package com.company.product.template;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@MapperScan(basePackages = {"com.company.product.template.mapper"})
public class TemplateApplication {
    @Autowired
    private ApplicationContext applicationContext;



    public static void main(String[] args) {
        SpringApplication.run(TemplateApplication.class, args);
    }

}
