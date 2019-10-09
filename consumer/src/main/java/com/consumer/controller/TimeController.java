package com.consumer.controller;

import com.Iservice.TimeService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TimeController {

    @Reference
    private TimeService timeServiceImpl;

    @RequestMapping(path = "time/now",method = RequestMethod.GET)
    public String getTimeString(){
        return "Time is "+timeServiceImpl.getTime();
    }
}
