package com.example.demo.Strategy1;

import org.springframework.stereotype.Component;


@Component
@HandlerOrderType(Order.HALF)
public class HalfOrderStrategy implements OrderStrategy {
    @Override
    public void handleOrder(Order order) {
        System.out.println("----处理半价订单----");
    }
}