package com.bridgelabz.debitcard;

public class Account {

	private String name;
	private double balance;

	public Account(String name, double balance) {
		this.name = name;
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [name=" + name + ", balance=" + balance + "]";
	}

	public void deposit(double depositAmount) {
		if (depositAmount > 0)
			balance = balance + depositAmount;
		else
			System.out.println("Deposit amount is not valid.");
	}

	public void withdraw(double withdrawAmount) {
		if (withdrawAmount <= balance)
			balance = balance - withdrawAmount;
		else
			System.out.println("Withdrawal amount exceeded account balance.");
	}

	public double getBalance() {
		return balance;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
