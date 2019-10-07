package com.chtti.demo.demo1;

import org.springframework.stereotype.Controller;

@Controller
public class GreetingController {
    public String greeting(){
        return "page1";
    }

}
