package com.product;

import org.springframework.context.annotation.Bean;

public class productConfig {
    @Bean("product1")
    public product getProduct(){
        return new product(1,"bread","23-7-2022","26-7-2022");
    }
    @Bean("product2")
    public product getProduct2(){
        return new product(2,"choclate","2-7-2021","21-8-2022");
    }
    @Bean("product3")
    public product getProduct3(){
        return new product(3,"oil","7-9-2022","9-10-2022");
    }
}
