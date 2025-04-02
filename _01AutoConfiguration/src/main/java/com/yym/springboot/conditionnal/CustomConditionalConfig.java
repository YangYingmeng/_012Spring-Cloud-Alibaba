package com.yym.springboot.conditionnal;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: Yym
 * @Version: 1.0
 * @Date: 2025/4/2 14:04
 */
@Configuration
public class CustomConditionalConfig {

    @Bean
    @ConditionalOnBean
    @Conditional(CustomConditional.class)
    public TestClass testClass() {
        return new TestClass();
    }
}
