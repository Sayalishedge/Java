package tester;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Scanner;

import dao.UserDaoImpl;
import pojos.User;

public class TestLayeredApplication2 {

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in)) {
			//create dao instance
			UserDaoImpl dao=new UserDaoImpl();
			System.out.println("Enter date n reg amount");
			Date regDate=Date.valueOf(sc.next());
			ArrayList<User> list = dao.getUsersByRegAmountAndDate(regDate,sc.nextDouble());
			System.out.println("Users list");
			list.forEach(System.out::println);
			//clean up dao
			dao.cleanUp();			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
