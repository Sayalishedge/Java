package utils;

import static utils.AccountValidationRules.validateAllAccount;

import java.util.ArrayList;

import bankAcoountAst.BankAccount;
import custom_error.InvalidInputException;

public class AccountUtils {
	public static BankAccount findByAccNum(long accno, ArrayList<BankAccount> list) throws InvalidInputException{
		BankAccount b1 = new BankAccount(accno);
		int index = list.indexOf(b1);
		if (index == -1)
			throw new InvalidInputException("Account not found");
		return list.get(index);
		
	}
	public static BankAccount deleteAccountByAccnum(long accno, ArrayList<BankAccount>list) throws InvalidInputException{
		BankAccount b1 = new BankAccount(accno);
		int index = list.indexOf(b1);
		if (index == -1)
			throw new InvalidInputException("Accouint not found");
		return list.remove(index);
	}
	public static ArrayList<BankAccount> populateShowroom() throws InvalidInputException {
		// create empty AL
		ArrayList<BankAccount> list = new ArrayList<>();
		list.add(validateAllAccount(101 , "nn", "13" , "loan", 7777 , "2222-02-02", list));
		list.add(validateAllAccount(102 , "nn", "13" , "loan", 7777 , "2222-02-02", list));
		list.add(validateAllAccount(103 , "nn", "13" , "loan", 7777 , "2222-02-02", list));
		list.add(validateAllAccount(104 , "nn", "13" , "loan", 7777 , "2222-02-02", list));
		list.add(validateAllAccount(105 , "nn", "13" , "loan", 7777 , "2222-02-02", list));
		return list;// utils class rets populated showroom to tester
	}
}
