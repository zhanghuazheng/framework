package com.huazheng.framework.main;

import com.huazheng.framework.domain.Food;
import com.huazheng.framework.domain.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Classname MainTest
 * @Description TODO
 * @Date 2020/7/15 13:53
 * @Created by zhanghuazheng
 */
public class MainTest2 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        User user = (User)context.getBean("user");
        System.out.println(user);

        user.getCat().shout();
        user.getDog().shout();
    }
}
