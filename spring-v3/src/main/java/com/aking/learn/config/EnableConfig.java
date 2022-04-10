package com.aking.learn.config;

import com.aking.learn.annotation.EnableRedisAutoConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

/**
 * @author yangkang
 * @date 2022/4/10
 */
@Configuration
@EnableRedisAutoConfiguration
public class EnableConfig {

    public static void main(String[] args) {
        final AnnotationConfigApplicationContext ac =
            new AnnotationConfigApplicationContext(EnableConfig.class);
        System.out.println(ac.getBean(RedisConfig.class));
    }
}
