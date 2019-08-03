package com.example.demo.Strategy1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderService {
    @Autowired
    HandlerOrderContext handlerOrderContext;

    public void handleOrder(Order order) {
        OrderStrategy orderStrategy = handlerOrderContext.getOrderStrategy(order.getType());
        orderStrategy.handleOrder(order);

    }
}
