package tester;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Scanner;

import dao.UserDaoImpl;
import pojos.User;

public class TestLayeredApplication3 {

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in)) {
			//create dao instance
			UserDaoImpl dao=new UserDaoImpl();
			System.out.println("Enter new user details : name email  password  reg_amt reg_date'");
			//create user instance
			User user1=new User(sc.next(), sc.next(), sc.next(),
					sc.nextDouble(), Date.valueOf(sc.next()));
			//invoke dao's method
			System.out.println("Reg status "+dao.registerNewUser(user1));			
			//clean up dao
			dao.cleanUp();			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
