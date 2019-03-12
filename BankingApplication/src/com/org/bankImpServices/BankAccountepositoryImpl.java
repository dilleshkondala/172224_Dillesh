package com.org.bankImpServices;

import java.util.ArrayList;
import java.util.List;

import com.org.bankinterfacesServices.BankAccountrepository;
import com.org.pojo.BankAccount;

public class BankAccountepositoryImpl implements BankAccountrepository{

	public List<BankAccount> getdummyDB()
	{
		
		List<BankAccount> list =  new ArrayList<>();
		list.add(new BankAccount(101,"Dillesh","Savings",45000.00));
		list.add(new BankAccount(102,"Renu","Current",55000.00));
		list.add(new BankAccount(103,"Pooja","Savings",65000.00));
		
		return list;
		
	}
	@Override
	public double getBalance(long accountId) {
		
		double balance = 0;
		List<BankAccount> data = getdummyDB();
		for(BankAccount i: data)
		{
			if(accountId == i.getAccountId())
			{
				balance = i.getAccountBalance();
			}
			else
			{
				return -1;
			}
		}
		
		return balance;
	}

	@Override
	public double updateBalance(long accountId, double newBalance) {
		
		List<BankAccount> data = getdummyDB();
		for(BankAccount i: data)
		{
			if(accountId == i.getAccountId())
			{
				return i.setAccountBalance(newBalance);
			}
			else
			{
				return -1;
			}
		}
		
		
		
		
		return 1;
	}

}
