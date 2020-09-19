package com.zww.zengw.SpingProxys;

import com.zww.zengw.service.UserService;
import com.zww.zengw.service.serviceimp.UserServiceImpl;

public class ProxyTest {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        //创建生成代理实例的对象
        ProxyInvocationhander pih = new ProxyInvocationhander();
        //注入接口 生成代理实例
        pih.setTarget(userService);
        UserService proxy = (UserService) pih.getProxy();
        proxy.add();
    }
}
