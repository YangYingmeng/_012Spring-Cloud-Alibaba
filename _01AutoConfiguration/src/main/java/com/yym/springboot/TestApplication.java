package com.yym.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.yym.springboot.annotation.TestEnableImportSelector;
import com.yym.springboot.conditionnal.TestClass;
import com.yym.springboot.entity.FirstClass;

@SpringBootApplication
@TestEnableImportSelector
public class TestApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext ca = SpringApplication.run(TestApplication.class, args);
        FirstClass bean = ca.getBean(FirstClass.class);
        TestClass testClass = ca.getBean(TestClass.class);
        System.out.println(testClass);
    }
}
