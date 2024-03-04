package pojos;

//ac_no | user_id | type    | balance
public class BankAccount {
	private int acctNo;
	private int userId;
	private String acType;
	private double balance;

	public BankAccount(int acctNo, int userId, String acType, double balance) {
		super();
		this.acctNo = acctNo;
		this.userId = userId;
		this.acType = acType;
		this.balance = balance;
	}

	public int getAcctNo() {
		return acctNo;
	}

	public void setAcctNo(int acctNo) {
		this.acctNo = acctNo;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getAcType() {
		return acType;
	}

	public void setAcType(String acType) {
		this.acType = acType;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "BankAccount [acctNo=" + acctNo + ", userId=" + userId + ", acType=" + acType + ", balance=" + balance
				+ "]";
	}

}
