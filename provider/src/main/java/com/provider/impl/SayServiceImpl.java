package com.provider.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.Iservice.SayService;
import org.springframework.stereotype.Component;

@Service
@Component
public class SayServiceImpl implements SayService {

    @Override
    public String sayHello(String name) {
        return "hello" + name;
    }

    @Override
    public String sayGoodbye(String name) {
        return "good bye" + name;
    }
}
