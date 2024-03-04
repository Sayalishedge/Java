package tester;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import static utils.TaskUtils.*;
import core.Status;
import core.Task;

public class TaskManagement {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			
			ArrayList<Task> list = new ArrayList<>();
			
			
			boolean flag = false;
			while(!flag) {
				
				System.out.println("1.add new task\n"
						+ "2.delete a task\n"
						+ "3,update task status"
						+ "4.display all pending tasks\n"
						+ "5.display all pending tasks for today\n"
						+ "6.display all tasks sorted by date\n"
						+ "7.display all tasks"
						+ "0.exit");
				
				switch (sc.nextInt()) {
					case 1:
						//tring taskName, String description, LocalDate taskDate, Status status, boolean active
						System.out.println("enter taskname,description,localdate");
						Task t = new Task(sc.nextInt(),sc.next(),sc.next(),LocalDate.parse(sc.next()),Status.PENDING,true);
						list.add(t);
						System.out.println("Task Added");
						
						break;
						
						
					case 2:
						System.out.println("enter task id");
						int taskId = sc.nextInt();
						Task t1 = new Task(taskId);
						int index = t1.getTaskID();
						list.remove(index);
						break;
						
					case 3:
						System.out.println("enter task id");
						int taskId1 = sc.nextInt();
						Task t2 = new Task(taskId1);
						index = t2.getTaskID();
						System.out.println("enter the status for updation");
						String status = 	parseAndValidateStatus(sc.next());
				
						list.setBit(index, status);
						
						
						break;
					case 7:
						list.stream()
						.forEach(l -> System.out.println(l));
						
						break;
					case 0:
						flag = true;
						break;
				}
				
				
			}
			
			
			
			
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
