package com.example.demo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/************************************************************************************
 * Copyright (c) 2018 ©  All Rights Reserved.
 * This software is published under liudong.
 * Software License version 1.0, a copy of which has been included with this
 * distribution in the LICENSE.txt file.
 *
 * File name:      RestDemo.java
 * Create on:      2018/6/27	
 * Author :        liudong
 *
 * ChangeList
 * ----------------------------------------------------------------------------------
 * Date									Editor						ChangeReasons
 * 2018/6/27			                    liudong				    Create
 ************************************************************************************/
@RestController
public class RestDemo {

    @RequestMapping("/get/one/user/{id}/{name}")
    public Object getUserInfo(@PathVariable("id") String id, @PathVariable("name") String name) {

        return "用户信息是:" + id + " " + name;
    }
}
