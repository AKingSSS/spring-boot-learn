package com.aking.learn.config;

import com.aking.learn.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @author yangkang
 * @date 2022/4/10
 */
@Configuration
public class JavaConfig {
    @Bean
    @Conditional(ConditionOnClass.class)
    public UserService userService() {
        return new UserService();
    }
}
