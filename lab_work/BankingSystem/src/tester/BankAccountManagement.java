package tester;

import static utils.BankingValidationRules.validateAllAccount;
import static utils.AccountsUtils.*;

import java.util.ArrayList;
import java.util.Scanner;

import com.banking.core.BankAccount;

public class BankAccountManagement {

	public static void main(String[] args) {
		try(Scanner sc= new Scanner(System.in)){
			ArrayList<BankAccount> list = new ArrayList<>();
			boolean exit = false;
			while(!exit) {
				
				System.out.println("Options: \n1. Create Bank Account\n "
						+ "2. View account summary\n 3. Withdraw funds \n "
						+ "4. Deposit funds \n 0.exit  ");
				int choice=sc.nextInt();
				switch (choice) {
				case 1:
					System.out.println("Create Your Bank Account: accountNumber, "
							+ "name, pin , accountType ,\n"
							+"accountBalance, date ");
					BankAccount ba = validateAllAccount(sc.nextLong(), sc.next(), 
							sc.next(), sc.next(),
							sc.nextDouble(), sc.next(), list);
					list.add(ba);
					System.out.println("added succesfully : ");
					break;
				
				case 2:
					System.out.println("Enter bank accountNo");
					System.out.println(findByAccNum(sc.nextLong(), list));
					break;
					
				case 3:
					
					System.out.println("Enter account no n money to be withdrawn");
					long accountNo = sc.nextLong();
					double withdrawMoney = sc.nextDouble();
					ba = findByAccNum(accountNo, list);
					ba.setAccountBalance(ba.getAccountBalance() - withdrawMoney);
					System.out.println("Price updated....");
					break;
					
				case 4:
					System.out.println("Enter account no n money to be deposited");
					accountNo = sc.nextLong();
					double depositMoney = sc.nextDouble();
					ba = findByAccNum(accountNo, list);
					ba.setAccountBalance(ba.getAccountBalance() + depositMoney);
					System.out.println("Money Deposited");
					break;
					
				case 5:
					
					
					break;
			

				case 0:
					exit = true;
					break;
				}
				
				
				
				
				
				
				
				
				
				
				
				
				
			}
			
			
			
			
			
			
			
			
			
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

	
	}


