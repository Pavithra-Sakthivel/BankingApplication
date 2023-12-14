package com.banking.signup;

import java.util.Scanner;

import com.banking.account.Account;
import com.banking.account.Transaction;
import com.banking.services.Atm;
import com.banking.services.BankUser;
import com.banking.services.Phonepe;
import com.banking.services.gpay;

public class User {
    String customerID;
    String pw;
    public void signup() {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter your new id");
    	String ci=sc.nextLine();
    	System.out.println("Enter your new pw");
    	String pw=sc.nextLine();
    	this.customerID=ci;
    	this.pw=pw;
    }
    public BankUser Login(Transaction a1,Account a2) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter your id:");
    	String ci=sc.nextLine();
    	System.out.println("Enter your new pw");
    	String pw=sc.nextLine();


    if(ci.equals(this.customerID)&&pw.equals(this.pw)) {
    	System.out.println("Welcome to home page");
    	System.out.println("1.atm 2.phonepe 3.gpay");
    	
    	int choice=sc.nextInt();
    	switch(choice) {
    	case 1:BankUser b1=new Atm(a1,a2);
    	return b1;
    	case 2:BankUser b2=new Phonepe(a1,a2);
    	return b2;
    	case 3:BankUser b3=new gpay(a1,a2);
    	return b3;
    	
    	}
    }
    else {
    	System.out.println("Invalid id and pw");
    }
    return null;
}}
