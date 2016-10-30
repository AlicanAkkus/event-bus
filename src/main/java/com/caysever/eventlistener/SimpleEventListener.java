package com.caysever.eventlistener;

import com.caysever.model.Todo;
import com.google.common.eventbus.Subscribe;

public class SimpleEventListener {
	
	@Subscribe
	public void todoTask(String newTask){
		System.out.println(this.getClass().getName() + " new todo task received. Task : " + newTask);
	}
	
	@Subscribe
	public void jobTask(String newTask){
		System.out.println(this.getClass().getName() + " new job task received. Task : " + newTask);
	}
	
	@Subscribe
	public void todoTask(Todo todo){
		System.out.println(this.getClass().getName() + " received new todo. Todo details;\n" + todo);
	}
}
