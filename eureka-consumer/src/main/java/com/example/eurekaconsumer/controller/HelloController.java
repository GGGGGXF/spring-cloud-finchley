package com.example.eurekaconsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author GuanXioaFeng
 * @date 2019/11/25 14:36
 * @Description 消费者HelloController
 **/
@RestController
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    private LoadBalancerClient client;

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/")
    public String hello(@RequestParam String name) {
        name += "!";
        ServiceInstance instance = client.choose("eureka-producer");
        String url = "http://" + instance.getHost() + ":" + instance.getPort() + "/hello/?name=" + name;
        return restTemplate.getForObject(url, String.class);
    }
}
