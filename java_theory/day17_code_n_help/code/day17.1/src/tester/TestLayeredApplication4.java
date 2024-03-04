package tester;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Scanner;

import dao.UserDaoImpl;
import pojos.User;

public class TestLayeredApplication4 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// create dao instance
			UserDaoImpl dao = new UserDaoImpl();
			System.out.println("Enter  user id n reg amount offset , for updation");
			// invoke dao's method
			System.out.println("Updation status " + dao.updateRegAmount
					(sc.nextInt(), sc.nextDouble()));
			// clean up dao
			dao.cleanUp();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
