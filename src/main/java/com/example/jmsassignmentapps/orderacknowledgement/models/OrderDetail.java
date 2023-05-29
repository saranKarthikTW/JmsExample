package com.example.jmsassignmentapps.orderacknowledgement.models;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDetail implements Serializable {
    @NotNull
    private long orderId;

    @NotBlank(message = "The customer name cannot be empty")
    private String customerName;

    @Email(message = "Invalid email")
    @NotNull(message = "The customer email cannot be empty")
    private String email;

    @NotBlank(message = "The address cannot be empty")
    private String shippingAddress;

    @NotNull(message = "The order must contain items")
    private List<OrderItem> orderItems;

    @Positive
    private int totalAmount;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    @PastOrPresent(message = "The order date cannot be in future")
    private LocalDate orderDate;

    @NotNull(message = "The status cannot be null")
    private OrderStatus status;

    @Override
    public String toString() {
        return "OrderDetail{" +
                "orderId=" + orderId +
                ", customerName='" + customerName + '\'' +
                ", email='" + email + '\'' +
                ", shippingAddress='" + shippingAddress + '\'' +
                ", orderItems=" + orderItems +
                ", totalAmount=" + totalAmount +
                ", orderDate=" + orderDate +
                ", status=" + status +
                '}';
    }
}
