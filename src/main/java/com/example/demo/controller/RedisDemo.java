package com.example.demo.controller;

import com.example.demo.service.RedisDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/************************************************************************************
 * Copyright (c) 2018 ©  All Rights Reserved.
 * This software is published under liudong.
 * Software License version 1.0, a copy of which has been included with this
 * distribution in the LICENSE.txt file.
 *
 * File name:      RedisDemo.java
 * Create on:      2018/6/28	
 * Author :        liudong
 *
 * ChangeList
 * ----------------------------------------------------------------------------------
 * Date									Editor						ChangeReasons
 * 2018/6/28			                    liudong				    Create
 ************************************************************************************/
@RestController
public class RedisDemo {
    @Autowired
    private RedisDemoService redisDemoService;
    @RequestMapping("/redis")
    public Object redisOperation(){
        return redisDemoService.redisOperation();
    }
}
