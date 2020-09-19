package com.zww.zengw.log;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;
//方法执行后增强
public class AfterLog implements AfterReturningAdvice {
    //o:返回值 01：被代理的接口
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("执行了"+method.getName()+"返回的结果为"+o);
    }
}
