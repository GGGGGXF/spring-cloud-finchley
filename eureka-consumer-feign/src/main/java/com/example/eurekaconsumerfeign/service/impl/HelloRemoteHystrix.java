package com.example.eurekaconsumerfeign.service.impl;

import com.example.eurekaconsumerfeign.service.HelloRemote;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author GuanXioaFeng
 * @date 2019/11/26 13:04
 * @Description SpringCloud断路器，实现HelloRemote 中实现回调的方法
 * 通过使用 Hystrix，我们能方便的防止雪崩效应，同时使系统具有自动降级和自动恢复服务的效果
 **/
@Component
public class HelloRemoteHystrix implements HelloRemote {

    @Override
    public String hello(@RequestParam(value = "name") String name) {
        return "Hello World!";
    }
}