package com.org.springTest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.org.springPojoServices.Customer;

public class CustomerTest {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("customer.xml");
		Customer customer = (Customer) context.getBean("customerDetails");
		customer.displayCustomerDetails();
		
	}

}
