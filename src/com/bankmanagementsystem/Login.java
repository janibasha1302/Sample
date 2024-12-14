package com.bankmanagementsystem;

import java.util.ArrayList;
import java.util.Scanner;

public class Login {
	
	public Login(Scanner s,  ArrayList<Account> accounts) {
	    System.out.println("Enter Account id: ");
	    int id = s.nextInt();
	    System.out.println("Enter Passcode:  ");
	    int Passcode = s.nextInt();
	    Account account = new Account();
	    boolean exit = false;
	    for (Account acc : accounts) {
	    	if (acc.getAccid()== id && acc.getPasscode() == Passcode) {
	    		exit = true;
	    		account = acc;
	    		
	    	}
	    }
	    if (exit) {
	    	new Menu(s, account);
	    	
	    }else {
	    	System.out.println("Account Doesnot Exist:");
	    }
		

}
}