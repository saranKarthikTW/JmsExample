package com.example.jmsassignmentapps.orderacknowledgement.models;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderItem implements Serializable {
    @NotNull(message = "The product Id cannot be null")
    private Long productId;

    @NotBlank(message = "The product name cannot be empty")
    private String productName;

    @Positive(message = "The price of an item cannot be negative")
    private int unitPrice;

    @Min(value = 1, message = "The quantity must be atleast one")
    private int quantity;

    @Positive
    private int subtotal;
}
