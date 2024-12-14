package com.bankmanagementsystem;

import java.util.Scanner;

public class Deposit {
	
	public Deposit(Scanner s, Account acc) {
		System.out.println("Enter amount: ");
		double amount = s.nextDouble();
		acc.setBalance(acc.getBalance() + amount);
		System.out.println("Operation Done Successfully");
	}

}
