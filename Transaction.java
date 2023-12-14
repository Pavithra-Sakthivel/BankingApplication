package com.banking.account;

public class Transaction {
	public void deposit(double amt, Account a1)
	{
	
		if(amt>=0) {
			a1.setBal(a1.getBal()+amt);
			System.out.println("Current bal:"+a1.getBal());
		}
		else {
			System.out.println("Inavlid amt");
		}
	}
	public void withdraw(double amt, Account a1)
	{
		if(amt>=0&& a1.getBal()>=amt) {
			a1.setBal(a1.getBal()-amt);
			checkbal(a1);
		}
		else {
			System.out.println("Insufficient bal");
		}
	}
	public void checkbal(Account a1) 
	{
		System.out.println("User Details:"+a1.getName()+" Account num="+a1.getAccno()+" Current balance="+a1.getBal());
		
	}
	

}
