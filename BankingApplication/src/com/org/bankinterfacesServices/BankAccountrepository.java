package com.org.bankinterfacesServices;

public interface BankAccountrepository {
	
	public double getBalance(long accountId);
	public double updateBalance(long accountId, double newBalance);
}
