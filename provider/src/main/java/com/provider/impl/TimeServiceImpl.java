package com.provider.impl;

import com.Iservice.TimeService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

import java.util.Date;

@Service
@Component
public class TimeServiceImpl implements TimeService {
    @Override
    public String getTime() {
        String date= String.valueOf(new Date());
        return date;
    }
}
