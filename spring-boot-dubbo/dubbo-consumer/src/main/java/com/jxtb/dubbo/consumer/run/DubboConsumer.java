package com.jxtb.dubbo.consumer.run;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * 描述: 启动服务
 *
 * Created by jxtb on 2019/4/30.
 **/
@SpringBootApplication
@ComponentScan(value = {"com.jxtb.dubbo"})
public class DubboConsumer {

    public static void main(String[] args) {
        SpringApplication.run(DubboConsumer.class, args);
    }
}
