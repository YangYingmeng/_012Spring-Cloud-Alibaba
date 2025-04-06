package com.yym.dubbo.service;

import org.apache.dubbo.config.annotation.Service;

import com.yym.dubbo.TestService;

/**
 * @Author: Yym
 * @Version: 1.0
 * @Date: 2025/4/3 13:51
 */
@Service
public class TestServiceImpl implements TestService {


    @Override
    public String test(String arg) {
        return "Hello World:"+arg;
    }
}
