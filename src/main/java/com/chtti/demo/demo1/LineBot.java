package com.chtti.demo.demo1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component("normal")
public class LineBot implements Greeting{
    private static final Logger LOGGER = LoggerFactory.getLogger(LineBot.class);

    @Override
    public void sayHello(String name) {
        LOGGER.info(String.format("Hi, %s, I am your CRM Manager Dragon.", name));
    }
}
