package com.yym.springboot.selector;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

import com.yym.springboot.entity.FirstClass;
import com.yym.springboot.entity.SecondClass;

/**
 * @Author: Yym
 * @Version: 1.0
 * @Date: 2025/4/1 16:22
 */
public class TestImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{FirstClass.class.getName(), SecondClass.class.getName()};
    }
}
