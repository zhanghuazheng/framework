package com.huazheng.framework.service.impl;

import com.huazheng.framework.service.IUserService;

/**
 * @Classname UserMysqlService
 * @Description TODO
 * @Date 2020/7/15 11:05
 * @Created by zhanghuazheng
 */
public class UserMysqlService implements IUserService {
    @Override
    public void getUser() {
        System.out.println("mysql 获取用户信息");
    }
}
