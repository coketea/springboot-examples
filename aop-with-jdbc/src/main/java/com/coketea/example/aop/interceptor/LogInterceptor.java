package com.coketea.example.aop.interceptor;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogInterceptor implements Ordered {

    private static final Logger logger = LoggerFactory.getLogger(LogInterceptor.class);

    @Override
    public int getOrder() {
        return 1;
    }

    @Around("execution(* com.coketea.example.aop.controller.*.*(..))")
    public Object around(ProceedingJoinPoint point) throws Throwable {
        logger.info("Controller accessed!");
        return point.proceed();
    }

}
