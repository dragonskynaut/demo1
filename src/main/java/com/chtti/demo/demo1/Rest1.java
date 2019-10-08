package com.chtti.demo.demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Rest1 {
    private int count=0;
    @Autowired
    Message message;

    @RequestMapping("/hello")
    Message h1() {
        message.setId(count++);
        message.setDetail("Dragon");
        return message;
    }
}
