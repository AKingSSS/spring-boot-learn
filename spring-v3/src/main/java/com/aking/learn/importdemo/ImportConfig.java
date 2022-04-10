package com.aking.learn.importdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author yangkang
 * @date 2022/4/10
 */
@Configuration
@Import(value = {MyImportSelector.class})
public class ImportConfig {

    public static void main(String[] args) {
        final AnnotationConfigApplicationContext ac =
            new AnnotationConfigApplicationContext(ImportConfig.class);
        for (String beanDefinitionName : ac.getBeanDefinitionNames()) {
            System.out.println("beanDefinitionName = " + beanDefinitionName);
        }
    }

}
