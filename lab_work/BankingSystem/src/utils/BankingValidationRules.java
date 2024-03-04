package utils;

import static java.time.LocalDate.parse;

import java.time.LocalDate;
import java.util.ArrayList;

import com.banking.core.AccountType;
import com.banking.core.BankAccount;


import custom_exception.InvalidInputException;

public class BankingValidationRules {
	
	public static double balanceValidation(double accountBalance) throws InvalidInputException{
		int min_bal=3000;
		if (accountBalance < 3000)
		{
			throw new InvalidInputException("Min balance criteria does not meet ");
		}
		return accountBalance;
		
		
	}
	
	public static void checkForDuplicate(long accountNo , ArrayList<BankAccount> banks)throws InvalidInputException {
		BankAccount newBa = new BankAccount(accountNo);
		if(banks.contains(newBa))
			throw new InvalidInputException("Duplicate Account Number Detected.....");
		System.out.println("No Duplicate Account number found!!!");
	}
	
	public static AccountType invalidAccountType(String account) throws IllegalArgumentException{
		return AccountType.valueOf(account.toUpperCase());
	}
	
	public static BankAccount validateAllAccount(long accountNumber,String name, String pin ,String accountType , 
		double accountBalance, String date ,ArrayList<BankAccount> banks)throws InvalidInputException {
		
		checkForDuplicate(accountNumber, banks);
		LocalDate d1 = parse(date);
		AccountType t = invalidAccountType(accountType);
		double d = balanceValidation(accountBalance);
		return new BankAccount(accountNumber,name,pin,t,d,d1);
	}
	
	
}
