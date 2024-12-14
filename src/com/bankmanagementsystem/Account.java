package com.bankmanagementsystem;

public class Account {
	
	private String FirstName;
	private String LastName;
	private int accid;
	private double balance;
	private int Passcode;
	
	public Account() {
		
	}
	
	
	public Account(String firstName, String lastName, int accid, double balance, int passcode) {
		super();
		FirstName = firstName;
		LastName = lastName;
		this.accid = accid;
		this.balance = balance;
		Passcode = passcode;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public int getAccid() {
		return accid;
	}
	public void setAccid(int accid) {
		this.accid = accid;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public int getPasscode() {
		return Passcode;
	}
	public void setPasscode(int passcode) {
		Passcode = passcode;
	}
	
	
	
	

}
