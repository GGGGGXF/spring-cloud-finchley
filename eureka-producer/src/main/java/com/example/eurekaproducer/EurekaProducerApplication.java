package com.example.eurekaproducer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Finchley.RC1 这个版本的 Spring Cloud 已经无需添加 @EnableDiscoveryClient 注解
 * @author GXF
 */
@SpringBootApplication
public class EurekaProducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaProducerApplication.class, args);
    }

}
