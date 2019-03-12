package com.org.testServices;

import com.org.bankImpServices.BankAccountServiceImpl;

public class BankTest {

	public static void main(String[] args) {
		
		
		BankAccountServiceImpl banktest = new BankAccountServiceImpl();
		double c = banktest.withdraw(101, 1000);
		double d = banktest.deposit(101, 1000);
System.out.println("Amount after Debitted= "+c);

System.out.println("Amount after Deposited= "+d);

	}

}
