package com.huazheng.framework.spring.aop;

/**
 * @Classname Host
 * @Description TODO
 * @Date 2020/7/15 15:49
 * @Created by zhanghuazheng
 */
public class Host2 extends Host implements Rent {
    public void rent() {
        System.out.println("房东出租豪宅");
    }
}
