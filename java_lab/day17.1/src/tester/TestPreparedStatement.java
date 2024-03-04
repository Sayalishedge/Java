package tester;
import java.sql.*;
import java.util.Scanner;

import static utils.DBUtils.openConnection;

/*
 * Display : id , name , reg amount , reg date for all users , 
 * registered between specified dates
 */
public class TestPreparedStatement {

	public static void main(String[] args) {
		String sql="select id,name,reg_amt,reg_date from users where reg_date between ? and ?";
		try(//sc
				Scanner sc=new Scanner(System.in);
				//cn
				Connection cn=openConnection();
				//pst
				PreparedStatement pst=cn.prepareStatement(sql)
				
				) {
			System.out.println("Enter start n end date(yr-mon-day)");
			//set IN param  : public static void setDate(int paramPos,java.sql.Date date)
			pst.setDate(1,Date.valueOf(sc.next()));//begin date
			pst.setDate(2,Date.valueOf(sc.next()));//end date
			try(ResultSet rst=pst.executeQuery()) {
				while(rst.next())
					System.out.printf("ID %d Name %s Reg amount %.2f Reg Date %s %n",
							rst.getInt(1),rst.getString(2),rst.getDouble(3),rst.getDate(4));
			}//rst.close()
			
			
		}  // pst.close, cn.close , sc.close
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
