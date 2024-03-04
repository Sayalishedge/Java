package tester;

import java.util.ArrayList;
import java.util.Scanner;

import dao.UserDaoImpl;
import pojos.User;

public class TestLayeredApplication {

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in)) {
			//create dao instance
			UserDaoImpl dao=new UserDaoImpl();
			System.out.println("Enter reg amount");
			ArrayList<User> list = dao.getUsersByRegAmount(sc.nextDouble());
			System.out.println("Users list");
			list.forEach(System.out::println);
			//clean up dao
			dao.cleanUp();			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
