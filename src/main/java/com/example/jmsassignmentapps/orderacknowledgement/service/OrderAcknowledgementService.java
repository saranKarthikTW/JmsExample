package com.example.jmsassignmentapps.orderacknowledgement.service;

import com.example.jmsassignmentapps.orderacknowledgement.models.OrderDetail;
import com.example.jmsassignmentapps.orderacknowledgement.publisher.MessageSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderAcknowledgementService {

    private final MessageSender messageSender;

    @Autowired
    public OrderAcknowledgementService(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    public void shareOrderDetailsToShipmentTracking(OrderDetail orderDetail) {
        messageSender.sendOrderDetail(orderDetail);
    }
}
