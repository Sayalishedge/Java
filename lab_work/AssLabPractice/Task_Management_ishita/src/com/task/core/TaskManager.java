package com.task.core;

import java.time.LocalDate;

public class TaskManager {
	private static int taskID=1;
	private String taskName;
	private String descr;
	private LocalDate taskDate;
	private Status status;
	private boolean active=true;
	
	
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


	public TaskManager(int taskID, String taskName, String descr, LocalDate taskDate, Status status, boolean active) {
		super();
		this.taskID = taskID++;
		this.taskName = taskName;
		this.descr = descr;
		this.taskDate = taskDate;
		this.status = status;
		this.active = active;
	}


	@Override
	public String toString() {
		return "TaskManager [taskName=" + taskName + ", descr=" + descr + ", taskDate=" + taskDate + ", status="
				+ status + ", active=" + active + "]";
	}
	
	
}
