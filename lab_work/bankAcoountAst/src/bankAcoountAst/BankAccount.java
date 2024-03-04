package bankAcoountAst;

import java.time.LocalDate;
import java.util.Objects;

public class BankAccount {
	private long accountNumber;
	private String name;
	private String pin;
	private Account accountType;
	private double accBal;
	private LocalDate creationDate;

	public BankAccount(long accountNumber, String name, String pin, Account accountType, double accBal,
			LocalDate creationDate) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.pin = pin;
		this.accountType = accountType;
		this.accBal = accBal;
		this.creationDate = creationDate;
	}
public BankAccount(long AccountNumber) {
	this.accountNumber = AccountNumber;
}
	@Override
	public String toString() {
		return "BankAccount [accountNumber=" + accountNumber + ", name=" + name + ", accountType="
				+ accountType + ", accBal=" + accBal + ", creationDate=" + creationDate + "]";
	}

	public double getAccBal() {
		return accBal;
	}
	public void setAccBal(double accBal) {
		this.accBal = accBal;
	}
	@Override
	public boolean equals(Object obj) {
		System.out.println("in Accounts equal");
		if (obj instanceof BankAccount) {
			BankAccount b = (BankAccount) obj;
			return this.accountNumber == b.accountNumber;
		}
		return false;
	}
}
