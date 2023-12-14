package com.banking.services;

import java.util.Scanner;

import com.banking.account.Account;
import com.banking.account.Transaction;

public class gpay implements BankUser {
	Transaction a1;
	Account a2;
	public gpay(Transaction a1, Account a2) {
		super();
		this.a1 = a1;
		this.a2 = a2;
	}
	@Override
	public void Transfer() {
		System.out.println("Welcome to gpay/n 1.receive 2.send");
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		if(choice==1) {
			System.out.println("Enter your amount");
			double amt=sc.nextDouble();
			a1.deposit(amt, a2);
			a1.checkbal(a2);
		}
		else if(choice==2) {
			System.out.println("Enter your amount");
			double amt=sc.nextDouble();
			a1.withdraw(amt, a2);
			a1.checkbal(a2);
		}
		else {
			System.out.println("Invalid");

		}
	}

}
