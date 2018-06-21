package com.example.demo;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/************************************************************************************
 * Copyright (c) 2018 ©  All Rights Reserved.
 * This software is published under liudong.
 * Software License version 1.0, a copy of which has been included with this
 * distribution in the LICENSE.txt file.
 *
 * File name:      ConfigInfoBean.java
 * Create on:      2018/6/14	
 * Author :        liudong
 *
 * ChangeList
 * ----------------------------------------------------------------------------------
 * Date									Editor						ChangeReasons
 * 2018/6/14			                    liudong				    Create
 ************************************************************************************/
@Component
@ConfigurationProperties(prefix = "demo")
public class ConfigInfoBean {
    private String name;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
