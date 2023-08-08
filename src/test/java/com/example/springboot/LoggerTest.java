package com.example.springboot;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.logging.Level;
import java.util.logging.Logger;

@SpringBootTest
public class LoggerTest {

    @Test
    public void test01() throws Exception{
        Logger logger = Logger.getLogger("com.example.springboot.LoggerTest");
        logger.info("aaa");
        logger.log(Level.INFO,"aaa{0}{1}",new Object[]{1,2});
    }
}
