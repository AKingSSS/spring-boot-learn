package com.aking.learn;

import com.aking.learn.config.JavaConfig;
import com.aking.learn.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author yangkang
 * @date 2022/4/10
 */
public class Application {

    public static void main(String[] args) {
        final AnnotationConfigApplicationContext ac =
            new AnnotationConfigApplicationContext(JavaConfig.class);
        System.out.println(ac.getBean(UserService.class));
    }
}
