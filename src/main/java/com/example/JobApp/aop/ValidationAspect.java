package com.example.JobApp.aop;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class ValidationAspect {
    private static final Logger LOGGER = LoggerFactory.getLogger(ValidationAspect.class);

    @Around("execution(* com.example.JobApp.service.JobService.getJobPost(..)) && args(postId)")
    public Object validationAndUpdate(ProceedingJoinPoint jb, int postId) throws Throwable {

        // we will set post id to positive before post it gone to getJobPost
        if(postId<0){
            LOGGER.info("$$$$$$$$ Post id is negative");
            postId = -postId;
            LOGGER.info("new value {}", postId);
        }

        Object obj = jb.proceed(new Object[]{postId});

        return obj;

    }

}
