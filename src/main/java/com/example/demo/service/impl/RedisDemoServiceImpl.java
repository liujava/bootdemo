package com.example.demo.service.impl;

import com.example.demo.service.RedisDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

/************************************************************************************
 * Copyright (c) 2018 ©  All Rights Reserved.
 * This software is published under liudong.
 * Software License version 1.0, a copy of which has been included with this
 * distribution in the LICENSE.txt file.
 *
 * File name:      RedisDemoServiceImpl.java
 * Create on:      2018/6/28	
 * Author :        liudong
 *
 * ChangeList
 * ----------------------------------------------------------------------------------
 * Date									Editor						ChangeReasons
 * 2018/6/28			                    liudong				    Create
 ************************************************************************************/
@Service
public class RedisDemoServiceImpl implements RedisDemoService {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;
    @Override
    public Object redisOperation() {
        String value = stringRedisTemplate.opsForValue().get("testRedis");
        if (StringUtils.isEmpty(value)) {
            System.out.println("redis取出的信息为空");
            stringRedisTemplate.opsForValue().set("testRedis", "123456");
            value = "123456";
        }
        return value;
    }
}
