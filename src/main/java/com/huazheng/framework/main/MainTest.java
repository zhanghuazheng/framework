package com.huazheng.framework.main;

import com.huazheng.framework.domain.Food;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Classname MainTest
 * @Description TODO
 * @Date 2020/7/15 13:53
 * @Created by zhanghuazheng
 */
public class MainTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Food food = (Food)context.getBean("food");
        System.out.println(food);
    }
}
