package com.zyz.demo.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(100)
public class RequestLogAspectMethod {

    private final static Logger LOGGER = LoggerFactory.getLogger(RequestLogAspectMethod.class);

    //任何一个以“find“开始的方法
    @Pointcut("execution(* com.zyz.demo.service.UserService.find*(..))")
    public void show(){
    }

    @Before("show()")
    public void before(JoinPoint joinPoint){
        String name = joinPoint.getSignature().getName();
        LOGGER.info("{}方法开始执行(=====基于方法的切面=====)",name);
    }

}