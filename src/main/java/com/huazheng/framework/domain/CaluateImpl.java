package com.huazheng.framework.domain;

import org.springframework.stereotype.Component;

/**
 * @Classname Caluate
 * @Description 基本计算的实现类
 * @Date 2020/7/15 16:32
 * @Created by zhanghuazheng
 */
@Component
public class CaluateImpl implements Caluate{

    public int add(int a, int b) {
        int s = a+b;
        System.out.println("加法");
        System.out.println(s);
        return s;
    }

    public void substract() {
        System.out.println("减法");
    }

    public void multip() {
        System.out.println("乘法");

    }

    public void divide() {
        System.out.println("除法");

    }
}
