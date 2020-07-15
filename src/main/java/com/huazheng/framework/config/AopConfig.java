package com.huazheng.framework.config;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @Classname AopConfig
 * @Description TODO
 * @Date 2020/7/15 16:36
 * @Created by zhanghuazheng
 */

@Aspect
@Component
public class AopConfig {

    @Before("execution( * com.huazheng.framework.domain.CaluateImpl.*(..))")
    public void before(){
        System.out.println("方法执行前");
    }

    @After("execution( * com.huazheng.framework.domain.CaluateImpl.*(..))")
    public void after(){
        System.out.println("方法执行后");
    }

    @Around("execution( * com.huazheng.framework.domain.CaluateImpl.*(..))")
    public void around(ProceedingJoinPoint jp) throws Throwable {
        System.out.println("方法执行后");
        Object proceed = jp.proceed();
        System.out.println(proceed);
    }
}
