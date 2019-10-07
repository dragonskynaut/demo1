package com.chtti.demo.demo1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {
    @RequestMapping("/greeting")
    public String greeting(@RequestParam(value = "name",
            required = false, defaultValue = "dragon") String name, Model model) {
        model.addAttribute("name", name);
        return "page1";
    }

}
