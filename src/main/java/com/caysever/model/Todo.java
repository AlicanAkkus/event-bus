package com.caysever.model;

import java.util.Date;

import com.caysever.utils.DateUtils;

public class Todo {
	String todoName;
	String todoDescription;
	String todoAssignedTo;
	Date todoDueDate;
	
	public String getTodoName() {
		return todoName;
	}
	public String getTodoDescription() {
		return todoDescription;
	}
	public String getTodoAssignedTo() {
		return todoAssignedTo;
	}
	public Date getTodoDueDate() {
		return todoDueDate;
	}
	public void setTodoName(String todoName) {
		this.todoName = todoName;
	}
	public void setTodoDescription(String todoDescription) {
		this.todoDescription = todoDescription;
	}
	public void setTodoAssignedTo(String todoAssignedTo) {
		this.todoAssignedTo = todoAssignedTo;
	}
	public void setTodoDueDate(Date todoDueDate) {
		this.todoDueDate = todoDueDate;
	}
	@Override
	public String toString() {
		return "Todo [todoName=" + todoName + ", todoDescription=" + todoDescription + ", todoAssignedTo=" + todoAssignedTo + ", todoDueDate=" + DateUtils.getFormattedDate(todoDueDate)
				+ "]";
	}
}
