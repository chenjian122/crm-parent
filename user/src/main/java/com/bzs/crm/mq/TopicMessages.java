package com.bzs.crm.mq;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "topic.messages")
public class TopicMessages {
		
	@RabbitHandler
    public void process(String hello) {
        System.out.println("topic.messages : " + hello);
    }

}
