package com.chtti.demo.demo1;


import com.chtti.demo.demo1.calculate.AddCalculator;
import com.chtti.demo.demo1.calculate.Calculator;
import com.chtti.demo.demo1.calculate.MulCalculator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class AppConfig {
    @Bean(name="add")
    Calculator x1(){
        return  new AddCalculator();
    }

    @Bean(name="mul")
    Calculator y1(){
        return  new MulCalculator();
    }
}
