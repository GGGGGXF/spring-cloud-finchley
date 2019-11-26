package com.example.eurekaconsumerfeign.controller;

import com.example.eurekaconsumerfeign.Service.HelloRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author GuanXioaFeng
 * @date 2019/11/25 15:21
 * @Description feign消费者controller
 **/
@RestController
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    private HelloRemote helloRemote;

    @GetMapping("/{name}")
    public String index(@PathVariable("name") String name) {
        return helloRemote.hello(name+ "!");
    }
}
