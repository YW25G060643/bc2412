package com.javahongkong.bootcamp.exercise;

public abstract class Account {
	private AccountHolder accountHolder;
	private Long accountNumber;
	private int pin;
	private double balance;

	protected Account(AccountHolder accountHolder, Long accountNumber, int pin, double startingDeposit) {
		// complete the constructor
	}

	public AccountHolder getAccountHolder() {
		// complete the function
		return null;
	}

	public boolean validatePin(int attemptedPin) {
		// complete the function
		return true;
	}

	public double getBalance() {
		// complete the function
		return -1.0;
	}

	public double getPin() {
		// complete the function
		return -1.0;
	}

	public Long getAccountNumber() {
		// complete the function
		return this.accountNumber;
	}

	public void creditAccount(double amount) {
		// complete the function
		// BigDecimal
	}

	public boolean debitAccount(double amount) {
		// complete the function
		return true;
	}
}
