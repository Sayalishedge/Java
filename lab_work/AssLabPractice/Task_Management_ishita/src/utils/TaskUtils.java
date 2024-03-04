package utils;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.task.core.*;

import com.task.core.TaskManager;

import custom_exception.TaskHandlingException;

public class TaskUtils {
	
	//add a static method to return list of tasks
	
	 static List<TaskManager>populatetasks() throws TaskHandlingException {
		
		
		//create empty arraylist
		
			List<TaskManager> tasks=new ArrayList<>();
			
			tasks.add(new TaskManager(1, "Read", "Book", parseAndValidateDate("2023-10-16"), parseAndValidateStatus("COMPLETED"), true));
			
			tasks.add(new TaskManager(2, "Eat", "Food", parseAndValidateDate("2024-11-16"), parseAndValidateStatus("IN_PROGRESS"), true));
			
			tasks.add(new TaskManager(3, "Write", "Copy", parseAndValidateDate("2023-01-16"), parseAndValidateStatus("COMPLETED"), true));
			
			tasks.add(new TaskManager(4, "Search", "Google", parseAndValidateDate("2022-02-13"), parseAndValidateStatus("PENDING"), true));
			
			tasks.add(new TaskManager(5, "Sleep", "Eyes", parseAndValidateDate("2009-02-16"), parseAndValidateStatus("COMPLETED"), true));
			
			tasks.add(new TaskManager(6, "Shopping", "Vegetables", parseAndValidateDate("2023-05-16"), parseAndValidateStatus("COMPLETED"), true));
		
			return tasks; 

	 }
	 
	 
	 //add a static method to return map of tasks
	 
	 static Map<Integer, TaskManager> populateTaskMap(List<TaskManager>taskList){
		 
		 //create empty hashmap
		 
		 Map<Integer, TaskManager> map= new HashMap<>();
		 
		 for (TaskManager t : taskList)
			 System.out.println("Put rets "+map.put(t.getTaskID(),t));
		 return map;
		 
	 }
	 
	 
	public static LocalDate parseAndValidateDate(String date) throws TaskHandlingException{
			return LocalDate.parse(date);
		}
	
	// add astatic method to parse String-->ENUM
	
	public static Status parseAndValidateStatus(String status) throws TaskHandlingException{
		return Status.valueOf(status.toUpperCase());
	}
}
