package com.zww.zengw.SpingProxys;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 动态代理模板
 */
public class ProxyInvocationhander implements InvocationHandler {
    private Object target;
    //将接口注入

    public void setTarget(Object target) {
        this.target = target;
    }

    //获取动态代理实例
    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        String name = method.getName();
        getMsg(name);
        //执行真实对象的方法 返回结果
        return method.invoke(target,args);
    }

    public void getMsg(String msg){
        System.out.println("执行了"+msg+"方法");
    }
}
