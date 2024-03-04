package tester;

import java.util.Scanner;

import dao.BankAccountDaoImpl;

public class TestStoredProcedure {

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in)) {
			//dao instance
			BankAccountDaoImpl dao=new BankAccountDaoImpl();
			System.out.println("Enter src acct no , dest no , transfer amount");
			System.out.println("Transfer status :"
			+dao.transferFunds(sc.nextInt(), sc.nextInt(), sc.nextDouble()));
			dao.cleanUp();
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}
