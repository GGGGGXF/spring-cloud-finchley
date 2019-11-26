package com.example.eurekaproducer.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author GuanXioaFeng
 * @date 2019/11/25 13:57
 * @Description 提供hello服务
 **/
@RestController
@RequestMapping("/hello")
public class HelloController {

    @Value("${config.producer.instance:0}")
    private int instance;

    /**
     * 返回 hello xxx，日期
     * @param name
     * @return
     */
    @RequestMapping("/")
    public String hello(@RequestParam String name) {
        return "[" + instance + "]" + "Hello, " + name + " " + new Date();
    }
}
