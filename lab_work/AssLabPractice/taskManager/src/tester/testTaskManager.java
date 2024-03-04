package tester;



import static utils.TaskUtils.parseAndValidateDate;
import static utils.TaskUtils.parseAndValidateStatus;
import static utils.TaskUtils.checkForDuplicate;
import java.util.ArrayList;
import java.util.Scanner;

import core.Status;
import core.Task;

public class testTaskManager {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			
			boolean flag = false;
			while(!flag) {
				
				ArrayList<Task> list = new ArrayList<>();
				
				System.out.println("Options:\n");
				System.out.println("1. Add a new task\n2. Delete Task");
				switch (sc.nextInt()) {
				case 1:
					System.out.println("Enter task name, description, taskdate");
					//String taskName, String description, LocalDate taskDate, Status status, boolean active
					Task t1 = new Task(sc.nextInt(),sc.next(),sc.next(), parseAndValidateDate(sc.next()),Status.PENDING,true);
					list.add(t1);
					System.out.println("Task Added");
					System.out.println();
					
					break;
				case 2:
					System.out.println("Enter id");
					int id1 = sc.nextInt();
					Task t = checkForDuplicate(id1, list);
					
					//System.out.println(list.ge);
					
					break;
					
				case 3:
					System.out.println("Display all Tasks");
					list.forEach(p -> System.out.println(p));
					
					break;
	
				case 0:
					flag = true;
					break;
				}
				
			
			
			
			}	
			
			
		}catch (Exception e) {
			System.out.println(e);
			
		}

	}

}
