package dao;

import java.sql.SQLException;

public interface BankAccountDao {
//add a method to transfter funds
	String transferFunds(int srcNo,int destNo,double amount) throws SQLException;
}
