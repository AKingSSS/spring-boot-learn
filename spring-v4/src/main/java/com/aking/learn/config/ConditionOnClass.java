package com.aking.learn.config;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @author yangkang
 * @date 2022/4/10
 */
public class ConditionOnClass implements Condition {
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        String className = "com.aking.learn.config.RedisConfiguration";
        try {
            final Class<?> aClass = Class.forName(className);
            if (aClass != null) {
                return true;
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return false;
        }

        return false;
    }
}
