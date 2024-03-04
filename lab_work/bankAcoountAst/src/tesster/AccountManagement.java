package tesster;

import static utils.AccountUtils.deleteAccountByAccnum;
import static utils.AccountUtils.findByAccNum;
import static utils.AccountUtils.populateShowroom;
import static utils.AccountValidationRules.validateAllAccount;

import java.util.ArrayList;
import java.util.Scanner;

import bankAcoountAst.BankAccount;
import custom_error.InvalidInputException;

public class AccountManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner sc = new Scanner(System.in)) {
			ArrayList<BankAccount> list = populateShowroom();
			boolean exit = false;
			while (!exit) {
				try {
					System.out.println("Options : 1. Create Bank Account\r\n" + "2. View account summary\r\n"
							+ "3. Withdraw funds\r\n" + "4. Deposit funds\r\n" + "5. Close Account\r\n"
							+ "0. Exit.\r\n");
					System.out.println("Choose an option");
					switch (sc.nextInt()) {
					case 0:
						exit = true;
						break;
					case 1:
						System.out.println("Create Your Bank Account: accountNumber,"
								+ " name, pin , accountType ,"
								+ "accountBalance, date ");
						BankAccount ba = validateAllAccount(sc.nextLong(), 
								sc.next(), sc.next(), sc.next(),
								sc.nextDouble(), sc.next(), list);
						list.add(ba);
						System.out.println("added succesfully : ");
						break;
						
					case 2:
						System.out.println("Enter account number");
						System.out.println(findByAccNum(sc.nextLong(), list));
						break;

					case 3:
						System.out.println("Enter account no n money to be withdrawn");
						long accnum = sc.nextLong();
						double withdrawMoney = sc.nextDouble();
						ba = findByAccNum(accnum, list);
						ba.setAccBal(ba.getAccBal() - withdrawMoney);
						System.out.println("Price updated....");
						break;
					case 4:
						System.out.println("Enter account no n money to be deposited");
						long accnum2 = sc.nextLong();
						double depositMoney = sc.nextDouble();
						ba = findByAccNum(accnum2, list);
						ba.setAccBal(ba.getAccBal() + depositMoney);
						System.out.println("Price updated....");
						break;
					case 5:
						System.out.println("Enter account number ");
						System.out.println(deleteAccountByAccnum(sc.nextLong(), list));
					case 6: 
						System.out.println("Sorting Bank Accounts as per Account No.s in Ascending order");
						
					default:
						break;
					}
				} catch (Exception e) {
					System.out.println(e);
					e.printStackTrace();
				}
			}
		} catch (InvalidInputException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

}
//1 nn l3 loan 7777 2222-02-02