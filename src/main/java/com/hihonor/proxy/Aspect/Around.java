package com.hihonor.proxy.Aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Around {

    @Pointcut("execution(* * (..))")
    public void myPoinCut() {

    }


    @org.aspectj.lang.annotation.Around(value = "myPoinCut()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("log before1");
        Object ret = joinPoint.proceed();
        return ret;
    }

    @org.aspectj.lang.annotation.Around(value = "myPoinCut()")
    public Object around1(ProceedingJoinPoint joinPoint) throws Throwable {
        Object ret = joinPoint.proceed();
        System.out.println("log before");
        return ret;
    }
}
