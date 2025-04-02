package com.yym.springboot.conditionnal;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @Author: Yym
 * @Version: 1.0
 * @Date: 2025/4/2 11:24
 */
public class CustomConditional implements Condition {

    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        //此处进行条件判断，如果返回true，表示需要加载该配置类或者Bean
        //否则，表示加载
        String os = conditionContext.getEnvironment().getProperty("os.name");
        if (os.contains("Windows")) {
            return true;
        }
        return false;
    }
}
