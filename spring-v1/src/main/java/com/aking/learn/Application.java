package com.aking.learn;

import com.aking.learn.pojo.Teacher;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author yangkang
 * @date 2022/4/10
 * spring 1.X 版本没有提供根据type获取bean
 */
public class Application {
    @Test
    public void testV1() {
        final ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("teacherBean.xml");
        //spring 1.X 版本没有提供根据type获取bean
        //System.out.println(ac.getBean(Teacher.class));
        System.out.println(ac.getBean("teacher", Teacher.class));

    }
}
