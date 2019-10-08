package com.consumer.controller;

import com.Iservice.SayService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Component
public class SayController {

    @Reference
    private SayService sayService;

    @RequestMapping(path = "hello/{name}",method = RequestMethod.GET)
    public String sayHello(@PathVariable String name){
        return sayService.sayHello(name);
    }

    @RequestMapping(path="goodbye/{name}",method = RequestMethod.GET)
    public String sayGoodbye(@PathVariable String name){
        return sayService.sayGoodbye(name);
    }

}
