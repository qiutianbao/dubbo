package com.jxtb.dubbo.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jxtb.dubbo.api.HelloApi;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jxtb on 2019/4/30.
 */
@RestController
public class HelloController {
    @Reference(version = "1.0.0")
    HelloApi helloApi;
    // http://localhost:8080/hello?name=jxtb
    @GetMapping("hello")
    public String sayHello(String name){
        return helloApi.sayHello(name);
    }
}
