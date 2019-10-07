package com.chtti.demo.demo1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class whatever {
    @RequestMapping("/")
    String indexRoot(){
        return "Hello initial D2";
    }

    @RequestMapping("/first/record")
    pointOfInterest showFirstRecord(){
        return new pointOfInterest("a","b");
    }
}
