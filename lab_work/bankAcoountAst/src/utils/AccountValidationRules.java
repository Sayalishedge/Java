package utils;


import static java.time.LocalDate.parse;

import java.time.LocalDate;
import java.util.ArrayList;

import bankAcoountAst.Account;
import bankAcoountAst.BankAccount;
import custom_error.InvalidInputException;

public class AccountValidationRules {
	public static double balanceValidation(double balance) throws InvalidInputException {
		int min_bal = 3000;
		if (balance < 3000) {
			throw new InvalidInputException("minimum balance criteria not met");
		}
		return balance;
	}

	public static Account invalidAccountType(String account) throws IllegalArgumentException {
		return Account.valueOf(account.toUpperCase());
	}

public static void checkForDuplicate(long accountNumber , ArrayList<BankAccount> banks) throws InvalidInputException{
	BankAccount neewBankAccount = new BankAccount(accountNumber);
	if(banks.contains(neewBankAccount))
		throw new InvalidInputException("Duplicate Account Number Detected.....");
	System.out.println("No Duplicates Found!!!");
}

public static BankAccount validateAllAccount(long accountNumber,String name, String pin , 
		String accountType , 
		double accountBalance, String date ,ArrayList<BankAccount> banks) throws InvalidInputException {
	checkForDuplicate(accountNumber, banks);
	LocalDate d1 = parse(date);
	Account t = invalidAccountType(accountType);
	double d = balanceValidation(accountBalance);
	return new BankAccount(accountNumber,name,pin,t,d,d1);
}
}
