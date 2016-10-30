package com.caysever.eventlistener;

import java.util.Random;

import com.google.common.eventbus.EventBus;
import com.google.common.eventbus.Subscribe;

public class ConsumerListener {
	EventBus consumerBus = new EventBus();
	Random random = new Random();
	
	public void setCommonProducerAndConsumerListener(CommonProducerAndConsumerListener commonProducerAndConsumerListener) {
		this.consumerBus.register(commonProducerAndConsumerListener);
	}
	
	@Subscribe
	public void consumerListener(String item){
		System.err.println("New item received. " + item);
		
		//trigger new item.
		this.consumerBus.post(Integer.valueOf(random.nextInt(100)));
	}

}
