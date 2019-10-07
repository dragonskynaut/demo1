package com.chtti.demo.demo1;

import com.chtti.demo.demo1.calculate.Calculator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class BootRunner implements CommandLineRunner {
    @Autowired
    private ApplicationContext context;
    private static final Logger LOGGER = LoggerFactory.getLogger(BootRunner.class.getSimpleName());
    @Override
    public void run(String... args) throws Exception {
        Calculator b2 = context.getBean("mul", Calculator.class);
        LOGGER.info("----calculate 3,2 with calculator:"+ b2.calc(3,2) +"------");
    }
}
