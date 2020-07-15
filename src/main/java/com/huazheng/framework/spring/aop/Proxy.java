package com.huazheng.framework.spring.aop;

/**
 * @Classname Proxy
 * @Description TODO
 * @Date 2020/7/15 15:51
 * @Created by zhanghuazheng
 */
public class Proxy implements Rent {

    private Host host;

    public Proxy() {

    }

    public Proxy(Host host) {
        this.host = host;
    }

    public void rent() {
        seeHouse();
        host.rent();
    }

    private void seeHouse() {
        System.out.println("中介带看房屋");
    }
}
