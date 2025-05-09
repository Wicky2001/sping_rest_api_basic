package com.example.JobApp.aop;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect

public class LoggingAspect {


    private static final Logger LOGGER = LoggerFactory.getLogger(LoggingAspect.class);

    // (return_type class_name.method-name(args))


    @Before("execution(* *.*(..)")
    public void logMethodCall(){
        LOGGER.info("Method called");
    }
}
