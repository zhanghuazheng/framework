package com.huazheng.framework.spring.aop;

/**
 * @Classname Client
 * @Description TODO
 * @Date 2020/7/15 15:49
 * @Created by zhanghuazheng
 */
public class Client {
    public static void main(String[] args) {
        //1.正常租房
//        Host host = new Host();
//        host.rent();


        //2.采用代理方式
        Host host2 = new Host3();
        new Proxy(host2).rent();

    }
}
