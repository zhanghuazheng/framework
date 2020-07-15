package com.huazheng.framework.main;

import com.huazheng.framework.domain.Caluate;
import com.huazheng.framework.domain.CaluateImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Classname MainTest
 * @Description TODO
 * @Date 2020/7/15 13:53
 * @Created by zhanghuazheng
 */
public class MainTest5 {
    public static void main(String[] args) {
//        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
//        ApplicationContext context = new AnnotationConfigApplicationContext(CaluateImpl.class);

        ApplicationContext context = new ClassPathXmlApplicationContext("spring-annotion2.xml");
        Caluate caluate = context.getBean("caluate",Caluate.class);
        System.out.println(caluate);
        caluate.add(2, 3);
        caluate.divide();
        caluate.multip();
        caluate.substract();

    }
}
