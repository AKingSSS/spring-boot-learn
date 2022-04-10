package com.aking.learn;

import com.aking.learn.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author yangkang
 * @date 2022/4/10
 */
public class Application {
    public static void main(String[] args) {
        final ClassPathXmlApplicationContext ac =
            new ClassPathXmlApplicationContext("bean.xml");
        System.out.println(ac.getBean("userService", UserService.class));

    }
}
