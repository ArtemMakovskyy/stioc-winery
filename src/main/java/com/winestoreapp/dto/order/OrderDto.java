package com.winestoreapp.dto.order;

import com.winestoreapp.dto.order.delivery.information.OrderDeliveryInformationDto;
import com.winestoreapp.dto.shopping.card.ShoppingCardDto;
import com.winestoreapp.model.OrderPaymentStatus;
import java.time.LocalDateTime;
import lombok.Data;

@Data
public class OrderDto {
    private Long id;
    private String orderNumber;
    private Long userId;
    private ShoppingCardDto shoppingCardDto;
    private OrderDeliveryInformationDto orderDeliveryInformationDto;
    private LocalDateTime registrationTime;
    private LocalDateTime completedTime;
    private OrderPaymentStatus paymentStatus;
}
