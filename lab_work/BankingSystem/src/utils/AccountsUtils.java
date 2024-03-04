package utils;
import java.util.ArrayList;

import com.banking.core.BankAccount;

import custom_exception.InvalidInputException;

public class AccountsUtils {
	public static BankAccount findByAccNum(long accno, ArrayList<BankAccount> list) throws InvalidInputException{
		BankAccount b1 = new BankAccount(accno);
		int index = list.indexOf(b1);
		if (index == -1)
			throw new InvalidInputException("Account not found");
		return list.get(index);
	}

}
