package com.huazheng.framework.main;

import com.huazheng.framework.config.MyConfig;
import com.huazheng.framework.domain.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Classname MainTest
 * @Description TODO
 * @Date 2020/7/15 13:53
 * @Created by zhanghuazheng
 */
public class MainTest3 {
    public static void main(String[] args) {
//        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        ApplicationContext context = new AnnotationConfigApplicationContext("com.huazheng.framework.config");
        User user = (User)context.getBean("user");
        System.out.println(user);

    }
}
