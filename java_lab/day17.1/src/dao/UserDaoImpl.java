package dao;

import java.sql.*;
import java.util.ArrayList;

import pojos.User;
import static utils.DBUtils.openConnection;

public class UserDaoImpl implements UserDao {
	// fields
	private Connection cn;
	private PreparedStatement pst1, pst2, pst3,pst4,pst5;

	// def ctor
	public UserDaoImpl() throws SQLException {
		// open cn
		cn = openConnection();
		// pst1
		pst1 = cn.prepareStatement("select * from users where reg_amt > ?");
		// pst2
		pst2 = cn.prepareStatement("select * from users where reg_date < ? and reg_amt > ?");
		// pst3 : insert
		// id | name | email | password | reg_amt | reg_date | role
		pst3 = cn.prepareStatement("insert into users values(default,?,?,?,?,?,'CUSTOMER')");
		//pst4
		pst4=cn.prepareStatement("update users set reg_amt=reg_amt+? where id=?");
		//pst5
		pst5=cn.prepareStatement("delete from users where email=?");
		System.out.println("user dao created !");
	}

	@Override
	public ArrayList<User> getUsersByRegAmount(double regAmount) throws SQLException {
		ArrayList<User> users = new ArrayList<>();
		// 1. set IN param
		pst1.setDouble(1, regAmount);
		// exec query --> RST --> ArrayList<User>
		try (ResultSet rst = pst1.executeQuery()) {
			while (rst.next())
				// int userId, String name, String email, String password, double regAmount,
				// Date regDate, String role
				users.add(new User(rst.getInt(1), rst.getString(2), rst.getString(3), rst.getString(4),
						rst.getDouble(5), rst.getDate(6), rst.getString(7)));
		}
		return users;// DAO method rets populated list of users to the tester.

	}

	@Override
	public ArrayList<User> getUsersByRegAmountAndDate(Date regDate, double amount) throws SQLException {
		// create empty AL
		ArrayList<User> userList = new ArrayList<>();
		// set IN params : date amt
		pst2.setDate(1, regDate);
		pst2.setDouble(2, amount);
		// exec query --RST ---> AL
		try (ResultSet rst = pst2.executeQuery()) {
			while (rst.next())
				userList.add(new User(rst.getInt(1), rst.getString(2), rst.getString(3), rst.getString(4),
						rst.getDouble(5), rst.getDate(6), rst.getString(7)));

		}
		return userList;
	}
	

	@Override
	public String updateRegAmount(int userId, double regAmtOffset) throws SQLException {
		// set IN params
		pst4.setDouble(1, regAmtOffset);
		pst4.setInt(2, userId);
		//exec query ---public int executeUpdate() throws SE
		int updateCount=pst4.executeUpdate();
		if(updateCount==1)
			return "updated reg amunt";
		return "updation failed!!!!!";
	}

	@Override
	public String registerNewUser(User newUser) throws SQLException {
		// set IN params : name | email | password | reg_amt | reg_date'
		pst3.setString(1, newUser.getName());
		pst3.setString(2, newUser.getEmail());
		pst3.setString(3, newUser.getPassword());
		pst3.setDouble(4, newUser.getRegAmount());
		pst3.setDate(5, newUser.getRegDate());
		int rowCount = pst3.executeUpdate();
		if (rowCount == 1)
			return "User registered...";
		return "User reg failed.....";
	}
	

	@Override
	public String deleteUserDetails(String email) throws SQLException {
		// set IN param
		pst5.setString(1, email);
		//exec update : DML
		int rowCount=pst5.executeUpdate();
		if (rowCount == 1)
			return "User details deleted...";
		return "Deleting user details failed!!!!";
	}

	// clean up DB resources
	public void cleanUp() throws SQLException {
		if (pst1 != null)
			pst1.close();
		if (pst2 != null)
			pst2.close();
		if (pst3 != null)
			pst3.close();
		if (pst4 != null)
			pst4.close();
		if (pst5 != null)
			pst5.close();
		if (cn != null)
			cn.close();
		System.out.println("user dao cleaned up !");
	}

}
