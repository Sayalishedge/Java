package core;

import java.time.LocalDate;

public class Task {
	
	@SuppressWarnings("unused")
	private int taskID;
	private String taskName;
	private String description;
	private LocalDate taskDate;
	private Status status;
	private boolean active;
	
	
	@SuppressWarnings("static-access")
	public Task(int taskID,String taskName, String description, LocalDate taskDate, Status status, boolean active) {
		super();
		this.taskID = taskID;
		this.taskName = taskName;
		this.description = description;
		this.taskDate = taskDate;
		this.status = status;
		this.active = active;
	}


	

	public Task(int taskID) {
		taskID = this.taskID;
		// TODO Auto-generated constructor stub
	}




	public int getTaskID() {
		return taskID;
	}


	public void setTaskID(int taskID) {
		this.taskID = taskID;
	}


	@Override
	public String toString() {
		return "Task [task id " + taskID+ " taskName=" + taskName + ", description=" + description + ", taskDate=" + taskDate + ", status="
				+ status + ", active=" + active + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}




	public Status getStatus() {
		return status;
	}




	public void setStatus(Status status) {
		this.status = status;
	}
	
	
	
	
	

}
