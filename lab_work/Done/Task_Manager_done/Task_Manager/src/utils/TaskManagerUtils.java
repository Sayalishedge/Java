package utils;

import java.time.LocalDate;
import java.util.ArrayList;

import com.taskmanager.core.Task;
import com.taskmanager.core.TaskStatus;

import custom_exception.InvalidInputExceptions;
import static utils.TaskValidationRules.validateAllInputs;

public class TaskManagerUtils {

	// add public static method to remove task details by it's PK (task id )
	public static Task deleteByTaskID(int taskID, ArrayList<Task> list) throws InvalidInputExceptions {
		Task v = new Task(taskID);
		int index = list.indexOf(v);
		if (index == -1)
			throw new InvalidInputExceptions("task not found!!!!");
		// task found
		return list.remove(index);
	}
	
	public static Task findBytaskID(int taskID, ArrayList<Task> list) throws InvalidInputExceptions {
		Task v = new Task(taskID);
		int index = list.indexOf(v);
		if (index == -1)
			throw new InvalidInputExceptions("task not found!!!!");
		return list.get(index);
	}
	 
	public static ArrayList<Task> populateTask() throws InvalidInputExceptions
	{
		ArrayList<Task> list = new ArrayList<>();
		//(int taskID, String taskName, String taskDescription, LocalDate taskDate, TaskStatus status,
				//boolean active)
		list.add(validateAllInputs(1,"Porfolio cases","update cases","2023-09-09","PENDING",true,list));
		list.add(validateAllInputs(2,"Marketing","marketing tasks","2022-03-04","COMPLETED",true,list));
		list.add(validateAllInputs(3,"Designing","designing tasks","2021-11-12","INPROGRESS",true,list));
		return list;//utils class rets populated tasks to tester
	}
	
	
	public static void TodayPendingTasks(ArrayList<Task> list)
	{
		LocalDate now =LocalDate.now();
		System.out.println("Pending Tasks for today:");
		for(Task task:list)
			if(task.getStatus().equals(TaskStatus.PENDING) && (task.getTaskDate().equals(now)))
				System.out.println("Task Id:" + task.getTaskID()+ 
								   "Task Name:" + task.getTaskName() + "Task Date:" + task.getTaskDate());
			else
				System.out.println("No pending Tasks Found!!");
	}
	
	

}
