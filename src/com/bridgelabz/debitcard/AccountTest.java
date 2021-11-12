package com.bridgelabz.debitcard;


import java.util.Scanner;

public class AccountTest {

	Account account;
	Scanner sc = new Scanner(System.in);

	AccountTest() {
		account = new Account("Duk", 0.00);
	}

	private void withdraw() {
		System.out.print("Enter withdraw amount for account: ");
		double withdrawAmount = sc.nextDouble();
		System.out.println("Debit Rs." + withdrawAmount + "/- from your account balance");
		account.withdraw(withdrawAmount);

	}

	private void deposit() {
		System.out.print("Enter deposit amount: ");
		double depositAmount = sc.nextDouble();
		System.out.println("Credit Rs." + depositAmount + "/- to your account balance");
		account.deposit(depositAmount);

	}

	public static void main(String[] args) {
		int i = 0;
		System.out.println("Enter Your four digit Pin");
		while (i < 5) {
			Scanner sc = new Scanner(System.in);
			int pin = sc.nextInt();
			if (pin == 1234) {

				AccountTest accountTest = new AccountTest();

				System.out.println(accountTest.account.getName() + " balance:" + accountTest.account.getBalance());
				int choice = 0;
				do {
					System.out.println(
							"Would you like to: \n\t1.Deposit\n\t2.Withdraw Money \n\t3.Display Balance \n\t4.Exit ");
					System.out.print("Choice: ");
					choice = sc.nextInt();
					switch (choice) {
					case 1:
						accountTest.deposit();
						break;

					case 2:
						accountTest.withdraw();
						break;

					case 3:
						accountTest.display();

						break;

					case 4:
						System.out.println("Thank you :)");
						System.exit(0);
						break;

					default:
						break;
					}
				} while (choice > 0 || choice < 5);
			}

			else {
				System.out.println("Incorrect pin code");
				i++;
			}
			sc.close();
		}
		System.out.println("Try again later");

	}

	private void display() {
		System.out.println(account.getName() + " balance " + account.getBalance());


	}

}
