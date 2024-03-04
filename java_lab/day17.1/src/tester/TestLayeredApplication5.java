package tester;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Scanner;

import dao.UserDaoImpl;
import pojos.User;

public class TestLayeredApplication5 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// create dao instance
			UserDaoImpl dao = new UserDaoImpl();
			System.out.println("Enter  user email for deletion");
			// invoke dao's method
			System.out.println("Status " + dao.deleteUserDetails(sc.next()));
			// clean up dao
			dao.cleanUp();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
