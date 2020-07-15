package com.huazheng.framework.config;

/**
 * @Classname PointCut
 * @Description TODO
 * @Date 2020/7/15 17:18
 * @Created by zhanghuazheng
 */
public class PointCut {
    public void before(){
        System.out.println("---------------方法执行前---------");
    }

    public void after(){
        System.out.println("---------------方法执行后---------");
    }

    public void log(){
        System.out.println("自定义的日志类");
    }
}
