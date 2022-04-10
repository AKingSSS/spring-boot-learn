package com.aking.learn.annotation;

import com.aking.learn.config.RedisConfig;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @author yangkang
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@Import(value = {RedisConfig.class})
public @interface EnableRedisAutoConfiguration {
}
