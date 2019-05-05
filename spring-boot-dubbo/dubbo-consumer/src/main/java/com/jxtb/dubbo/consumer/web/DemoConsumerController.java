package com.jxtb.dubbo.dubbo.consumer.web;

/**
 * 描述:
 *
 * Created by jxtb on 2019/4/30.
 **/

import com.jxtb.dubbo.api.DemoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class DemoConsumerController {

    @Resource
    private DemoService demoService;

    //http://localhost:8085/sayHello?name=jxtb
    @RequestMapping("/sayHello")
    public String sayHello(@RequestParam String name) {
        return demoService.sayHello(name);
    }
}