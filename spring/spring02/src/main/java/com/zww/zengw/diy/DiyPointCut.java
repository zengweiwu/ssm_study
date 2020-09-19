package com.zww.zengw.diy;

public class DiyPointCut {
    //前置通知
    public void before(){
        System.out.println("============执行方法前==============");
    }
    //后置通知
    public void after(){
        System.out.println("=============执行方法后=============");
    }
}
