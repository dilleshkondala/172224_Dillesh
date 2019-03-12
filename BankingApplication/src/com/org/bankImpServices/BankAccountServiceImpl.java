package com.org.bankImpServices;

import java.util.List;

import com.org.bankinterfacesServices.BankAccountService;
import com.org.pojo.BankAccount;

public class BankAccountServiceImpl implements BankAccountService{

	BankAccountepositoryImpl bankrepos = new BankAccountepositoryImpl();
	
	List<BankAccount> data = bankrepos.getdummyDB();
	
//	double availBalance = bankrepos.getBalance(acc.getAccountId());
	
	//double updateBalance = bankrepos.updateBalance(acc.getAccountId(), );
	double availBalance=0;
	@Override
	public double withdraw(long accountId, double balance) {

		
		for(BankAccount i: data)
		{
			if(accountId == i.getAccountId())
			{
				availBalance = i.getAccountBalance();
				availBalance -= balance;
				break;
			}
			else
			{
				return -1;
			}
		}
		return availBalance;
	}

	@Override
	public double deposit(long accountId, double balance) {
		
		for(BankAccount i: data)
		{
			if(accountId == i.getAccountId())
			{
				availBalance = i.getAccountBalance();
				availBalance += balance;
				break;
				
			}
			else
			{
				return -1;
			}
		}
		return availBalance;
	
	}

	@Override
	public double getBalance(long accountId) {
		
		
		return 0;
	}

	@Override
	public boolean fundTransfer(long fromAccount, long toAccount, double amont) {
		
		return false;
	}

}
