package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bean.StudentBean;

@RestController
public class DemoController {
@RequestMapping("/hello")
public String Display()
{
	return "Welcome to microservices";
}
@RequestMapping("/student")
public StudentBean displayStudent()
{
	StudentBean sb = new StudentBean("1001","rajta","paliwal","IT");
	return sb;
}
}