package com.org.testShape;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.org.appService.ShapeService;

public class AppTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("aop.xml");
		ShapeService shapeService = context.getBean("shapeService", ShapeService.class);
		System.out.println("Circle Name= "+shapeService.getCircle().getName());
		System.out.println("Triangle Name= "+shapeService.getTriangle().getName());
	}

}
