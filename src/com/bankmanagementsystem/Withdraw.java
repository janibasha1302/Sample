package com.bankmanagementsystem;

import java.util.Scanner;

public class Withdraw {
	
	public Withdraw(Scanner s, Account acc) {
		System.out.println("Enter amount: ");
		double amount = s.nextDouble();
		acc.setBalance(acc.getBalance() - amount);
		System.out.println("Operation Done Successfully");
	}
	}


