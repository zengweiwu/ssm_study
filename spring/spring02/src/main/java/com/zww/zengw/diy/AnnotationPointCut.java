package com.zww.zengw.diy;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

//使用注解定义切面
@Aspect //标注这是一个切面
public class AnnotationPointCut {
    @Before("execution(* com.zww.zengw.service.serviceimpl.UserServiceImpl.*(..))")//指定切入点
    public void before(){
        System.out.println("=====方法执行前======");
    }

    @After("execution(* com.zww.zengw.service.serviceimpl.UserServiceImpl.*(..))")
    public void after(){
        System.out.println("=====方法执行后======");
    }
}
