package com.bankmanagementsystem;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
	
	static Scanner s;
	static int lastaccid = 0;
	private static ArrayList<Account> accounts;
	
	
 
	
	public static void main(String[] args) {
		
		accounts = new ArrayList<>();
		
	     s = new Scanner(System.in);
		
	
		
		System.out.println("Welcome To Bank Management Systm");
		System.out.println("1. create new account ");
		System.out.println("2. Login");
		System.out.println("3. Exit");
		int i = s.nextInt();
		
		switch (i) {
		case 1 : new CreateAccount(s, lastaccid, accounts);
		break;
		case 2 :new Login(s, accounts);
		break;
		
		}
	
		
		
		
	}

	



	
	 
}
