package dao;

import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;

import pojos.User;

public interface UserDao {
//add a method to get user details , having reg amt > specified amt
	ArrayList<User> getUsersByRegAmount(double regAmount) throws SQLException;

	/*
	 * Display user details for all users registered before a specific date n paying
	 * reg amt > specific amount
	 * 
	 */
	ArrayList<User> getUsersByRegAmountAndDate(Date regDate, double amount) throws SQLException;
// Add a method for inserting new user details
	String registerNewUser(User newUser) throws SQLException;
	// Add a method for updating reg amount for existing user
	String updateRegAmount(int userId,double regAmtOffset) throws SQLException;
	//add a method for deleting user details
	String deleteUserDetails(String email) throws SQLException;
}
