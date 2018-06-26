package com.example.demo.service;

import com.example.demo.mapper.mappermodule.UserRole;

import java.util.List;

/************************************************************************************
 * Copyright (c) 2018 ©  All Rights Reserved.
 * This software is published under liudong.
 * Software License version 1.0, a copy of which has been included with this
 * distribution in the LICENSE.txt file.
 *
 * File name:      UserService.java
 * Create on:      2018/6/25	
 * Author :        liudong
 *
 * ChangeList
 * ----------------------------------------------------------------------------------
 * Date									Editor						ChangeReasons
 * 2018/6/25			                    liudong				    Create
 ************************************************************************************/
public interface UserService {
    List<UserRole> getAllUsers();

    String updateUserInfo();
}
