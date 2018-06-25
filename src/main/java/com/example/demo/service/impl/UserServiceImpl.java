package com.example.demo.service.impl;

import com.example.demo.dao.UserRoleMapper;
import com.example.demo.mapper.mappermodule.UserRole;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/************************************************************************************
 * Copyright (c) 2018 ©  All Rights Reserved.
 * This software is published under liudong.
 * Software License version 1.0, a copy of which has been included with this
 * distribution in the LICENSE.txt file.
 *
 * File name:      UserServiceImpl.java
 * Create on:      2018/6/25	
 * Author :        liudong
 *
 * ChangeList
 * ----------------------------------------------------------------------------------
 * Date									Editor						ChangeReasons
 * 2018/6/25			                    liudong				    Create
 ************************************************************************************/
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRoleMapper userRoleMapper;
    @Override
    public List<UserRole> getAllUsers() {
        return userRoleMapper.getAllUsers();
    }
}
