package com.yym.dubbo.controller;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yym.dubbo.TestService;

/**
 * @Author: Yym
 * @Version: 1.0
 * @Date: 2025/4/6 11:37
 */
@RestController
public class TestController {
    @Reference
    private TestService testService;

    @GetMapping("/test")
    public String sayHello(){
        return testService.test("consumer");
    }
}
