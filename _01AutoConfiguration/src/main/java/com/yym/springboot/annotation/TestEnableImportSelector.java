package com.yym.springboot.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.context.annotation.Import;

import com.yym.springboot.selector.TestImportSelector;

/**
 * TestEnableImportSelector
 *
 * @Author: Yym
 * @Version: 1.0
 * @Date: 2025/4/1 16:23
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@AutoConfigurationPackage
@Import(TestImportSelector.class)
public @interface TestEnableImportSelector {
}
