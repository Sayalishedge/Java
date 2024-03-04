package tester;
import java.sql.*;
import  static jdbcP.DBUtils.openConnection;
public class testDbConnection {

	public static void main(String[] args) {
		try(Connection c = openConnection()){
			System.out.println("Connection established" + c);
		}catch(Exception e) {
			e.printStackTrace();
		}
		

	}

}
