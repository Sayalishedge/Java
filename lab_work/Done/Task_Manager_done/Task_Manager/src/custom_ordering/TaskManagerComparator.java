package custom_ordering;

import java.util.Comparator;

import com.taskmanager.core.Task;

public class TaskManagerComparator implements Comparator<Task>
{

	public int compare(Task o1, Task o2)
	{
		if(o1.getTaskDate().isBefore(o2.getTaskDate()))
			return -1;
		if(o1.getTaskDate().isEqual(o2.getTaskDate()))
			return 0;
		return 1;
	}
	
}
