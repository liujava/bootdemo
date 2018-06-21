package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/************************************************************************************
 * Copyright (c) 2018 ©  All Rights Reserved.
 * This software is published under liudong.
 * Software License version 1.0, a copy of which has been included with this
 * distribution in the LICENSE.txt file.
 *
 * File name:      JspDemo.java
 * Create on:      2018/6/21	
 * Author :        liudong
 *
 * ChangeList
 * ----------------------------------------------------------------------------------
 * Date									Editor						ChangeReasons
 * 2018/6/21			                    liudong				    Create
 ************************************************************************************/
@Controller
public class JspDemo {

    @RequestMapping("/index")
    public String jspIndex(Model model) {
        model.addAttribute("bootName", "集成jsp");
        return "index";
    }
}
