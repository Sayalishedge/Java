package dao;

import java.sql.*;
import static utils.DBUtils.openConnection;

public class BankAccountDaoImpl implements BankAccountDao {
	private Connection cn;
	private CallableStatement cst;
	
	//def ctor
	public BankAccountDaoImpl() throws SQLException {
		// open connection
		cn=openConnection();
		//create callable stmt
		//invocation syntax :{call <procedure-name>[(<arg1>,<arg2>, ...)]}
		cst=cn.prepareCall("{call transfer_funds(?,?,?,?,?)}");
		//register OUT params
		cst.registerOutParameter(4,Types.DOUBLE);
		cst.registerOutParameter(5,Types.DOUBLE);
		System.out.println("bank acct dao created !");
		
	}

	@Override
	public String transferFunds(int srcNo, int destNo, double amount) throws SQLException {
		// set IN params
		cst.setInt(1, srcNo);
		cst.setInt(2, destNo);
		cst.setDouble(3, amount);
		//exec method : execute
		cst.execute();
		//How to get the results from CallableStatement ?
		//public Type getType(int paramIndex)
		return "Updated src bal "+cst.getDouble(4)+" updated dest bal "+cst.getDouble(5);
	}
	
	public void cleanUp() throws SQLException
	{
		if(cst != null)
			cst.close();
		if(cn != null)
			cn.close();
		System.out.println("bank acct dao cleaned up !~");
	}

}
