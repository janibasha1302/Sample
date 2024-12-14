package com.bankmanagementsystem;

import java.util.Scanner;

public class Menu {
	public Menu(Scanner s , Account acc) {
		int j = 0;
	do {
		System.out.println("\nWelcome"+  acc.getFirstName()+ "  " +acc.getLastName());
		System.out.println("1.Deposit\n2.Withdraw\n3.Balance\n4.Exit");
	    j = s.nextInt();
		switch (j) {
		case 1: 
			 new Deposit(s , acc);
			break;
		case 2 :
			new Withdraw(s, acc);
			break;
		case 3 : 
			System.out.println("Your Balance is : " + acc.getBalance());
		    break;
		case 4 :
			s.close();
		    
		}
	
	} while (j != 4);
	}
	}


