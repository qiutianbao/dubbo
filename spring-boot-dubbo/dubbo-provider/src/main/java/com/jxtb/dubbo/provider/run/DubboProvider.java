package com.jxtb.dubbo.provider.run;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * 描述:启动提供方服务
 * Created by jxtb on 2019/4/30.
 **/
@SpringBootApplication
@ComponentScan(value = {"com.jxtb.dubbo"})
public class DubboProvider {

    public static void main(String[] args) {
        SpringApplication.run(DubboProvider.class, args);
    }
}
