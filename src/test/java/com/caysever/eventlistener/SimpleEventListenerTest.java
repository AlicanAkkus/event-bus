package com.caysever.eventlistener;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import com.caysever.model.Todo;
import com.google.common.eventbus.EventBus;

public class SimpleEventListenerTest {

	EventBus eventBus;
	SimpleEventListener eventListener;
	DeadEventListener deadEventListener;

	@Before
	public void initialize() {
		eventBus = new EventBus();
		eventListener = new SimpleEventListener();
		deadEventListener = new DeadEventListener();

		eventBus.register(deadEventListener);
		//eventBus.register(eventListener);
	}

	@Test
	public void eventListenerTest() throws InterruptedException {

		int i = 0;
		while (i < 10) {
			eventBus.post("New task created. Task no : " + i);
			i++;

			Thread.sleep(1000);
		}
		
		eventBus.unregister(eventListener);
	}
	@Test
	public void complexEventListenerTest() throws InterruptedException {

		int i = 0;
		while (i < 10) {
			Todo todo = new Todo();
			todo.setTodoAssignedTo("çaysever");
			todo.setTodoDescription("some codes required refactoring");
			todo.setTodoName("refactoring");
			todo.setTodoDueDate(new Date());
			eventBus.post(todo);

			Thread.sleep(1000);
			i++;
		}
	}

	//@Test
	public void deadEventListenerTest() throws InterruptedException {
		int i = 0;
		while (i < 10) {
			eventBus.post("New task created. Task no : " + i);
			i++;

			Thread.sleep(1000);
		}
	}

}
