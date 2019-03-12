package com.org.testServices;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.org.pojoServices.Question;

public class TestQuestion {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("question.xml");
		Question question = (Question) context.getBean("question");
		question.displayQuestion();
	}

}
