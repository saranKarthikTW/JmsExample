package com.example.jmsassignmentapps.shipmenttracking.subscriber;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class OrderDetailListener {

    Logger logger = LoggerFactory.getLogger("Order Detail Application");

    @JmsListener(destination = "${springjms.myQueue}")
    private void receiveOrderDetails(String orderDetail) {
        logger.info("An order detail received: " + orderDetail);
    }
}
