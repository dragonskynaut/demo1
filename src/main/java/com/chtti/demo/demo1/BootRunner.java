package com.chtti.demo.demo1;

import com.chtti.demo.demo1.calculate.Calculator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class BootRunner implements CommandLineRunner {
    @Autowired
    private ApplicationContext context;
    @Autowired
    @Qualifier("vip")
    private Greeting e2;

    private static final Logger LOGGER = LoggerFactory.getLogger(BootRunner.class.getSimpleName());
    @Override
    public void run(String... args) throws Exception {
        Calculator b2 = context.getBean("mul", Calculator.class);
        LOGGER.info("----calculate 3,2 with calculator:"+ b2.calc(3,2) +"------");
        // call CRMManager: (iot in @context)
        CRMManager e1 = context.getBean(CRMManager.class);
        e1.sayHello("tutu1");
        e2.sayHello("tutu2");


    }
}
