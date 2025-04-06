package com.yym.dubbo;

import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author: Yym
 * @Version: 1.0
 * @Date: 2025/4/3 13:53
 */
@DubboComponentScan
@SpringBootApplication
public class ProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication.class, args);
        System.out.println("** provider start **");
    }
}
