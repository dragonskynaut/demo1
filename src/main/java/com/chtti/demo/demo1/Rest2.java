package com.chtti.demo.demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Rest2 {

    private int counter=0;
    @Autowired
    Message m2;

    @RequestMapping("/welcome")
    Message h1() {
        counter+=2;
        m2.setDetail("something complex");
        m2.setId(counter);
        return m2;
    }
}
