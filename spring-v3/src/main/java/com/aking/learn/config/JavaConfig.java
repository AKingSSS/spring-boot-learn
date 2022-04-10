package com.aking.learn.config;

import com.aking.learn.pojo.Teacher;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author yangkang
 * @date 2022/4/10
 */
@Configuration
@Import(value = {RedisConfig.class, MqConfig.class})
public class JavaConfig {
    @Bean(name = "teacher")
    public Teacher getTeacher() {
        return new Teacher("java");
    }
}
