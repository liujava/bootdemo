package com.example.demo.controller;

import com.example.demo.ConfigInfoBean;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/************************************************************************************
 * Copyright (c) 2018 ©  All Rights Reserved.
 * This software is published under liudong.
 * Software License version 1.0, a copy of which has been included with this
 * distribution in the LICENSE.txt file.
 *
 * File name:      PropertiiesDemo.java
 * Create on:      2018/6/14	
 * Author :        liudong
 *
 * ChangeList
 * ----------------------------------------------------------------------------------
 * Date									Editor						ChangeReasons
 * 2018/6/14			                    liudong				    Create
 ************************************************************************************/
@RestController
@Getter
@Setter
public class PropertiiesDemo {

    @Autowired
    private ConfigInfoBean configInfoBean;
    @Value(value = "${demo.name}")
    private String name;
    @Value(value = "${demo.address}")
    private String address;

    @RequestMapping("/prodemo")
    public String proDemo () {
        return name + "-" + address;
    }

    @RequestMapping("/probeandemo")
    public String proBeanDemo () {
        return configInfoBean.getName() + "-" + configInfoBean.getAddress();
    }
}
