package com.example.demo;

import com.example.demo.service.RedisDemoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.bind.annotation.RequestMapping;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Autowired
	private RedisDemoService redisDemoService;
	@Test
	public void redisOperation(){
		System.out.println(redisDemoService.redisOperation());
	}

@Test
public void contextLoads() {

		}

		}
