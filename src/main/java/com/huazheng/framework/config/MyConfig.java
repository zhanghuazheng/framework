package com.huazheng.framework.config;

import com.huazheng.framework.domain.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Classname MyConfig
 * @Description TODO
 * @Date 2020/7/15 15:34
 * @Created by zhanghuazheng
 */

@Configuration
public class MyConfig {
    @Bean
    public User user(){
        return new User();
    }
}
