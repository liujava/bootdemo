package com.example.demo;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.example.demo.service.UserService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.json.JsonParser;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@MapperScan("com.example.demo.dao")
@EnableTransactionManagement
public class DemoApplication {

	@Autowired
	private UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@RequestMapping("/")
	public String hello(){
		return "Hello world!";
	}


	@GetMapping("/getMapping")
	public String getMapping() {
        return "getMapping";
    }

	@GetMapping("/getAllUsers")
	public String getAllUsers() {
		return JSON.toJSONString(userService.getAllUsers());
	}

	@GetMapping("/updateUserInfo")
	public String updateUserInfo() {
		return userService.updateUserInfo();
	}
}
