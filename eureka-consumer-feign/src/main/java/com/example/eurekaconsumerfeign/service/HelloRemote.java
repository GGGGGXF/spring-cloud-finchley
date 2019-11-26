package com.example.eurekaconsumerfeign.service;

import com.example.eurekaconsumerfeign.service.impl.HelloRemoteHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author GuanXioaFeng
 * @date 2019/11/25 15:18
 * @Description 客户端接口
 **/
@FeignClient(name = "eureka-producer", fallback = HelloRemoteHystrix.class)
public interface HelloRemote {

    /**
     * 请求接口
     * @param name
     * @return
     */
    @GetMapping("/hello/")
    String hello(@RequestParam(value = "name") String name);
}
