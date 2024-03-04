package tester;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import com.taskmanager.core.Task;
import com.taskmanager.core.TaskStatus;

import custom_ordering.TaskManagerComparator;

import static utils.TaskManagerUtils.*;
import static utils.TaskValidationRules.validateAllInputs;

public class TaskManagerTester {

	public static void main(String[] args) {
		
		try(Scanner sc= new Scanner(System.in))
		{
			
			ArrayList<Task> tasks = populateTask();
			boolean exit=false;
			while(!exit) 
			{
				
				try
				{
					System.out.println("Enter Options:");
					System.out.println("1. Add new Task");
					System.out.println("2. Delete Task");
					System.out.println("3. Update task status");
					System.out.println("4. Display all pending Tasks");
					System.out.println("5. Display all pending tasks for today");
					System.out.println("6. Display all Tasks sorted by date");
					System.out.println("7. Display all Tasks");
					System.out.println("0. Exit");
					
					switch(sc.nextInt())
					{
						case 1:
							System.out.println("Add a new Task");
							System.out.println("Enter task details:taskID,taskName,taskDescription, taskDate,TaskStatus,Active");
							Task task = validateAllInputs(sc.nextInt(),sc.next(),sc.next(),sc.next(),sc.next(),sc.nextBoolean(),tasks);
							tasks.add(task);
							System.out.println("New Task Added Successfully!!!");
							break;
							
						case 2:
							System.out.println("Delete a Task");
							System.out.println("Enter TaskId to delete Task.");
							System.out.println(deleteByTaskID(sc.nextInt(), tasks));
							break;
						
//						case 3:
//							System.out.println("Enter TaskId and Task Status");
//							int taskId = sc.nextInt();
//							TaskStatus taskStatus = sc.next();
//							task= findBytaskID(taskId, tasks);
//							task.setStatus(taskStatus);
//							break;
							
						case 4:
							System.out.println("All Pending Tasks");
							for(Task t:tasks) {
								if(t.getStatus().equals(TaskStatus.PENDING)) {
									System.out.println(t);
								}
							}
							break;
							
						
						case 5:
							System.out.println("Display all pending tasks for today");
							TodayPendingTasks(tasks);
							break;
						
						case 6:
							
							System.out.println("All tasks sorted as per date:");
							Collections.sort(tasks, new TaskManagerComparator());
							
							for(Task t:tasks)
								System.out.println(t);
							break;
							
						case 7:
							System.out.println("All Task Details!!");
							for(Task t:tasks)
								System.out.println(t);
							break;
						
						case 0:
							System.out.println("Byeee");
							exit=true;
							break;
						
							
					}//end of switch
					
					
					
					
				}//end of inner try
				catch(Exception e)
				{
					e.printStackTrace();
				}
				
				
			}//end of while
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}//end of outer try
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
