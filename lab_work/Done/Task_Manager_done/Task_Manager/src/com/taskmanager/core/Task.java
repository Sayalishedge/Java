package com.taskmanager.core;

import java.time.LocalDate;
import java.util.Objects;

public class Task {

	
	private int taskID;
	private String taskName;
	private String taskDescription;
	private LocalDate taskDate;
	private TaskStatus status;
	private boolean active;
	
	
	//constructor
	public Task(int taskID, String taskName, String taskDescription, LocalDate taskDate, TaskStatus status,
			boolean active) {
		super();
		this.taskID = taskID;
		this.taskName = taskName;
		this.taskDescription = taskDescription;
		this.taskDate = taskDate;
		this.status = status;
		this.active = active;
	}


	@Override
	public String toString() {
		return "Task [taskID=" + taskID + ", taskName=" + taskName + ", taskDescription=" + taskDescription
				+ ", taskDate=" + taskDate + ", status=" + status + ", active=" + active + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(taskID);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Task other = (Task) obj;
		return taskID == other.taskID;
	}


	public Task(int taskID) {
		
		this.taskID = taskID;
	}


	public int getTaskID() {
		return taskID;
	}


	public void setTaskID(int taskID) {
		this.taskID = taskID;
	}


	public String getTaskName() {
		return taskName;
	}


	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}


	public String getTaskDescription() {
		return taskDescription;
	}


	public void setTaskDescription(String taskDescription) {
		this.taskDescription = taskDescription;
	}


	public LocalDate getTaskDate() {
		return taskDate;
	}


	public void setTaskDate(LocalDate taskDate) {
		this.taskDate = taskDate;
	}


	public TaskStatus getStatus() {
		return status;
	}


	public void setStatus(TaskStatus status) {
		this.status = status;
	}


	public boolean isActive() {
		return active;
	}


	public void setActive(boolean active) {
		this.active = active;
	}



	
}
