package com.bzs.crm.mq;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "topic.message")
public class TopicMessage {
		
	@RabbitHandler
    public void process(String hello) throws InterruptedException {
        System.out.println("topic.message : " + hello);
    }

}
