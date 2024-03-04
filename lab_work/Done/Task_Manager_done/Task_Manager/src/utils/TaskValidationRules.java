package utils;

import static java.time.LocalDate.parse;

import java.time.LocalDate;
import java.util.ArrayList;

import com.taskmanager.core.*;
import com.taskmanager.core.Task;
import com.taskmanager.core.TaskStatus;
import custom_exception.InvalidInputExceptions;



public class TaskValidationRules {
	
	
	public static LocalDate parseTaskDate(String date) throws InvalidInputExceptions
	{
		LocalDate d1 = parse(date);
		return d1;
	}
	// add a static method for parsing n validation taskstatus
	public static TaskStatus parseAndValidate(String sts) throws IllegalArgumentException 
	{
		return TaskStatus.valueOf(sts.toUpperCase());
	}

	
	// add a static method for checking the dups
	public static void checkForDup(int newtaskID, ArrayList<Task> tasks) throws InvalidInputExceptions 
	{
		// create a new task instance : wrapping PK (prim key) : unique ID
		Task  nTask = new Task(newtaskID);
		if(tasks.contains(nTask))
		{
					throw new InvalidInputExceptions("Dup taskID !"); 		//=> no dup found..
		}
		else
		{
		System.out.println("no duplicate taskID ....");
		}
	}
	
	
	//add a static method to validate all i/ps
			//In case of success -- return the task ref to the caller 
			//o.w throw the exception
			public static Task validateAllInputs(int taskID,String taskName,String taskDescription,String taskDate,String status,
					Boolean active,ArrayList<Task> TaskManager) throws InvalidInputExceptions
			{
				checkForDup(taskID, TaskManager);
				TaskStatus sts=parseAndValidate(status);
				LocalDate date = parseTaskDate(taskDate);
				//=> all validations successful !
				return new Task(taskID, taskName, taskDescription, date, sts, active);
			}
			
	
	
}
