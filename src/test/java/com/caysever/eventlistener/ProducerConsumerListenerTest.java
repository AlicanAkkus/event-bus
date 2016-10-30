package com.caysever.eventlistener;

import org.junit.Test;

import com.google.common.eventbus.EventBus;

public class ProducerConsumerListenerTest {

	@Test
	public void producerConsumer(){
		CommonProducerAndConsumerListener commonProducerAndConsumerListener = new CommonProducerAndConsumerListener();
		ProducerListener producerListener = new ProducerListener();
		ConsumerListener consumerListener = new ConsumerListener();
		
		commonProducerAndConsumerListener.setProducerListener(producerListener);
		consumerListener.setCommonProducerAndConsumerListener(commonProducerAndConsumerListener);
		producerListener.setConsumerListener(consumerListener);
		
		EventBus eventBus = new EventBus();
		eventBus.register(producerListener);
		
		eventBus.post(Integer.valueOf(1));
	}
	
}
