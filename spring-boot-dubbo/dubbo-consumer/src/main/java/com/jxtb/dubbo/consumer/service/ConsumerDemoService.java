package com.jxtb.dubbo.consumer.service;

import com.jxtb.dubbo.api.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 描述: 消费远程方法
 *
 * Created by jxtb on 2019/4/30.
 **/
@Service("consumerDemoService")
public class ConsumerDemoService {

    @Autowired
    private DemoService demoService;

    public void sayHello(String name) {
        String hello = demoService.sayHello(name); // 执行消费远程方法
        System.out.println(hello); // 显示调用结果
    }

}
