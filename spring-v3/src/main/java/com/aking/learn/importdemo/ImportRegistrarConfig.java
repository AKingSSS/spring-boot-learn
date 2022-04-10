package com.aking.learn.importdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author yangkang
 * @date 2022/4/10
 */
@Configuration
@Import(value = {MyImportBeanDefinitionRegistrar.class})
public class ImportRegistrarConfig {

    public static void main(String[] args) {
        final AnnotationConfigApplicationContext ac =
            new AnnotationConfigApplicationContext(ImportRegistrarConfig.class);
        for (String beanDefinitionName : ac.getBeanDefinitionNames()) {
            System.out.println("beanDefinitionName = " + beanDefinitionName);
        }
    }

}
