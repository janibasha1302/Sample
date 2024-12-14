package com.bankmanagementsystem;

import java.util.ArrayList;
import java.util.Scanner;

public class CreateAccount {
	public CreateAccount(Scanner s, int lastaccid, ArrayList<Account> accounts) {
		System.out.println("Enter First Name: ");
		String FirstName = s.next();
		System.out.println("Enter Last Name: ");
		String LastName = s.next();
		System.out.println("Enter Balance: ");
		double balance = s.nextDouble();
		System.out.println("Enter Passcode: (digit only) ");
		int Passcode = s.nextInt();
		System.out.println("Confirm Passcode:  ");
		int Passcodec = s.nextInt();
		if(Passcode != Passcodec) {
			System.out.println("Passcode doesnot match");
			return;
		}
		int id = 1000000 + lastaccid;
		lastaccid = lastaccid + 1;
		Account acc = new Account(FirstName, LastName, id, balance, Passcode);
		accounts.add(acc);
		System.out.println("Your Account id:"+ id);
		new Menu(s, acc);
		
		
	}
		
	}


