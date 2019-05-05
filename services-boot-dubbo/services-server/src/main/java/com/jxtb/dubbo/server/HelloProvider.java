package com.jxtb.dubbo.server;

import com.alibaba.dubbo.config.annotation.Service;
import com.jxtb.dubbo.api.HelloApi;

/**
 * Created by jxtb on 2019/4/30.
 */
@Service(version = "1.0.0")
public class HelloProvider implements HelloApi {
    @Override
    public String sayHello(String name) {
        return "Hello , "+name;
    }
}
