package com.example.jmsassignmentapps.orderacknowledgement.controller;

import com.example.jmsassignmentapps.orderacknowledgement.models.OrderDetail;
import com.example.jmsassignmentapps.orderacknowledgement.service.OrderAcknowledgementService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Validated
public class OrderAcknowledgementController {
    private final OrderAcknowledgementService orderAcknowledgementService;

    @Autowired
    public OrderAcknowledgementController(OrderAcknowledgementService orderAcknowledgementService) {
        this.orderAcknowledgementService = orderAcknowledgementService;
    }

    @PostMapping("/OrderDetails")
    public void orderDetailsToShipmentTracking(@Valid @RequestBody OrderDetail orderDetail) {
        orderAcknowledgementService.shareOrderDetailsToShipmentTracking(orderDetail);
    }

}
