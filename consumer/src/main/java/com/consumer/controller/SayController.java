package com.consumer.controller;

import com.Iservice.SayService;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SayController {

    @Reference
    private SayService sayServiceImpl;

    @RequestMapping(path = "hello/{name}",method = RequestMethod.GET)
    public String sayHello(@PathVariable String name){
        return sayServiceImpl.sayHello(name);
    }

    @RequestMapping(path="goodbye/{name}",method = RequestMethod.GET)
    public String sayGoodbye(@PathVariable String name){
        return sayServiceImpl.sayGoodbye(name);
    }

    @RequestMapping(path="test/say/{word}",method = RequestMethod.GET)
    public String saySomething(@PathVariable String word){
        return sayServiceImpl.sayHello(word);
    }

}
