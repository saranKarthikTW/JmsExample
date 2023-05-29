package com.example.jmsassignmentapps.orderacknowledgement.publisher;

import com.example.jmsassignmentapps.orderacknowledgement.models.OrderDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class MessageSender {

    private final JmsTemplate jmsTemplate;
    private final String queue;

    @Autowired
    public MessageSender(JmsTemplate jmsTemplate, @Value(value = "${springjms.myQueue}") String queue) {
        this.jmsTemplate = jmsTemplate;
        this.queue = queue;
    }

    public void sendOrderDetail(OrderDetail orderDetail) {
        jmsTemplate.convertAndSend(queue, orderDetail.toString());
    }
}
