package com.zww.zengw.log;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;
//在执行的方法前增强
public class Log implements MethodBeforeAdvice {
    //method指要执行的方法
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println(method.getName()+"开始执行！");
    }
}
