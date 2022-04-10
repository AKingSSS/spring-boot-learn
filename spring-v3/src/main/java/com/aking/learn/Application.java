package com.aking.learn;

import com.aking.learn.config.JavaConfig;
import com.aking.learn.config.MqConfig;
import com.aking.learn.config.RedisConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author yangkang
 * @date 2022/4/10
 */
public class Application {

    @Test
    public void testImport() {
        final ApplicationContext ac = new AnnotationConfigApplicationContext(JavaConfig.class);
        System.out.println(ac.getBean(RedisConfig.class));
        System.out.println(ac.getBean(MqConfig.class));
    }
}
