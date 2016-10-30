package com.caysever.eventlistener;

import com.google.common.eventbus.EventBus;
import com.google.common.eventbus.Subscribe;

public class ProducerListener {
	EventBus producerBus = new EventBus();
	ConsumerListener consumerListener;
	
	private int count = 0;
	public void setConsumerListener(ConsumerListener consumerListener) {
		this.consumerListener = consumerListener;
		this.producerBus.register(consumerListener);
	}
	
	@Subscribe
	public void producer(Integer number){
		if(count == 100){
			this.producerBus.unregister(consumerListener);
			System.err.println("*********Producer Finished.*********");
		}else{
			String newItem = "Item : " + number;
			System.out.println("Created new item -> " + newItem);
			this.producerBus.post(newItem);
			
			count++;
		}
	}
	
}
