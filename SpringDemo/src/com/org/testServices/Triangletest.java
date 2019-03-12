package com.org.testServices;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.org.pojoServices.Triangle;

public class Triangletest {
	public static void main(String[] args) {
		
	
		ApplicationContext context = new ClassPathXmlApplicationContext("point.xml");
		Triangle triangle = (Triangle) context.getBean("triangle");
		triangle.display();
	            	                   
    }    
 
}
