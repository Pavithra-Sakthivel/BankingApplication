package com.banking.services;

import com.banking.account.*;
import com.banking.account.Transaction;
import com.banking.signup.*;

public class Main1 {
	public static void main(String[] args) {
		User u1=new User();
		Account useraccount=new Account("Pavi",1234,0);
		Transaction t1=new Transaction();
		u1.signup();
		BankUser b1=u1.Login(t1,useraccount);
		b1.Transfer();
	}

}
