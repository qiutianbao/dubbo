package com.jxtb.dubbo.dubbo.test;

import com.jxtb.dubbo.consumer.run.DubboConsumer;
import com.jxtb.dubbo.consumer.service.ConsumerDemoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 描述: 测试消费远程服务
 *
 * Created by jxtb on 2019/4/30.
 **/
@RunWith(SpringRunner.class)
@SpringBootTest(classes = DubboConsumer.class)
public class ConsumerTest {

    @Autowired
    private ConsumerDemoService consumerDemoService;

    @Test
    public void sayHello(){
        consumerDemoService.sayHello("Peng Lei");
    }
}
