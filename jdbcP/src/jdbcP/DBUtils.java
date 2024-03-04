package jdbcP;

import java.sql.*;

public class DBUtils {
	public static Connection openConnection() throws ClassNotFoundException, SQLException{
		
		String url = "jdbc:mysql://localhost:3306/dbda?useSSL=false&allowPublicKeyRetrieval=true";
		return DriverManager.getConnection(url,"root","root");
		
	}

}
