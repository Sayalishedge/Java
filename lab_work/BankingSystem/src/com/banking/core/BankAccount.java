package com.banking.core;

import java.time.LocalDate;

public class BankAccount {
	
	private long accountNo;
	private String customerName, pin;
	private AccountType accType;
	private double accountBalance;
	private LocalDate creationDate;
	
	public BankAccount(long accountNo, String customerName, String pin, AccountType accType, double accountBalance,
			LocalDate creationDate) {
		super();
		this.accountNo = accountNo;
		this.customerName = customerName;
		this.pin = pin;
		this.accType = accType;
		this.accountBalance = accountBalance;
		this.creationDate = creationDate;
	}

	public BankAccount(long accountNo) {
		this.accountNo = accountNo;
	}

	@Override
	public String toString() {
		return "BankAccount [accountNo=" + accountNo + ", customerName=" + customerName + ", pin=" + pin + ", accType="
				+ accType + ", accountBalance=" + accountBalance + ", creationDate=" + creationDate + "]";
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	
	
	
	
	

}
