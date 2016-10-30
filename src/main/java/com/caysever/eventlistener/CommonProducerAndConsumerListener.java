package com.caysever.eventlistener;

import com.google.common.eventbus.EventBus;
import com.google.common.eventbus.Subscribe;

public class CommonProducerAndConsumerListener{
	EventBus eventBus = new EventBus();
	
	public void setProducerListener(ProducerListener producerListener) {
		this.eventBus.register(producerListener);
	}
	
	@Subscribe
	public void consumerTriggerListener(Integer number){
		this.eventBus.post(number);
	}
	
}
